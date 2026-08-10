package day09.app2.model.dao;

import java.util.ArrayList;
import day09.app2.model.dto.ListDto;

public class ListDao {
    private ListDao(){}
    private static final ListDao instance = new ListDao();
    public static ListDao getInstance() {  return instance; }

    private ArrayList<ListDto>listList = new ArrayList<>();

    // 대기명단 작성 로직 
    public boolean save( ListDto listDto ){
        listList.add( listDto );
        return true;
    }

    // 대기명단 전체 조회 로직
    public ArrayList<ListDto> findAll( ){
        return listList;
    }

    // 대기명단 개별 수정 로직
    public boolean edit( ListDto listDto ){
        
        for( int i = 0; i < listList.size(); i++){
            if(listList.get(i).getNumber().equals(listDto.getNumber()) ) {
                listList.set(i,listDto);
                return true;
            }
        }
        return false;
    }

    // 대기명단 개별 삭제 로직
    public boolean delete( String number ){
        
        for( int i = 0; i < listList.size(); i++){
            if(listList.get(i).getNumber().equals(number) ) {
                listList.remove(i);
                return true;
            }
        }
        return false;
    }
}
