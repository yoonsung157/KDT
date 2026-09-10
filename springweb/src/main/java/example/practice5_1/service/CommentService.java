package example.practice5_1.service;

import org.springframework.stereotype.Service;

import example.practice5_1.model.dto.CommentDto;
import example.practice5_1.model.entity.BoardEntity;
import example.practice5_1.model.entity.CommentEntity;
import example.practice5_1.model.repository.BoardRepository;
import example.practice5_1.model.repository.CommentRepository;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor 
public class CommentService {
    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;

    // 등록
    public boolean save( CommentDto commentDto ) {
        CommentEntity commentEntity = commentDto.toEntity();
        BoardEntity boardEntity = boardRepository.findById( commentDto.getBoardId() ).orElse(null);
        commentEntity.setBoardEntity(boardEntity);
        CommentEntity savedEntity = commentRepository.save( commentEntity );
        if( savedEntity.getId() >= 1 ) return true;
        return false;
    }

    // 삭제
    public boolean delete( Integer id, String password ) {
        CommentEntity commentEntity = commentRepository.findById(id).orElse(null);
        if (commentEntity.getId() >= 1 ) {
            if ( commentEntity.getPassword().equals(password) ) {
                commentRepository.deleteById(id);
                return true;
            }
        }
        return false;
    }
}
