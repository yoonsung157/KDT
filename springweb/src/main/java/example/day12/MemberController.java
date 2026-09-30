package example.day12;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

import java.time.Duration;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController 
@RequestMapping ("/api/member")
@RequiredArgsConstructor 
@CrossOrigin (origins = "http://localhost:5173" , allowCredentials = "true")
public class MemberController {
    private final MemberService memberService;
    private final JwtUtil jwtUtil;

    // [1] 회원가입
    @PostMapping("/signup")
    public boolean signup( @RequestBody MemberDto memberDto) {
        return memberService.signup(memberDto);
    }
    private final RedisTokenService redisTokenService;
    // [2] 로그인 + 쿠키변경( 회원 식별(번호) 쿠키에 담아 클라이언트에 전송 )
    @PostMapping("/login")
    public MemberDto login( @RequestBody MemberDto memberDto , HttpServletResponse response ){
        // 1. 서비스 에게 인증/로그인 확인 (기존 유지)
        MemberDto result = memberService.login(memberDto);
        if( result == null ) return null; // 로그인 실패시 
        
        // 4. 토큰 2개 발급 요청
        String accessToken = jwtUtil.createAccToken( result.getMno() );
        String refreshToken = jwtUtil.createRefreshToekn( result.getMno() );
        // 5. refreshToken만 레디스에 저장
        redisTokenService.setRefreshToken(result.getMno(), refreshToken);

        // 2. 로그인 성공 시 쿠키 2개 생성/발급
        ResponseCookie cookie1 = ResponseCookie.from("accessToken",accessToken)
                                .path("/").maxAge(Duration.ofMinutes(30) ) // 30분
                                .httpOnly(true).secure(false).sameSite("Lax").build();

        ResponseCookie cookie2 = ResponseCookie.from("refreshToken",refreshToken)
                                .path("/").maxAge(Duration.ofDays(7) ) // 7일
                                .httpOnly(true).secure(false).sameSite("Lax").build();
        // 3. 응답 헤더에 쿠키 2개 등록 , response.setHeader( )
        // HttpHeaders 자동완성 : org.springframework.http.HttpHeaders;[o] , import java.net.http.HttpHeaders; [x]
        response.setHeader( HttpHeaders.SET_COOKIE  , cookie1.toString() );
        response.setHeader( HttpHeaders.SET_COOKIE2  , cookie2.toString() );
        return result;
    }

    // [3] 내정보조회 + 쿠키
    @GetMapping("/me")
    public MemberDto getMyInfo( 
        // @CookieValue( value="쿠키명") ){ // 요청한 브라우저의 쿠키 가져오기 
        @CookieValue (value="login_member" , required = false ) String token ){
        //1. 만약에 token이 없다면 비로그인
        if( token == null ) return  null;
        // 쿠키에 저장된 token 이용하여 회원번호 찾기
        long loginMno = jwtUtil.getMnoFromToken(token);
        // 2. 로그인 중이면 서비스에게 회원정보 요청
        // 참고: 문자->기본타입 변환 방법1) 래퍼클래스명.parse타입( 문자 )
        return memberService.getMyInfo( loginMno );
    }

    // [4] 로그아웃 + 쿠키 
    @PostMapping ("/logout")
    public boolean logout( @CookieValue (value = "accessToken", required = false) String accessToken,  
                            HttpServletResponse response ){
        // 1. 만약에 accessToken 존재하면 회원번호 조회
        if( accessToken != null ) {
            Long mno = jwtUtil.getMnoFromToken(accessToken);
            // 2. 만약에 회원번호 조회되면 레디스내 refresh 삭제하기.
            redisTokenService.deleteRefreshToken(mno);
        }
        // 3. 쿠키 삭제 
        ResponseCookie cookie1 = ResponseCookie.from("accessToken", "")
                                .path("/").maxAge(0)
                                .httpOnly(true).secure(false).build();
        ResponseCookie cookie2 = ResponseCookie.from("refreshToken", "")
                                .path("/").maxAge(0)
                                .httpOnly(true).secure(false).build();

        response.setHeader( HttpHeaders.SET_COOKIE  , cookie1.toString() );
        response.setHeader( HttpHeaders.SET_COOKIE  , cookie2.toString() );
        return true;
    }

    @GetMapping("")
    public String test( HttpServletRequest request ) {
        // HttpServletRequest: Http 요청 정보를 담고 있는 서블릿 객체
        System.out.println( request.getRemoteAddr() ); // 요청한 클라이언트의 IP (로그/위치추적/조회수)
        System.out.println( request.getHeader("User-Agent")); // 요청한 클라이언트의 브라우저 정보
        System.out.println( request.getSession() ); // 요청한 클라이언트의 세션객체 정보
        // 2) 세션객체란? 톰캣 서버내 브라우저 마다 독립적인 저장소
        // 주로 : 로그인성공정보, 인증번호, 비회원제 장바구니 등등 
        HttpSession session = request.getSession(); // 세션 객체네 여러개 정보 저장 가능
        System.out.println( session.getId() ); // 세션 식별번호
        System.out.println( session.getCreationTime() ); // 세션 생성시간
        System.out.println( session.getLastAccessedTime() ); // 세션 마지막 접근 시간
        System.out.println( session.getMaxInactiveInterval()); // 세션 생명주기( 기본값 : 30분 )
        // 3) 세션 정보 저장(로그인)/호출(마이페이지)/삭제(로그아웃)
        session.setAttribute("data", "사과"); // map(key:value) 구조
        // data라는 이름(key)로 사과(data) 저장
        System.out.println(session.getAttribute("data")); // key 이용한 value 호출
        session.invalidate(); // 세션 초기화 

        return session.getId();
        
    }
    
}
