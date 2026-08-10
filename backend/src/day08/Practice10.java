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

    } // main end
} // class end

class BankAccount {
    private String accountNumber;
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