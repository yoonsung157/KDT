package day16;

import java.lang.reflect.Executable;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Exam2 {
    public static void main(String[] args) {
        /*
            스레드 풀: 매번 새로운 스레드 생성x 미리 일정한 스레드를 풀(당구)에 생성
            목적: 과부하 방지
            구조: 선입선출(queue)방식으로 먼저 요청이 들어온 순서대로 *대기중인* 스레드가 처리한다.
                *) 만일 대기중인 스레드가 없으면 wait(대기) 상태이며 스레드가 작업이 끝나고 대기중인 요청 처리
            활용처: 웹서버(톰켓), JDBC, 안전한 서버 구축 등
        */
        // [1] 스레드풀 구축(미리 스레드 수 생성), 
        // ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        // [2] 임의의 요청 스레드(구현체), 인터페이스명 변수명 = new 인터페이스명(){};
        Runnable runnable = new Runnable() {
            @Override
            public void run() { // 임의의 요청을 20번 생성(CallTask)
                for(int i=1; i<=20; i++){
                    try{Thread.sleep(3000);}catch(InterruptedException e){} // 3초에 1번씩 총 20번 요청
                    // [3] 스레드풀에 해당 구현체 배정
                    CallTask task = new CallTask(i);    // i번째 요청스레드 생성
                    poolExecutor.submit(task);          // 스레드풀에 요청스레드 배정
                    // [6] 현재 스레드 상태
                    int 작업중인스레드수 = poolExecutor.getActiveCount();
                    int 대기중인스레드수 = poolExecutor.getCorePoolSize() - 작업중인스레드수;
                    int 대기중인요청수 = poolExecutor.getQueue().size();
                    System.out.println("작업중인스레드수:"+작업중인스레드수 + "대기중인스레드수:" + 대기중인스레드수 + "대기중인요청수:" + 대기중인요청수);
                }
                // [4] 20개 배정 후 스레드풀 종료 예약(모든 작업이 끝나면)
                poolExecutor.shutdown();    // 
            }
        };
        // [5] 구현체 start
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
// [2] 작업(요청) 스레드
class CallTask implements Runnable{
    private Random random = new Random();   // 난수객체
    private int id; // 스레드 식별용
    public CallTask(int id){this.id = id;}  // 생성자
    @Override
    public void run() { // 멀티스레드
        String threadName = Thread.currentThread().getName();   // 현재 작업스레드명 호출(식별용)
        System.out.println(threadName+"상담원 고객통화 시작됨: " + id);
        try{Thread.sleep(6000 + random.nextInt(6000));}catch(InterruptedException e){}  // 6~12초 사이
        System.out.println(threadName+"상담원 고객통화 종료됨");
    }
}