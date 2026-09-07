package example.practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;
    // 1. 등록
    public boolean save( MovieDto movieDto ){
        MovieEntity movieEntity = movieDto.toEntity();
        MovieEntity savedEntity = movieRepository.save(movieEntity);
        if( savedEntity.getMovieid() >= 1) { return true;}
        return false;
    }

    // 2. 전체 조회

    public List<MovieDto> findAll() {
        List<MovieEntity> entities = movieRepository.findAll();
        List<MovieDto> list = new ArrayList<>();
        entities.forEach( (entity) -> {
        list.add( MovieDto.from(entity));
        });
        return list;
    }
    // 3. 개별 조회
    public MovieDto findDetail( int movieid ){
        Optional<MovieEntity> entities = movieRepository.findById( movieid );
        if( entities.isPresent() ) {
            MovieEntity entity = entities.get();
            MovieDto movieDto = MovieDto.from(entity);
            return movieDto;
        }
        return null;
    }

    // 4. 수정

    @Transactional
    public boolean Update( MovieDto movieDto ){
        MovieEntity movieEntity = movieDto.toEntity();
        Optional<MovieEntity> optional = movieRepository.findById( movieDto.getMovieid() );
        if(optional.isPresent() ) {
            MovieEntity savedEntity = optional.get();
            savedEntity.setDirector(movieEntity.getDirector());
            savedEntity.setRating(movieEntity.getRating());
            savedEntity.setReleasedate(movieEntity.getReleasedate());
            savedEntity.setTitle(movieEntity.getTitle());
            return true;
        }
        return false;
    }

    // 5. 삭제
    public boolean Delete( int movieid ) {
        movieRepository.deleteById(movieid);
        return true;
    }
}
