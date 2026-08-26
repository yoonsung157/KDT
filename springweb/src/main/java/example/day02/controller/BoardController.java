package example.day02.controller;

import org.springframework.web.bind.annotation.RestController;

import example.day02.model.dao.BoardDao;
import example.day02.model.dto.BoardDto;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



// 컨트롤러에 서블릿 기능 달기


 	
@RestController
public class BoardController {
    private BoardDao bd = BoardDao.getInstance();
    // [1] 등록
    @PostMapping("/board/save")
    public boolean save( BoardDto boardDto ){
        boolean result = bd.save(boardDto);
        return result;
    }

    // [2] 전체조회
    @GetMapping( "/board/findall" )
    public ArrayList<BoardDto> findAll( ){
        ArrayList<BoardDto> result = bd.findAll();
        return result;
    }

    // [3] 개별수정 Controller 
    @PutMapping("/board/update")
    public boolean update( BoardDto boardDto ){
        return bd.update( boardDto );
    }

    // [4] 개별삭제 Controller
    @DeleteMapping("/board/delete")
    public boolean delete( int no ){
        return bd.delete( no );
    }
} // class end 
