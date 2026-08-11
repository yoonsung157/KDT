package day10;

public class Exam2 {
    public static void main(String[] args) {
        
        // [1] 자바는 100% 객체지향언어이다.
        // Object(슈퍼클래스) 클래스로부터 모든 클래스는 상속관계
        // 1. A
        A a = new A(); // 총 2개, A ---> object
        // 2.
        B b = new B(); // 총 3개, B -> A -> object
        // 3.
        C c = new C(); // 총 3개, C -> A -> object
        // 4. 
        D d = new D(); // 총 4개, D -> B -> A -> object
        // 5.
        E e = new E(); // 총 4개, E -> C -> A -> object

        // [2] 자동타입변환
        A a2 = b; // B --> A  [가능]
        Object o1 = a2; // A --> Object [가능]

        // [3] 강제타입변환 / 다운캐스팅
        B b2 = (B)a2;   // A --> B [가능]
        
        // [4] 타입확인, 인스턴스 instanceOf 타입명
        System.out.println( e instanceof Object );   // true
        System.out.println( e instanceof C );        // true
        // System.out.println( e instanceof D );     // false
        // System.out.println( e instanceof B );     // false
        
        // 타입변환 전에 instanceOf 키워드 활용하여 타입 확인 후 타입 변환


    } // main end
} // class end


class A {
    A() { System.out.println("[1] A 객체 생성" );}
}

class B extends A {
    B() { System.out.println( "[2] B 객체 생성");}
}

class C extends A {
    C() { System.out.println("[3] C 객체 생성");}
}

class D extends B {
    D() { System.out.println("[4] D 객체 생성");}
}

class E extends C {
    E() { System.out.println("[5] ");}
}