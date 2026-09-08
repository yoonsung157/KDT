package example.practice5_1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import example.practice5_1.model.dto.BoardDto;
import example.practice5_1.model.dto.CommentDto;
import example.practice5_1.model.entity.BoardEntity;
import example.practice5_1.model.repository.BoardRepository;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor 
public class BoardService {
    private final BoardRepository boardRepository;

    // 등록
    public boolean save( BoardDto boardDto ) {
        BoardEntity boardEntity = boardDto.toEntity();
        BoardEntity savedEntity = boardRepository.save(boardEntity);
        if( savedEntity.getId() >= 1 ) return true;
        return false;
    }

    // 조회
    public List<BoardDto> findAll() {
        List<BoardEntity> boardEntities = boardRepository.findAll();
        List<BoardDto> boardDtos = new ArrayList<>();
        boardEntities.forEach(boardEntity -> {
            BoardDto boardDto = BoardDto.from(boardEntity);
            boardEntity.getCommentEntities().forEach(commentEntity -> {
                CommentDto commentDto = CommentDto.from(commentEntity);
                boardDto.getComments().add(commentDto);
            });
            boardDtos.add(boardDto);
        });
        return boardDtos;
    }

    // 삭제
    public boolean delete( Integer id, String password) {
        BoardEntity boardEntity = boardRepository.findById(id).orElse(null);
        if( boardEntity != null ) {
            if ( boardEntity.getPassword().equals(password) ) {
                boardRepository.deleteById(id);
                return true;
            }
        }
        return false;
    }
}
