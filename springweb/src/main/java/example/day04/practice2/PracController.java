package example.day04.practice2;

import example.day04.ExamService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequiredArgsConstructor
@RequestMapping("/day04/practice2/exam")
public class PracController {
    private final PracService pracService;

    // [1] 등록
    @PostMapping("")
    public boolean save( @RequestBody PracEntity entity) {
        return pracService.save( entity );
    }

    // [2] 게시물 전체 조회
    @GetMapping("")
    public List<PracEntity> findAll() {
        return pracService.findAll();
    }

    // [3] 게시물 개별 조회
    @GetMapping("/find")
    public Optional<PracEntity> find( @RequestParam ( name = "no" ) int no) {
        return pracService.find( no );
    }
    

    // [4] 삭제
    @DeleteMapping("")
    public boolean Delete( @RequestParam ( name = "no" ) int no ) {
        return pracService.Delete(no);
    }

    // [5] 수정
    @PutMapping("")
    public boolean Update(@RequestBody PracEntity entity) {
        return pracService.Update( entity );
    }

    
}
