/*
    .java 파일 만들기
    1. src 폴더내 오른쪽 클릭
    2. [new java file] -> [class]
    3. 첫글자를 대문자로 클래스명 입력
*/


package day01; // 패키지(폴더명)이면서 클래스의 위치 식별 용도

public class Exam1 {
    // public : 공개용, 다른 패키지에서도 사용 가능한 클래스 라는 의미
    // class : 클래스 선언 사용하는 키워드
    // Exam: 클래스명은 아무거나, 단) 첫 글자는 대문자
        // * 클래스 : 자바에서의 가장 최소 컴파일 단위
    // ** [ 클래스 안/main함수 밖] 선언/만들기만 가능 **

    // [1] 자바 실행 시작점 생성, main함수(스레드)
    // m + 엔터
    int a = 10; // 가능
    public static void main(String[] args) {
        // ** [main함수 안] 선언/만들기, 실행문 가능 **
        int b = 10; // 가능
        // so + 엔터 : System.out.printlin( );
        System.out.println("안녕자바");
    }
}   
