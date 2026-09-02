package example.practice1;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




// @Component // 스프링 컨테이너 빈(객체) 등록
@Controller // http 서블릿 + @Component
@RestController // @ResponseBody http(응답) content-type:application/json + @Controller
// 주로 뷰 반환 : @Controller, 값 반환 : @RestController 
@RequestMapping("/test") // 해당 클래스내 메소드들의 공통URL
public class TestController {
    // [1] 게시물등록
    @PostMapping("") // 상위(클래스)에 "/test"가 정의됨
    public boolean TestWrite(@RequestBody TestDto TestDto) {
        System.out.println("TestController.TestWrite()");
        return true; // 임의로 반환 성공
    }

    // [2] 게시물 전체 조회
    @GetMapping("")
    public ArrayList<TestDto> testPrint() {
        ArrayList<TestDto> list = new ArrayList<>();
        list.add( new TestDto(1,"내용1","작성자1") );
        list.add( new TestDto(2, "내용2", "작성자2"));
        return list;
    }

    // [3] 게시물 개별 조회
    @GetMapping("/detail")
    public TestDto testDetail (@RequestParam(name = "no") int no) {

        return new TestDto(1,"내용1","작성자1");
    }
    
    // [4] 게시물 삭제
    @DeleteMapping("/{no}")
    public boolean testDelete( @PathVariable( name = "no") int no ){
        return true;
    }

    // [5] 게시물 수정
    @PutMapping("")
    public boolean testUpdate (@RequestBody TestDto TestDto) {
        
        return true;
    }
    
    
} // class end


@Data // getter setter toString 등등 
@AllArgsConstructor @NoArgsConstructor @Builder
class TestDto {
    private Integer no;
    private String content;
    private String writer;
}
/*
    - int : 기본타입 +-21억 저장
    - Integer : 참조타입( int 래퍼클래스 ) + null 저장 가능
    주의할점: HTTP 파싱하는 경우에 int에는 null 저장 불가능
    권장1 : 기본타입 대신에 래퍼타입 사용  
*/