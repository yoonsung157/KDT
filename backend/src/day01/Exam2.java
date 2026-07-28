

package day01;
public class Exam2 {
    public static void main(String[] args) {
        
        // [2] 리터럴 : 상수
        System.out.println(3);
        System.out.println(3.14);
        System.out.println('유'); // '작은따옴표 : 문자( 한글자 )
        System.out.println("유재석"); // 큰따옴표 : 문자열 ( 두 글자 이상 )
        System.out.println(true);
        // [3] 자료타입 / 자료형 : 자료(데이터) 효율적으로 분류하는 방법
        // * 효율이란? 자료 크기에 따라 적당한 타입(크기) 선정하여 빈공간(여백) 줄이기
        // C/JAVA 정적(직접) 타입 vs PY/JS 동적(자동) 타입
        // 1) boolean : true 또는 false 저장하는 타입 , 1byte
        boolean bool1 = true; // let/const --> bollean
        System.out.println(bool1);
        // 2) char : 작은따옴표로 감싼 문자 1개를 저장하는 타입 , 2byte, 유니코드
        char ch1 = 'A'; // 문자 ( 한 글자 )
        // 3) String : 큰따옴표로 감싼 문자 N개 저장하는 타입 , N * 2 byte , 객체(문자열)
        String str1 = "ABC";
        System.out.println(ch1);
        System.out.println(str1);

        // ==== 정수 ====
        // 4) byte : -128 ~ 127 저장하는 타입 , 1byte
        byte b1 = 100; System.out.println( b1 );
        // 5) short : +- 3만정도 , 2byte
        short sh1 = 30000; System.out.println(sh1);
        // 6) int : += 21억 정도 , 4byte, **** (정수) 리터럴 타입 ****
        int i1 = 2000000000; System.out.println(i1);
        // 7) long : += 21억 이상 , 8byte
        long l1 = 20000000000L; System.out.println(l1); // 뒤에 L을 붙여야 함.
        // ==== 실수 ====
        // 8) float : 소수점 8자리까지 표현 가능, 4byte, * 키보드로부터 입력받은 실수는 double 이므로 F
        float f1 = 0.123456789123456789F; System.out.println(f1);
        // 9) double : 소수점 17자리까지 표현 가능, 8byte
        double d1 = 0.123456789123456789; System.out.println(d1);

        // 8가지 타입 ( 기본타입, 리터럴 저장 )
        // vs 그 외(String) 타입 ( 참조타입, 객체/배열/인터페이스 등등 )
    } 
}
