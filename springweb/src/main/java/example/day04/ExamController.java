package example.day04;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
public class ExamController {
    // 서비스객체 (주입) 불러오기
    private final ExamService examService;
    
    // [1] 전체조회
    @GetMapping("/day04/exam")
    public List<ExamEntity> findAll() {
        // 서비스호출
        return examService.findAll();
    }
    
    // [2] 저장
    @PostMapping("/day04/exam")
    public boolean save( @RequestBody ExamEntity entity) {
        // 서비스호출
        return examService.save( entity );
    }
    
}
