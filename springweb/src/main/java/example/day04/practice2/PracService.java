package example.day04.practice2;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PracService {
    private final PracRepository pracRepository;

    // [1] 등록
    public boolean save( PracEntity entity ){
        PracEntity savedEntity = pracRepository.save( entity );
    if( savedEntity.getEno() >= 1 ) return true;
    return false;
    }

    // [2] 게시물 전체 조회
    public List<PracEntity> findAll( ) {
        return pracRepository.findAll();
    }
    
    // [3] 게시물 개별 조회
    public Optional<PracEntity> find( int no ) {
        
        return pracRepository.findById( no );
    }

    // [4] 삭제
    public boolean Delete( int no ) {
        pracRepository.deleteById( no );
        return true;
    }
    // [5] 수정
    @Transactional
    public boolean Update( PracEntity entity ) {
        Optional<PracEntity> optional
            = pracRepository.findById( entity.getEno() );
        
        if( optional.isPresent() ) {
            PracEntity savedEntity = optional.get();
            savedEntity.setEcontent( entity.getEcontent() );
            savedEntity.setEwriter( entity.getEwriter() );
            return true;
        }
        return false;
    }
    

}
