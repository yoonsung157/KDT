package day08;
public class Exam2 {
    public static void main(String[] args) {

        // [1] setter and getter 이용한 간접접근 차단
        User u1 = new User();
        // u1.name = "유재석"; // 직접접근 불가!
        u1.setName("유재석"); // 간접접근 허용
        // System.out.println( u1.name ); // 불가능
        System.out.println( u1.getName() ); // 가능

        // [2] 객체 출력하면 객체주소값 반환?
        System.out.println( u1 ); // day08.User@372f7a8d(식별)
        // toString메소드가 존재하는 객체는 주소값 대신에

    }
}

class User{ // 클래스란? 객체 설계도/종이
    // 1. 멤버변수 = 상태 = private 사용
    private String name;
    private int age;
    // 2. 생성자 = 초기화
    // 3. 메소드 = 행위
    // - private 메소드에 대한 간접접근 메소드
    // setter , getter , set멤버변수, get멤버변수
    // getter 존재하면 V(value)O(object) 읽기모드
    // setter/getter 존재하면 D(data)T(transfer)O(object) 읽기/쓰기모드
    public void setName( String name ){
        this.name = name; // 추후에 유효성검사 이용하여 원하는 데이터만 저장
    }

    public String getName(  ){
        return this.name;
    }
    // -> 오른쪽 클릭 -> 소스작업 -> setter and getter 
    public int getAge() {  return age; }
    public void setAge(int age) {  this.age = age; }

    // 3. toString : 객체호출시 주소값 대신에 문자열 변환
    // -> 오른쪽 클릭 -> 소스 작업 -> toString 
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
} // class end 