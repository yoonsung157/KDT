package day09.app.view;

import java.util.Scanner;
import java.util.ArrayList;

import day09.app.controller.BoardController;
import day09.app.model.dto.BoardDto;

public class BoardView {
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance( ) { return instance; }
    private BoardController bc = BoardController.getInstance();

    // [*] 메인 입출력
    public void run(){
        while(true){
            System.out.println("1.등록 2. 전체조회");
            int ch = scan.nextInt();
            if( ch == 1 ) save();
            else if( ch == 2 ) findAll();

        }
    }
    private Scanner scan = new Scanner(System.in);
    public void save() {
        System.out.print("내용");
        String 내용 = scan.next();
        System.out.print("작성자");
        String 작성자 = scan.next();

        BoardDto boardDto = new BoardDto(내용, 작성자);
        boolean result = bc.save(boardDto);
        
        if(result) { System.out.println("등록성공");}
        else { System.out.println("등록실패");}
    }

    public void findAll() {
        ArrayList<BoardDto> result = bc.findAll();
        for( BoardDto board : result ){
            System.out.println(
                board.getWriter()+ " : " +
                board.getContent()
            );
        }
    } // f end
}
