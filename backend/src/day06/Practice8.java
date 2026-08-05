package day06;


class Book {
    String title; String author; int price;
    Book( String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Rectangle {
    int width; int height;
    Rectangle( int width, int height){
        this.width = width;
        this.height = height;
    }
    int getArea(int width, int height) {
        return width * height;
    }
}

class BankAccount {
    String accountNumber; String ownerName; int balance;
    BankAccount( String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    int deposit(int money) {
        balance += money;
        return balance;
    }
    int withdraw(int money) {
        balance -= money;
        return balance;
    }
}

class Goods {
    String name; int price;
    Goods(){ price = 0;}
    Goods( String name, int price){
        this.name = name;
        this.price = price;
    }
}

class Member {
    String id; boolean isLogin;
    Member() { id = "guest"; isLogin = false;}
}
public class Practice8 {
    public static void main(String[] args) {
        // [문제 1]
        // Book b1 = new Book("이것이 자바다", "신용권", 30000);
        // Book b2 = new Book("자바의 정석", "남궁성", 28000);
            
        // System.out.println(b1.title + b1.author + b1.price);
        // System.out.println(b2.title + b2.author + b2.price);

        // [문제 2]
        // Rectangle r1 = new Rectangle(10, 5);
        // System.out.println(r1.getArea(10, 5) );

        // [문제 3]
        // BankAccount b1 = new BankAccount("111-222-3333", "유재석", 10000);

        // b1.deposit(5000);
        // b1.withdraw(3000);
        // System.out.println(b1.balance);
        
        // [문제 4]
        // Goods g1 = new Goods();
        // Goods g2 = new Goods("콜라", 2000);
        // System.out.println(g1.name + g1.price);
        // System.out.println(g2.name + g2.price);

        // [문제 5]
        Member m1 = new Member();
        System.out.println(m1.id + m1.isLogin);

    } // main end
} // class end
