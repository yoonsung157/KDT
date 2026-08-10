package day09.app.controller;

import java.util.ArrayList;
import day09.app.model.dao.BoardDao;
import day09.app.model.dto.BoardDto;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance() { return instance; }
    private BoardDao bd = BoardDao.getInstance();

    public boolean save(BoardDto boardDto) {
        boolean result = bd.save(boardDto);
        return result;
    }

    public ArrayList<BoardDto> findAll(){
        ArrayList<BoardDto> result = bd.findAll();
        return result;
    }
}
