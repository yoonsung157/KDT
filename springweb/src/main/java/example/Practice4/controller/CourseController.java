package example.practice4.controller;

import example.practice4.model.dto.CourseDto;
import example.practice4.service.CourseService;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController @RequiredArgsConstructor 
public class CourseController {
    private final CourseService courseService;

    // 등록
    @PostMapping("path")
    public boolean save(@RequestBody CourseDto courseDto) {
        return courseService.save(courseDto);
    }
    
}
