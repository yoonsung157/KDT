package day09.app2.model.dao;

import java.util.ArrayList;
import day09.app2.model.dto.ListDto;

public class ListDao {
    private ListDao(){}
    private static final ListDao instance = new ListDao();
    public static ListDao getInstance() {  return instance; }

    private ArrayList<ListDto>listList = new ArrayList<>();

    // 게시물 작성 로직 
    public boolean save( ListDto listDto ){
        listList.add( listDto );
        return true;
    }

    // 게시물 전체 조회 로직
    public ArrayList<ListDto> findAll( ){
        return listList;
    }

    // 게시물 개별 수정 로직
    public boolean edit( ListDto listDto ){
        
        for( int i = 0; i < listList.size(); i++){
            if(listList.get(i).getNumber() == listDto.getNumber()) {
                listList.set(i,listDto);
            }
        }
        return true;
    }
}
