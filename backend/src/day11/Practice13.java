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
        if( duck2 instanceof Flyable ) { duck2 = (Flyable)duck2; }
        else if( duck2 instanceof Swimmable ) { duck2 = (Swimmable)duck2; }
        
        duck2

    } // main end
} // class end

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