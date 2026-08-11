package day10;

public class Practic12 {
    public static void main(String[] args) {
        // [문제 1]
        Student s1 = new Student();
        s1.name = "ys";
        s1.studentId = 123;
        System.out.println(s1.name + s1.studentId);

        // [문제 2]
        Cat cat = new Cat();
        cat.makeSound();

        // [문제 3]
        Computer c1 = new Computer();

        // [문제 4]
        Figure f1 = new Triangle(); // Triangle 클래스가 상위 클래스라서 
                                    // Triangle 인스턴스를 생성할때 Figure도 포함되기 때문에

        // [문제 5]
        Shape shape = new Circle();
        shape.draw();       // Circle 객체를 shape 타입 변수에 저장을 했기 때문에
                            // draw() 메소드를 호출 했을때 shape 클래스가 아닌 
                            // circle 클래스에 있는 재정의된 draw()가 호출된다.

        // [문제 6]
        Vehicle vehicle = new Bus();
        if(vehicle instanceof Bus) {
            ( (Bus)vehicle ).checkFare();
        } 

        // [문제 7]
        Beverage b1 [] = new Beverage[2];
        b1[0] = new Coke();
        b1[1] = new Coffee();

        for(Beverage i : b1){
            i.drink();
        }

        // [문제 8]
        Sword sword = new Sword();
        Gun gun = new Gun();
        Character character1 = new Character();
        character1.use(gun);
        character1.use(sword);

        // [문제 9]
        SuperClass obj = new SubClass();
        System.out.println(obj.name);
        obj.method();       // 메소드는 오버라이딩 되어서 "하위 메소드"가 출력되고
                            // 필드는 그렇지 않기때문에 "상위"가 출력됨

        // [문제 10]
        Laptop laptop = new Laptop();
        System.out.println(laptop instanceof Electronic);
        System.out.println(laptop instanceof Device);
    }
}

class Device {}
class Electronic extends Device { }
class Laptop extends Electronic { }

class SuperClass {
    String name = "상위";
    void method(){System.out.println("상위 메소드");}
}

class SubClass extends SuperClass {
    String name = "하위";
    void method(){System.out.println("하위 메소드");}
}

class Character {
    void use(Weapon weapon) {weapon.attack();}
}

class Weapon { 
    void attack() { System.out.println( "무기로 공격");}
}
class Sword extends Weapon {
    @Override
    void attack() { System.out.println( "검으로 공격");}
}

class Gun extends Weapon {
    @Override
    void attack() { System.out.println("총으로 공격");}
}

class Coke extends Beverage {
    @Override
    void drink() { System.out.println("콜라 냠냠");}
}

class Coffee extends Beverage {
    @Override
    void drink() { System.out.println("커피 냠냠");}
}

class Beverage {
    void drink() { System.out.println("음료마심");}
}

class Vehicle { }
class Bus extends Vehicle { 
    void checkFare() {System.out.println("요금확인");}
}

class Shape {
    void draw() { System.out.println("도형 그림");}
}

class Circle extends Shape {
    @Override
    void draw() { System.out.println("원을 그림");}
}

class Figure {  }
class Triangle extends Figure { }

class Machine {
    Machine() { System.out.println("부모클래스 생성자 실행");}
}

class Computer extends Machine {
    Computer() { System.out.println("자식 클래스 ..");}
}

class Animal {
    void makeSound() { System.out.println("동물이 소리를 냅니다.");}
}

class Cat extends Animal {
    @Override
    void makeSound() {System.out.println("야옹");}
}

class Person {
    String name;
}

class Student extends Person {
    int studentId;
}