package example.day05;

import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired private TestRepository testRepository;

    // 1. 전체조회
    public List<TestDto> 전체조회( ) {
        // 1. 모든 엔티티 조회한다.
        List<TestEntity> entities = testRepository.findAll();
        // 2. 모든 엔티티 -> DTO 변환하기
        // 빈 리스트 생성
        List<TestDto> list = new ArrayList<>();
        // 모든 엔티티를 반복하여 모든 DTO로 변환해서 새로운 리스트에 저장
        // 리스트객체.forEach( (반복변수> -> )
        entities.forEach( (entity) -> {
            list.add( TestDto.from(entity));
        });
        return list;
    }
    
    // 2. 등록
    public boolean 저장( TestDto testDto ) {
        // 1. dto를 entity로 변환
        TestEntity testEntity = testDto.toEntity();
        TestEntity savedEntity = testRepository.save( testEntity );
        if( savedEntity.getNo() >= 1 ) { return true;}
        else return false;
        
    }

    // 3. 수정
    @Transactional
    public boolean 수정( TestDto testDto ){
        // 1. 수정할 엔티티 찾는다. pk
        Optional<TestEntity> optional
            = testRepository.findById( testDto.getNo() );
        // 2. 찾은 엔티티가 존재하면
        if( optional.isPresent() ){
            // 3. 엔티티 꺼낸다.
            TestEntity entity = optional.get();
            // 4. setter 메소드 이용한 수정
            entity.setPrice( testDto.getPrice() );
            entity.setDescri(testDto.getDescri() );
            return true;
        }
        return false;
    }
}
