package example.day10;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor 
public class MemberService {
    private final MemberRepository memberRepository;
    // *** 비크립트(암호화사용) 라이브러리 객체주입
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    // [1] 회원가입 = 등록 = create = C 
    public boolean signup( MemberDto memberDto ) {
        // 1) 회원가입/등록 할 정보들을 컨트롤러에게 받아
        // 2) entity 변환
        MemberEntity memberEntity = memberDto.toEntity();
        // 3) entity save
            // *** 저장하기전에 평문(원본 비밀번호) --> 암호문으로 변환
            // passwordEncoder.encode("평문")
            memberEntity.setMpwd(passwordEncoder.encode(memberDto.getMpwd() ) );  // 암호문을 entity에 저장
        MemberEntity savedEntity = memberRepository.save(memberEntity);
        // 4) confirm
        return savedEntity.getMno() >= 1;
    }

    // [2] 로그인 = 조회 = Read = R
    public MemberDto login( MemberDto memberDto ) {
        // 1) 로그인시 입력받은 아이디/비밀번호 컨트롤러에게 받는다.
        // 2) 입력받은 아이디가 존재하는지 검증 , findByMid 추상정의함.
        MemberEntity memberEntity = memberRepository.findByMid( memberDto.getMid() );
        if( memberEntity == null ) return null;
        // 3) 존재하면 평문과 암호문 비교
        boolean 비번일치 = passwordEncoder.matches(memberDto.getMpwd(), memberEntity.getMpwd() );
        if ( 비번일치 == false ) return null; // [로그인실패] 비밀번호 불일치
        // 4) entity --> dto 변환하여 반환, 로그인 전용 loginDto 있으면 좋다.
        return MemberDto.from(memberEntity);
    }

    // [3] 내 정보 조회(PK:회원번호)
    public MemberDto getMyInfo( Long mno ) {
        // 1) 컨트롤러에게 조회할 회원번호 받는다.
        // 2) findById
        Optional<MemberEntity> optional = memberRepository.findById(mno);
        if( optional.isPresent() ) { // 3) 조회결과 존재하면
            MemberEntity memberEntity = optional.get();
            return MemberDto.from(memberEntity);
        }
        return null; // 4) 조회 결과 없으면 null
    }
}
