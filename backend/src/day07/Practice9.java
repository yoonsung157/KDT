package day07;

class Printer {
    void printMessage() {
        System.out.println("ㅎㅇ 메소드");
    }
}

class Greeter {
    void greet(String name){
        System.out.printf("안녕하세요, %s님!\n", name);
    }
}

class SimpleCalculator {
    int add( int num1, int num2 ){
        return num1 + num2;
    }
}

class Checker {
    boolean isEven(int num){
        return num % 2 == 0 ? true : false;
    }
}

class Lamp {
    boolean isOn;
    void turnOn() { isOn = true; } 
    void turnOff() {isOn = false; }
}

class Product {
    String name; int stock;
    boolean sell( int amount ){
        stock -= amount;
        return stock > 0 ? true : false;
    }
}

class Visualizer {
    String getStars(int num){
        String star = "";
        for (int i = 0; i < num; i++){ star += "★";}
        return star;
    }
}

class ParkingLot {
    int calculateFee(int time){
        int fee = 0;
        if(time <= 30){fee = 1000;}
        else { fee = (time - 30) /10 * 500 + 1000;}
        return fee > 20000 ? 20000 : fee; 
    }
}
/* ====================================================== */
public class Practice9 {
    public static void main(String[] args) {
        // [문제 1]
        Printer p1 = new Printer();
        p1.printMessage();
        
        // [문제 2]
        Greeter g1 = new Greeter();
        g1.greet("윤성");

        // [문제 3]
        SimpleCalculator s1 = new SimpleCalculator();
        int result = s1.add(5,8);
        System.out.println(result);

        // [문제 4]
        Checker c1 = new Checker();
        if ( c1.isEven(2) ) {
            System.out.println("짝수");
        }
        else { System.out.println("홀수");}

        // [문제 5]
        Lamp l1 = new Lamp();
        l1.turnOn(); System.out.println(l1.isOn);
        l1.turnOff(); System.out.println(l1.isOn);
        
        // [문제 6]
        Product product = new Product();
        product.stock = 10;
        System.out.println(product.sell(5));
        System.out.println(product.sell(8));

        // [문제 7]
        Visualizer v1 = new Visualizer();
        System.out.println(v1.getStars(5));

        // [문제 8]
        ParkingLot pp1 = new ParkingLot();
        System.out.println(pp1.calculateFee(65));
        System.out.println(pp1.calculateFee(140));
    }
}
