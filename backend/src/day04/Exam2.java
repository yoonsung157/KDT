package day04;

public class Exam2 {
    public static void main(String[] args) {

        // 1. for( 초기값 ; 조건문 ; 증감식 ){ 실행문; }
        // 중첩for : for( ){ for(){ } }
        for( int 단 = 2 ; 단 <= 9 ; 단++ ){
            for( int 곱 = 1 ; 곱 <= 9 ; 곱++ ){
                System.out.printf( " %d X %d = %d \n" , 단 , 곱 , 단*곱 );
            }
        } // 

        // 2. break; 반복문탈출 , continue; 증감식이동
        for( int i = 1 ; i <= 10 ; i++ ){
            if( i == 3 ) continue; // 만약에 i가 3이면 증감식 이동
            if( i == 9 ) break; // 만약에 i가 9이면 반복문 탈출 
            System.out.println( i );
        }

        // 3. 무한루프: 실행문 계속반복, 특정조건에 따른 break 활용
        for( ; ; ){ System.out.println("무한반복"); break; }
        while( true ){ System.out.println("무한반복"); break; }

        // 4. 초기값; while( 조건문 ){ 증감식; 실행문; }    [VS]  for문
        int i = 1; // [1] 초기식
        while( i <= 10 ){ // [2] 조건식
            System.out.println( i );
            // [3] 증감식 
            i++;
        } // w end 

        // 5. 반복문 과 배열 관계 : 배열내 저장된 자료들을 인덱스(저장된순서번호) 로 식별 ( 0 ~ )
        int[ ] ary = { 92 , 80 , 75 }; // 자바 배열! [vs] 자바스크립트 배열 
        // * 배열은 인덱스가 0부터 마지막 인덱스까지 순차 저장
        for( int 인덱스 = 0 ; 인덱스 <= ary.length -1  ; 인덱스++ ){ System.out.println( ary[인덱스] ); }
        
        // * 향상된 for문 , for( 타입명 변수명 : 배열명 ){  } ,   : 콜론 기준 오른쪽 배열내 요소들을 왼쪽 변수에 *하나씩* 대입
        for( int data : ary ){
            System.out.println( data ); // 인덱스 없이 자료(요소) 추출
        } // for end 
        
    } // 
} // 