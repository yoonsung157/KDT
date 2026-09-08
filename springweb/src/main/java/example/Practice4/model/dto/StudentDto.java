package example.practice4.model.dto;

import java.time.LocalDateTime;

import example.practice4.model.entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Builder @Data 
public class StudentDto {
    private Integer studentId;
    private String studentName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public StudentEntity toEntity( ){
        return StudentEntity.builder()
                .studentName(this.studentName)
                .build();
    }

    public static StudentDto from( StudentEntity entity ){
        return StudentDto.builder()
            .studentId( entity.getStudentId() )
            .studentName( entity.getStudentName() )
            .createdAt( entity.getCreatedAt() )
            .updatedAt( entity.getUpdatedAt() )
            .build();
    }
}
