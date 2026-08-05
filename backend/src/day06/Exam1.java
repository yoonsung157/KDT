package day06;

public class Exam1 {
    public static void main(String[] args) {
        /*
            생성자 : 인스턴스(객체) 생성할 때 초기화
            선언하는 방법 
                1) 클래스 내부
                2) 클래스명과 동일!
                3) 오버로딩 지원: 동일한 이름으로 여러개 선언, 조건
            목적 : 1) 빠른 초기화 2) 객체생성 규칙/유효성검사
            종류 : 1) 기본생성자(매개변수없는) 2) 매개변수있는생성자
        */    

        // [1] 기본생성자로 객체 생성 , new 생성자명( )
        Phone p1 = new Phone( );
        p1.model = "갤럭시"; // 객체내 멤버변수 값 대입 

        // [2] 정의생성자로 객체 생성 , new 생성자명( 값1, 값2 );
        Phone p2 = new Phone( "아이폰" , "파랑");

        // [3] 정의생성자로 객체 생성 
        Phone p3 = new Phone("갤럭시탭", "블랙", 30000);



    } // main end 
} // class end 

class Phone{
    // *** 클래스 가족(멤버들) ***
    // 1. 멤버변수
    String model;       String color;       int price;
    // 2. 생성자
    // * 생성자가 1개 없으면 *자동으로 기본생성자* 생성
    // * 생성자명은 중복이 안된다. 
    //   -> 오버로딩(매개변수 개수/타입/순서 다르면) 중복 가능
    // * this란? 즉] 멤버변수식별 키워드, 
    //  -> 매개변수명 와 멤버변수명 같을 경우 멤버변수명 앞에 this
    // * 매개변수 와 인자값의 타입/개수 일치!! *
    // * 메소드와 다르게 생성자는 반환이 없다.( 생성된 객체주소값 반환)
    // 1) 기본생성자 : 매개변수가 없는
    Phone( ){ }
    // 2) 정의생성자 : 매개변수가 있는 ㄴ
    Phone( String model , String color ){
        this.model = model;
        this.color = color;
    }
    // 3)
    Phone( String model , String color , int 가격 ){
        this.model = model;
        this.color = color;
        price = 가격;
    }
    // 3. 메소드/함수
}