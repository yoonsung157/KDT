package example.practice5.service;

import org.springframework.stereotype.Service;


import example.practice5.model.dto.CommentDto;
import example.practice5.model.entity.BoardEntity;
import example.practice5.model.entity.CommentEntity;
import example.practice5.model.repository.BoardRepository;
import example.practice5.model.repository.CommentRepository;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor 
public class CommentService {
    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;

    // 1. 댓글 등록
    public boolean save( CommentDto commentDto) {
        CommentEntity commentEntity = commentDto.toEntity();
        BoardEntity boardEntity = boardRepository.findById( commentDto.getBoardId() ).orElse(null);
        commentEntity.setBoardEntity(boardEntity);
        CommentEntity savedEntity = commentRepository.save(commentEntity);
        if( savedEntity.getId() >= 1 ) return true;
        return false;
    }

    // 2. 댓글 삭제
    public boolean delete( Integer commentId, String password ) {
        CommentEntity commentEntity = commentRepository.findById(commentId).orElse(null);
        if( commentEntity != null ) {
            if ( commentEntity.getPassword().equals(password) ) {
                commentRepository.deleteById(commentId);
                return true;
            }
        }
        return false;
    }
}
