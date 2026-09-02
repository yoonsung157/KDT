package example.practice1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


// @Component // 스프링 컨테이너 빈(객체) 등록
@Controller // http 서블릿 + @Component
@RestController // @ResponseBody http(응답) content-type:application/json + @Controller
// 주로 뷰 반환 : @Controller, 값 반환 : @RestController 
@RequestMapping("/test") // 해당 클래스내 메소드들의 공통URL
public class TestController {
    // [1] 게시물등록
    @PostMapping("/") // 상위(클래스)에 "/test"가 정의됨
    public boolean TestWrite(TestDto TestDto) {
        
        return true; // 임의로 반환 성공
    }
    
} // class end
@Data // getter setter toString 등등 
@AllArgsConstructor @NoArgsConstructor @Builder
class TestDto {
    private int no;
    private String content;
    private String writer;
}