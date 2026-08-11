package day10;

public class Exam1 {
    public static void main(String[] args) {

        // 1. 동물객체 생성
        동물 animal1 = new 동물();  // 생성자 실행
        animal1.name = "강아지";    // 멤버변수 접근
        animal1.show();             // 메소드 실행

        // 2. 조류객체 생성
        조류 bird1 = new 조류();    // 조류생성자 + 동물생성자 실행
        bird1.name = "비둘기";      // 동물 멤버변수 접근
        bird1.show();               // 동물 메소드 실행
        // 즉) 하위/자식 클래스의 객체는 상위/부모 클래스의 멤버(변수/메소드)를 사용할 수 있다.
        // 3. 참새객체 생성
        참새 sparrow1 = new 참새();
        sparrow1.name = "참새";
        sparrow1.show();
        // 4. 닭 객체 생성
        닭 chicken1 = new 닭();     // 닭생성자 + 조류생성자 + 동물생성자
        chicken1.name = "닭";
        chicken1.show();
        // 즉) 상위 클래스가 먼저 생성되고 하위 클래스 객체가 생성된다.
        
        // ---------- 다형성 ----------------
        // *하나의 자료*가 다양한 형(형식/모양/형태/구분) 성질
        // 1. 참새타입에서 조류 타입 될까??
        // 가능한이유: 1) 상속관계(논리) 2) (물리)
        조류 bird2 = sparrow1;
        // 2. 참새타입에서 동물타입으로 될까??
        동물 animal2 = sparrow1;  // 업캐스팅
        // 3. 동물타입에서 참새타입으로 될까? 주의!!!!!!!!!!!!!!!!1
        // 주의할점: 1) 변환할 타입명시 2) 변환할 자료가 변환할타입 포함하는지?
        참새 spparow2 = (참새)animal2;  // 강제타입변환 / 다운캐스팅(내려가기)
        // 4. 동물 타입에서 참새타입으로 될까? 주의!!!!!!!!!!!!!!!!!!
        // 자식이 태어날때 부모도 태어나지만 자식은 태어나지 않는다. 
        참새 sparrow3 = (참새)animal1; // 오류발생 - 동물1 태어날때 참새가 생성되지 않았다.
    } // main end
} // class end

class 동물 { // 부모 클래스
    String name;    // 멤버변수
    동물(){         // 생성자
        System.out.println("동물 탄생");
    }
    void show(){    // 메소드
        System.out.println("동물입니다.");
    }    
}

class 조류 extends 동물 { }       // 하위클래스명 extends 상위클래스명 { }
class 참새 extends 조류 { }
class 닭 extends 조류 { }

/*
    * 가계부 *
       동물
       |
       조류
    |        |
   참새      닭
*/