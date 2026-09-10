package example.day07;
public class Exam1 {
    public static void main(String[] args ) {
        // 서로 다른 클래스에 메소드 호출하는 방법
        // 메소드란? 상호작용
        // 1. 인스턴스 생성하여 메소드 호출
        TestService testService = new TestService();
        int result = testService.plus(3, 5);

        // 2. 싱글톤
        TestService testService2 = TestService.getInstance();
        int result2 = testService2.plus(1,2);

        // 3. 메소드가 static 이면
        int result3 = TestService.plus2(10, 5);

        // 4. 스프링방식
        // @Service (자동 인스턴스 생성) @Autowired(인스턴스 호출)
    }
}

class TestService {
    TestService(){}
    private static final TestService instance = new TestService();
    public static TestService getInstance(){ return instance; }

    int plus(int x, int y) {
        return x + y;
    }
    static int plus2(int x, int y) { return x + y; }
}

class Student {
    String name;
    void 밥먹기() {
        System.out.println( this.name + "밥 먹는다. ");
    }
}