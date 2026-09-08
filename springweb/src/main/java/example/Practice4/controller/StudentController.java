package example.practice4.controller;

import org.springframework.web.bind.annotation.RestController;

import example.practice4.model.dto.StudentDto;
import example.practice4.model.entity.StudentEntity;
import example.practice4.service.StudentService;
import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor 
public class StudentController {
    private final StudentService studentService;

    // 등록
    public boolean save( StudentDto studentDto ) {
        return true;
    }
}
