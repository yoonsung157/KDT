package example.practice.controller;

import org.springframework.web.bind.annotation.RestController;

import example.practice.model.dao.ListDao;
import example.practice.model.dto.ListDto;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class ListController {
    private ListDao ld = ListDao.getInstance();
    // [1] 등록
    @PostMapping( "/list/save" )
    public boolean save( ListDto listDto ){
        boolean result = ld.save(listDto);
        return result;
    }

    // [2] 전체조회
    @GetMapping( "/list/findall" )
    public ArrayList<ListDto> findAll( ){
        ArrayList<ListDto> result = ld.findAll();
        return result;
    }

    // [3] 개별수정 Controller
    @PutMapping( "/list/update" )
    public boolean update( ListDto listDto ){
        return ld.update( listDto );
    }

    // [4] 개별삭제 Controller
    @DeleteMapping( "/list/delete" )
    public boolean delete( String number ){
        return ld.delete( number );
    }
} // class end 