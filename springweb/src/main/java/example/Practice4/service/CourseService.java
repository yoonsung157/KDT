package example.practice4.service;

import org.springframework.stereotype.Service;

import example.practice4.model.dto.CourseDto;
import example.practice4.model.entity.CourseEntity;
import example.practice4.model.repository.CourseRepository;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor 
public class CourseService {
    private final CourseRepository courseRepository;

    // 등록
    public boolean save( CourseDto courseDto){
        CourseEntity courseEntity = courseDto.toEntity();
        CourseEntity savedEntity = courseRepository.save(courseEntity);

        if( savedEntity.getCourseId() >= 1 ) return true;
        return false;
    }
    
}
