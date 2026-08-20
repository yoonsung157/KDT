package day14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Exam3 {
    public static void main(String[] args) {
        
        // Set 인터페이스 : 여러개 자료들을 저장하는 컬렉션, 중복허용안함, 인덱스(순서) 없다.
        // 1. Set 구현
        Set < String > set1 = new HashSet<>();
        // 2. Set .add( 추가할값 );
        set1.add("유재석"); set1.add("강호동");
        set1.add("유재석"); // List 중복허용, Set 중복허용안함
        set1.add( new String("유재석") ); // 중복 방지.
        System.out.println(set1); // [유재석, 강호동]
        // 3. .get(인덱스) 지원불가, 인덱스가 없으니까.
        // set1.get( 0 );
        // 4. .size( ) : 항목 개수 반환
        System.out.println(set1.size());
        // 5. remove( 자료 );   // 인덱스가 아닌 자료 삭제
        set1.remove( "강호동" ); 
        System.out.println(set1);
        // 6. .indexOf( 인덱스 ); 사용불가, contains( 찾을 값 ) 사용 가능
        System.out.println(set1.contains("유재석"));
        // 7. .clear() : 항목 전체삭제
        set1.clear();
        // 8. .isEmpty() : 항목이 하나도 없으면 true , 아니면 false
        set1.isEmpty();
        // 9. Set 컬렉션과 반복문 관계
        // 1. 일반 for문 지원 불가(인덱스가 없으니까)
        // 2. 향상된 for문 지원
        for( String str : set1) { System.out.println( str );}
        // 3. forEach, 지원 , 컬렉션개체.forEach( (반복변수명) -> { } )
        set1.forEach( ( str ) -> { System.out.println( str );});

        // 활용처 : Set( JDBC ResultSet )

        // 10. TreeSet 이용한 자동 정렬
        TreeSet< Integer > set2 = new TreeSet<>();
        set2.add( 50); set2.add(70); set2.add(60);
        System.out.println(set2); // [50, 60, 70] 기본값이 오름차순
        // descendingSet 메소드는 set 인터페이스내 추상메소드 없다.
        // TreeSet 사용해야함.
        System.out.println(set2.descendingSet()); // [70, 60, 50] 내림차순

        // int [] numbers = { 10, 20, 30, 40,60, 70, 80, 4,7,23,16,23,62,78,18,94,92,18};
        // for( int num : numbers ) { System.out.println(num);}
        // TreeSet< Integer > set3 = new TreeSet<>();
        // for( int num : numbers ) { set3.add(num); }
        // System.out.println(set3);
    } // main end
} // class end
