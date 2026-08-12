package day11;

/*
    기본타입(리터럴) : (8) byte, short, int, long, float, double, char, boolean
    참조타입(객체) : [ ]배열, 클래스( String, Dto, Scanner 등등 ) 
*/
// 1. 인터페이스 만들기, interface 인터페이스명
// 2. 인터페이스 주요멤버 : 상수(public static final), 추상메소드
interface ExamInterFace{
    int a = 10; // 상수!, 인터페이스에서는 public static final 생략해도 상수이다.
    public static final int b =20;
    // * 생성자 없다. 즉) new 없다 --> 인스턴스 불가능, 목적: 여러 인스턴스 호환/관리
    // ** 추상메소드 : 선언부만 존재하고 { } 구현부가 없는 메소드
    void method1( int x );
    public abstract int method2 ( int x, int y );
}

public class Exam1 {
    
}
