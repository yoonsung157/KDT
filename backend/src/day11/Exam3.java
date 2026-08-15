package day11;

public class Exam3 {
    public static void main(String[] args) {
        // 1.
        Car myCar = new Car();
        // myCar.run(); // because this.tire is null
        // 2.
        // myCar.tire = new Tire();  // [오류] 인터페이스로 객체생성 불가능
        // 3.
        myCar.tire = new HankokTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
        System.out.println(myCar.tire instanceof Tire); // true
        System.out.println(myCar.tire instanceof KumhoTire);  // true
        System.out.println(myCar.tire instanceof HankokTire);  // false
        
    } // main end
} // class end

class Car{
    Tire tire;
    void run( ) { this.tire.roll(); }
}

interface Tire {
    void roll();    // { } 없는 메소드는 추상메소드
}

// 구현체
class HankokTire implements Tire{
    @Override
    public void roll() {
        System.out.println("한국타이어");          
    }
}
class KumhoTire implements Tire {
    @Override
    public void roll() {
        System.out.println("금호타이어");
    }
}