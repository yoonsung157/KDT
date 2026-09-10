package example.practice5_1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.practice5_1.model.dto.BoardDto;
import example.practice5_1.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController @RequestMapping ("/api/board")
@RequiredArgsConstructor 
public class BoardController {
    private final BoardService boardService;

    // 등록
    @PostMapping("")
    public boolean save(@RequestBody BoardDto boardDto) {
        return boardService.save( boardDto );
    }

    // 조회
    @GetMapping("")
    public List<BoardDto> findAll() {
        return boardService.findAll();
    }

    // 삭제
    @DeleteMapping ("")
    public boolean delete( 
        @RequestParam (name = "id") Integer id,
        @RequestParam (name = "password") String password ) {
            return boardService.delete(id, password);
        }
}
