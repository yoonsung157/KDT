package example.practice4.model.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import example.practice4.model.entity.CourseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class CourseDto {
    private Integer courseId;
    private String courseName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder.Default
    private List<StudentDto> studentDtos = new ArrayList<>();
    public CourseEntity toEntity(){
        return CourseEntity.builder()
        .courseName(this.courseName)
        .build();
    }

    public static CourseDto from(CourseEntity entity){
        return CourseDto.builder()
        .courseId(entity.getCourseId())
        .courseName(entity.getCourseName())
        .createdAt( entity.getCreatedAt())
        .updatedAt( entity.getUpdatedAt())
        .build();
    }
}
