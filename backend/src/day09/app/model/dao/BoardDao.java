package day09.app.model.dao;

import java.util.ArrayList;
import day09.app.model.dto.BoardDto;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){ return instance; }
    // * 데이터베이스 대신에 ArrayList 사용 * // * 추후에 DB랑 연동 *
    private ArrayList <BoardDto> boardList = new ArrayList<>();

    public boolean save( BoardDto boardDto ) {
        boardList.add(boardDto);
        return true;
    }

    public ArrayList<BoardDto> findAll() {
        return boardList;
    }
}
