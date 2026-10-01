package example.cookiepractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
@RequestMapping ("/api/session")
@RequiredArgsConstructor 
public class SessionController {
    int i = 1;
    // 세션 추가
    @GetMapping("/add")
    public String save(
        @RequestParam (name = "data") String data, 
        HttpSession session) {
            session.setAttribute("item"+i, data);
            i++;
            return "성공";
        } 
    
    // 세션 조회
    @GetMapping("all")
    public List<String> findSession( HttpSession session ) {
        List<String> list = new ArrayList<>();
        for(int j = 1; j < i; j++) {
            Object obj = session.getAttribute("item"+j);
            list.add((String)obj);
        }
        
        return list;
    }
    

    
}
