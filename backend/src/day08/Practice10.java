package day08;

public class Practice10 {
    public static void main(String[] args) {
        // [문제 1]
        Member member = new Member();
        member.setId("admin");
        System.out.println(member.getId() );

        // [문제 2]
        Score score = new Score();
        score.setScore(85);
        System.out.println(score.getScore());
        score.setScore(120);
        System.out.println(score.getScore());

        // [문제 3]
        BankAccount account = new BankAccount("123-456");
        System.out.println(account.getAccountNumber() );

        // [문제 4]
        CircleCalculator calculator = new CircleCalculator();
        calculator.printCircleArea(5);

        // [문제 5]
        TicketMachine machine1 = new TicketMachine();
        TicketMachine machine2 = new TicketMachine();
        TicketMachine machine3 = new TicketMachine();

        machine1.issueTicket(); machine1.issueTicket();;
        machine2.issueTicket();
        TicketMachine.printTotalTicket();

        // [문제 6]
        System.out.println(GameConfig.GAME_TITLE);
        System.out.println(GameConfig.MAX_HP);
        System.out.println(GameConfig.MAX_LEVEL);
    } // main end
} // class end

class GameConfig {
    public static final int MAX_LEVEL = 99;
    public static final int MAX_HP = 10000;
    public static final String GAME_TITLE = "My RPG";
}

class TicketMachine {
    static int totalTickets = 0;
    void issueTicket() {
        totalTickets++;
        System.out.println("티켓 1장 발권");
    }
    static void printTotalTicket(){
        System.out.println(totalTickets);
    }
}

class CircleCalculator {
    final double PI = 3.14159;
    void printCircleArea(int r) {
        System.out.println(r * r * PI);
    }
}

class BankAccount {
    private String accountNumber;
    BankAccount(String accountNumber){ 
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
}

class Score {
    private int score;
    void setScore(int score){
        if( score >= 0 && score <= 100){ this.score = score ;}
        else { System.out.println("유효하지 않은 점수입니다.");}
    }
    public int getScore() {
        return score;
    }
}

class Member {
    private String id;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
}