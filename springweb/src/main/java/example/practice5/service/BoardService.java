package example.practice5.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import example.practice5.model.entity.BoardEntity;
import example.practice5.model.repository.BoardRepository;
import example.practice5.model.dto.BoardDto;
import example.practice5.model.dto.CommentDto;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor 
public class BoardService {
    private final BoardRepository boardRepository;

    // 1. 게시물 등록 기능
    public boolean save( BoardDto boardDto ) {
        BoardEntity boardEntity = boardDto.toEntity();
        BoardEntity savedEntity = boardRepository.save(boardEntity);
        if( savedEntity.getId() >= 1) return true;
        return false;
    }

    // 2. 게시물 전체 조회
    public List<BoardDto> findAll( ){
        List<BoardEntity> boardEntities = boardRepository.findAll(); 
        List<BoardDto> boardDtos = new ArrayList<>();
        boardEntities.forEach( (boardEntity) -> {   
            BoardDto boardDto = BoardDto.from(boardEntity); 
            boardEntity.getCommentEntities().forEach((commentEntity) -> { // ** 달린 댓글 포함 **
                CommentDto commentDto = CommentDto.from( commentEntity );
                boardDto.getComments().add(commentDto);
            });
            boardDtos.add(boardDto);
        });
        return boardDtos; 
    }

    // 3
    public boolean delete( Integer id , String password ){ 
        BoardEntity boardEntity = boardRepository.findById( id ).orElse( null );

        if( boardEntity != null ){
            if( boardEntity.getPassword().equals( password ) ){
                boardRepository.deleteById( id );
                return true;
            }
        }
        return false;
    }
}
