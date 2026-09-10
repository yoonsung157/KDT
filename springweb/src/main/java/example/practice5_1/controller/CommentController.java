package example.practice5_1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.practice5_1.model.dto.CommentDto;
import example.practice5_1.service.CommentService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController @RequestMapping ("/api/board/comment")
@RequiredArgsConstructor 
public class CommentController {
    private final CommentService commentService;

    // 등록
    @PostMapping("")
    public boolean save( @RequestBody CommentDto commentDto ) {
        return commentService.save( commentDto );
    }

    // 삭제
    @DeleteMapping ("")
    public boolean delete ( 
        @RequestParam (name = "commentId") Integer commentId,
        @RequestParam (name = "password") String password ) {
            return commentService.delete(commentId, password);
        }
}
