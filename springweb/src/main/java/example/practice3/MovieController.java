package example.practice3;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/practice3")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;
    // 1. 등록
    @PostMapping("")
    public boolean save(@RequestBody MovieDto movieDto) {
        
        return movieService.save( movieDto );
    }
    
    // 2. 전체 조회
    @GetMapping("")
    public List<MovieDto> findAll() {

        return movieService.findAll();
    }
    

    // 3. 개별 조회
    @GetMapping("/detail")
    public MovieDto findDetail( @RequestParam( name = "movieid" ) int movieid ) {

        return movieService.findDetail( movieid );
    }
    

    // 4. 수정
    @PutMapping("")
    public boolean Update( @RequestBody MovieDto movieDto) {

        return movieService.Update( movieDto );
    }

    // 5. 삭제
}
