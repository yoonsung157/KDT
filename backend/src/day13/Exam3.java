package day13;

public class Exam3 {
    public static void main(String[] args) {
        // 1. 문자열은 배열이다.
        char str1 = '유';
        char[ ] str2 = { '유', '재', '석'};
        String str3 = "유재석";
        // 2. 문자 변환, 아스키코드(일부특수문자+영문) + 유니코드(여러개언어지원)
        char str4 = 65;     System.out.println( str4 ); // A
        char[] str5 = { 74, 65, 86, 65 }; System.out.println( str5 ); // JAVA
        // 3. 문자열 비교
        System.out.println("유재석" == "유재석" ); // true
        System.out.println( new String("유재석") == "유재석" ); // false
        System.out.println( new String("유재석").equals("유재석")); // true
        // 4. 
        String str7 = "자바";       String str8 = "프로그래밍";
        System.out.println(str7.concat( str8 ) ); // 자바프로그래밍
        System.out.println( str7 + str8 ); // 자바프로그래밍
        // 5. 
        String