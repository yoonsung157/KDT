package day04;

import java.util.Arrays;

public class Exam3 {
    public static void main(String[] args) {
        /*
            JAVA배열 : *동일한타입*의 여러 자료들을 순서(인덱스)대로 저장하는 *타입*
            선언 : 2가지
                - 타입[ ] 변수명 = new 타입명[ 총개수 ];       
                - 타입[ ] 변수명 = { 초기값, 초기값, 초기값 }; 
            특징 : 1) 동일한 타입끼리  2) 고정(정적)길이  3) 요소초기값(자동) 정수: 0, 실수: 0.0, 논리: false, 객체: null
            인덱스 : 요소(자료)들이 저장되는 순서 번호, 0번 시작
            배열내 요소 확인:
                1) 배열변수                         : 배열 주소값
                2) Arrays.toString( 배열변수 )      : 배열 내 요소 확인 
        */
       // [1] 배열의 선언
       int [ ] arry1 = new int [ 3 ];                   // int형 3개 저장 가능한 배열 선언
       System.out.println( arry1 );                     // I@372f7a8d 배열(객체)의 메모리 주소값
       System.out.println( Arrays.toString( arry1 ) );  // [ 0, 0, 0 ] 배열내 요소들의 자동 초기화


    } // main end
} // class end
