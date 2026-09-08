package example.practice5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.practice5.model.dto.BoardDto;
import example.practice5.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController @RequestMapping("/api/board")
@RequiredArgsConstructor 
public class BoardController {
    private final BoardService boardService;

    // 1. 게시물 등록 기능
    @PostMapping("")
    public boolean save(@RequestBody BoardDto boardDto) {
        return boardService.save(boardDto);
    }

    // 2. 목록 조회 기능
    @GetMapping("")
    public List<BoardDto> findAll() {
        return boardService.findAll();
    }
    

    // 3. 게시물 삭제 기능
    @DeleteMapping("")
    public boolean delete( 
        @RequestParam (name = "id") Integer id,
        @RequestParam (name = "password") String password){
        return boardService.delete( id, password);
    }
}
