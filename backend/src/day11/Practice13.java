package day11;

public class Practice13 {
    public static void main(String[] args) {
        // [문제 1]
        Cat cat = new Cat();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        // [문제 2]
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

        // [문제 3]
        Sword sword = new Sword();
        Gun gun = new Gun();
        Character character = new Character();
        character.useWeapon(sword);
        character.useWeapon(gun);

        // [문제 4]
        Duck duck = new Duck();
        duck.fly();
        duck.swim();

        // [문제 5]
        Object duck2 = new Duck();
        if( duck2 instanceof Flyable ) {( (Flyable)duck2 ).fly();}
        else if( duck2 instanceof Swimmable ) {( (Swimmable)duck2 ).swim(); }

        // [문제 6]
        DataAccessObject dao = new OracleDao();
        dao.save();
        dao = new MySqlDao();
        dao.save();

        // [문제 7]
        Greeting g = new Greeting() {
            public void welcome() { System.out.println("환영합니다."); }
        };
        g.welcome();

        // [문제 8]
        Television t1 = new Television();
        t1.turnOff(); t1.turnOn(); t1.setMute(false);

        // [문제 9]
        Calculator c1 = new Calculator() {
            public int plus(int x, int y) {
                return x + y;
            }
        };

        System.out.println(c1.plus(10,20) );

    } // main end
} // class end

interface Calculator {
    int plus(int x, int y);
}

class Television implements Device {
    @Override
    public void turnOn() { System.out.println("켬");}

    @Override
    public void turnOff() { System.out.println("끔"); }

}

interface Device {
    public default void setMute(boolean mute) { System.out.println("무음 처리합니다.");}
    void turnOn();
    void turnOff();
}

interface Greeting {
    void welcome();
}

class MySqlDao implements DataAccessObject {
    @Override
    public void save() { System.out.println("MySQL DB에 저장");}
}

class OracleDao implements DataAccessObject {
    @Override
    public void save() { System.out.println("Oracle DB에 저장"); }
}

interface DataAccessObject {
    void save();
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("하늘날기");
    }
    @Override
    public void swim() {
        System.out.println("수영하기");
    }
}

interface Attackable {
    void attack();
}

class Sword implements Attackable {
    @Override
    public void attack() {
        System.out.println("칼");
    }
}

class Gun implements Attackable {
    @Override
    public void attack() {
        System.out.println("총");
    }
}

class Character {
    void useWeapon(Attackable weapon) {
        weapon.attack();
    }
}


interface RemoteControl {
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;
}

interface Soundable { void makeSound(); }
class Cat implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

class Dog implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}