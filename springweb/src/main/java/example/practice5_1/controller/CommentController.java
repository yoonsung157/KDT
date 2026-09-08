package example.practice5_1.controller;

import example.practice5.service.CommentService;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.practice5_1.model.dto.CommentDto;
import example.practice5_1.service.CommentService;
import lombok.RequiredArgsConstructor;

@RestController @RequestMapping ("/api/board/comments")
@RequiredArgsConstructor 
public class CommentController {
    private final CommentService commentService_1;
    private final CommentService commentService;

    CommentController(CommentService commentService_1) {
        this.commentService_1 = commentService_1;
    }

    public boolean save(@RequestBody CommentDto commentDto){
        return commentService.save(commentDto);
    }
}
