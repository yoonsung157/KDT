package day13;

import java.util.Arrays;

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
        // 4. 문자열A.concat(문자열8) , 문자열 연결, 연결된 새로운 문자열 문자열 반환 ( 주소값 생성 )
        String str7 = "자바";       String str8 = "프로그래밍";
        System.out.println(str7.concat( str8 ) ); // 자바프로그래밍
        System.out.println( str7 + str8 ); // 자바프로그래밍
        // 5. StringBuilder, append( ), 문자열은 불변(수정금지)이다. 빌더주소값 1개 지정하여 새로운 문자열 
        StringBuilder builder = new StringBuilder();
        builder.append( str7 );
        builder.append( str8 );
        System.out.println( builder ); // 자바프로그래밍
        // 6. .chatAt( 인덱스 )
        String str9 = "자바프로그래밍";     System.out.println( str9.charAt( 2 ) ); // 프
        // 7. .length() : 문자열내 문자 개수 반환
        System.out.println( str9.length() );
        // 8. .replace( 기존문자, 새로운문자 ) : 만일 기존문자가 존재하면 새로운문자로 치환하여 반환
        System.out.println( str9.replace("자바", "java") ); // JAVA프로그래밍
        // 9. .substring( 시작인덱스, 끝인덱스 ), 시작인덱스부터 끝인덱스 전까지 문자열 추출
        String str10 = "123456-2456184";
        System.out.println( str10.substring(7));
        System.out.println( str10.substring(2,6));
        // 10. .split ( 기준문자 ), 기준문자 기준으로 문자열 분해하여 배열 반환
        System.out.println( str10.split("-"));  // [Ljava.lang.String;@4f023edb
        String[ ] strAry = str10.split("-");
        System.out.println( strAry[0] );
        System.out.println( strAry[1] );
        // 11. .indexOf( 찾을문자 ) , 만일 찾을 문자가 존재하면 인덱스, 없으면 -1
        //     .contains( 찾을문자 ) , 만일 찾을 문자가 존재하면 true, 없으면 false
        System.out.println( "자바 프로그래밍 언어".indexOf("프로") ); // 3
        System.out.println( "자바 프로그래미 언어".contains( "프로") ); // true
        // 12. .getBytes() , 문자열내 문자들을 바이트 배열로 반환 "파일처리/네트워크"
        byte[ ] strAry2 = "ABC".getBytes();
        System.out.println( Arrays.toString(strAry2) ); // "ABC" --> [65, 66, 67]
        System.out.println( new String( strAry2) );


    }
}
