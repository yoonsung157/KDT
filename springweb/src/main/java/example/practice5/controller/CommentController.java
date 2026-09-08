package example.practice5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.practice5.model.dto.CommentDto;
import example.practice5.service.CommentService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController @RequestMapping ("/api/board/comments")
@RequiredArgsConstructor 
public class CommentController {
    private final CommentService commentService;

    // 1. 댓글 등록 기능
    @PostMapping("")
    public boolean save(@RequestBody CommentDto commentDto) {
        return commentService.save( commentDto );
    }

    // 2. 댓글 삭제 기능
    @DeleteMapping("")
    public boolean delete(
        @RequestParam (name = "commentId") Integer commentId,
        @RequestParam (name = "password") String password ) {
            return commentService.delete(commentId, password);
        }
    
}


