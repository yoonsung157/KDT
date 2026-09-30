package example.day12;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;

@Component // SPRING MVC 패턴이 아닌 일반 객체
public class JwtUtil {
    // @Value ("${properties파일내 속성명}"), 속성값
    @Value ("${jwt.secret}")
    private String key;
    private SecretKey secretKey;

    //
    @PostConstruct 
    public void init() {
        this.secretKey = Keys.hmacShaKeyFor( key.getBytes( StandardCharsets.UTF_8));
    }

    // [1] JWT 토큰 생성 메소드
    public String createToken( Long mno ) {
        String jwt = Jwts.builder()
                    .subject( mno+"") // 토큰에 들어갈 내용들
                    .issuedAt( new Date() ) // 토큰 생성 시간
                    .expiration( new Date( new Date().getTime() + 60 * 60) ) // 토큰 만료 시간
                    .signWith(secretKey)
                    .compact();

        System.out.println( jwt );
        return jwt;
    }

    // [2] JWT 토큰 검증 메소드
    public Long getMnoFromToken( String token ) {
        try {Claims claims = Jwts.parser()
                        .verifyWith(secretKey) // 전자서명 이용한 검증
                        .build()
                        .parseSignedClaims(token) // 파싱할 토큰
                        .getPayload(); // JWT 안에 payload
        Long mno = Long.parseLong( claims.getSubject() ); // payload 안에 subject 꺼내기 ( 문자열타입 --> Long타입 변환)
        System.out.println(mno);
        return mno; // 토큰 검증이 성공이면 회원번호 반환
        } catch(Exception e ) {
            return null;
        }
    } 
}
