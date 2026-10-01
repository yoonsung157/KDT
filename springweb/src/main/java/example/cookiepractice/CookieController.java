package example.cookiepractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController 
@RequestMapping ("api/cookie")

public class CookieController {
    int i = 1;
    // 쿠키 저장
    @GetMapping("/add")
    public String save( @RequestParam (name = "data") String data, 
    HttpServletResponse response) {
        ResponseCookie cookie = ResponseCookie.from("item"+i, data)
                                .path("/").maxAge(Duration.ofMinutes(1))
                                .httpOnly(true).secure(false).sameSite("Lax").build();
    response.addHeader( HttpHeaders.SET_COOKIE , cookie.toString());
    i++;
    return "성공";
    }

    // 쿠키 조회
    @GetMapping("/all")
    public List<String> findCookie(
        HttpServletRequest request    
    ){
        List<String> list = new ArrayList<>();
        Cookie[] cookies = request.getCookies();

        if(cookies != null ) {
            for(Cookie cookie : cookies) {
                list.add( cookie.getValue() );
            }
        }
        return list;
    }
    
}
