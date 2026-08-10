package day09.app2.controller;

import java.util.ArrayList;

import day09.app2.model.dao.ListDao;
import day09.app2.model.dto.ListDto;

public class ListController {
    private ListController(){}
    private static final ListController instance = new ListController();
    public static ListController getInstance(){return instance;}
    // dao 싱글톤 호출
    private ListDao ld = ListDao.getInstance();

    // 대기명단 작성 컨트롤러
    public boolean save( ListDto listDto ){
        boolean result = ld.save( listDto );
        return result;
    }

    // 대기명단 전체 조회 컨트롤러
    public ArrayList<ListDto> findAll( ){
        ArrayList<ListDto> result = ld.findAll();
        return result;
    }

    // 대기명단 개별 수정 컨트롤러
   public boolean edit( ListDto listDto ){
        boolean result = ld.edit( listDto );
        return result;
    }

    // 대기명단 개별 삭제 컨트롤러
   public boolean delete( String number ){
        boolean result = ld.delete( number );
        return result;
    }
}