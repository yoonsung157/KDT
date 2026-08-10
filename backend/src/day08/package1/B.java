package day08.package1;
public class B {
    public void 메소드(){
        A a = new A();
        a.공개변수=3; // 가능
        // a.비공개변수=3; // 불가능
        a.일반변수 = 3; // 같은 (A/B) 패키지 가능 
    }
    private B(){ } // 비공개 생성자:외부에서 객체 생성 금지
}