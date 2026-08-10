package day09.app2.view;

import java.util.ArrayList;
import java.util.Scanner;

import day09.app2.controller.ListController;
import day09.app2.model.dto.ListDto;

public class ListView{
    private ListView(){}
    private static final ListView instance = new ListView();
    public static ListView getInstance( ){ return instance; }
    // controller 싱글톤 호출
    private ListController lc = ListController.getInstance();


    // [*] 메인 입출력 
    public void run(){
        while(true){
            System.out.println("============ 대기명단 관리 ============");
            System.out.println("1.대기명단 등록 2.대기명단 전체 조회 3. 대기명단 개별 수정" );
            System.out.print("선택>");
            int ch = scan.nextInt();
            if( ch == 1 ) { save(); }
            else if( ch == 2 ) { findAll(); }
            else if( ch == 3 ) { edit();}
        }
    }
    private Scanner scan = new Scanner( System.in); // * 모든 메소드에서 사용 가능한 입력객체 
    // 게시물 작성 입출력
    public void save( ){
        System.out.print("전화번호: "); String 전화번호 = scan.next();
        System.out.print("인원수: ");   int 인원수 = scan.nextInt();

        ListDto listDto = new ListDto( 전화번호 , 인원수 );
        boolean result = lc.save( listDto );

        if( result ){ System.out.println("등록성공"); }
        else{ System.out.println("등록실패"); }
    }

    // 게시물 전체 출력 
    public void findAll( ){
        ArrayList<ListDto> result = lc.findAll();
        System.out.println("========== 대기명단 전체 조회 ============");
        for( ListDto list : result ){
            System.out.println( 
                "전화번호 : " + list.getNumber()+" , "+
                "인원수 : " + list.getPeople() );
        }
    } // f end 

    // 게시물 개별 수정
    public void edit( ){
        // 1. 입력받기 
        System.out.print("전화번호: ");     String 전화번호 = scan.next();
        ArrayList<ListDto> list = lc.findAll();
        boolean correct = false;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getNumber().equals(전화번호) ) { correct = true;}
        }
        if( correct ) {
            System.out.print("인원수: ");   int 인원수 = scan.nextInt();
            // 2. 객체화
            ListDto listDto = new ListDto( 전화번호 , 인원수 );
            // 3. 컨트롤러에게 요청하고 응답받기
            boolean result = lc.edit( listDto );
            // 4. 처리한다
            if( result ){ System.out.println("수정성공"); }
            else{ System.out.println("수정실패"); }
        }
        else { System.out.println("틀린번호");} 
         
        
    }
}