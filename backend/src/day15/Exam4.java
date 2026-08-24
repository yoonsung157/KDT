package day15;

import java.time.LocalTime;
import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {        // <--------- [1.MAIN스레드]
        // [1] 시계 구현 [2.시계스레드]
        // 1. 새로운 작업(시계) 스레드 실행
        시계스레드 runnable1 = new 시계스레드();        // 구현체 생성
        Thread thread1 = new Thread( runnable1 );       // 스레드객체에 구현체 대입
        thread1.start();    // 스레드객체 시작, [1.MAIN스레드]가 [2.시계스레드] 켠다
        // [3] 타이머 구현 [3.타이머스레드]
        타이머스레드 thread2 = null; // null(객체없다)
        // [2] 입력 구현 [1.MAIN스레드]
        while (true) {
            System.out.print("1.ON , 2.OFF : ");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if( ch == 1 ){
                thread2 = new 타이머스레드();
                thread2.start(); // [1.MAIN스레드] 가 [3.타이머스레드] 켠다.
            }
            if( ch == 2 ){
                // 만약에 현재 스레드가 존재하면 상태 false 하여 [3.타이머스레드] 무한루프 종료
                if( thread2 != null ) thread2.state = false;
            }
        } // while end 

    } // main end [1.MAIN스레드] 사망(프로그램 끝)
} // class end

class 타이머스레드 extends Thread{
    public boolean state = true; // 타이머 작동여부
    @Override public void run() {
        int time = 0;   
        while ( state ) { // 타이머 작동여부가 true 인 경우만 무한루프 / false 종료
            time++; // 1초 증가
            System.out.println(">> 타이머: " + time +"초");
            try{ Thread.sleep( 1000 ); }
            catch(Exception e ){ }
        }
    } // run 종료되면 작업스레드 종료
}
class 시계스레드 implements Runnable{ // Runnable인터페이스 구현하면 멀티스레드 정의!
    @Override public void run() { // 멀티스레드가 처리할 작업
        while ( true ) { // 무한루프
            System.out.println( LocalTime.now() ); // 현재시간
            try{ Thread.sleep(1000); }catch(Exception e ){ } // 1초일시정지
        }
    } // run 종료되면 작업스레드 종료
} 