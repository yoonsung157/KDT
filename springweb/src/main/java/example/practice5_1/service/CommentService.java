package example.practice5_1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import example.practice5_1.model.dto.CommentDto;
import example.practice5_1.model.entity.CommentEntity;
import example.practice5_1.model.repository.BoardRepository;
import example.practice5_1.model.repository.CommentRepository;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor 
public class CommentService {
    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;

    // 등록
    public boolean save(CommentDto commentDto) {
        CommentEntity commentEntity = commentDto.toEntity();
        commentEntity.setBoardEntity(boardRepository.findById(commentDto.getBoardId() ).orElse(null) );
        CommentEntity savedEntity = commentRepository.save(commentEntity);
        if ( savedEntity.getId() >= 1 ) return true;
        return false;
    }


    // 삭제
    public boolean delete(Integer commentId, String password) {
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
