package example.practice4.model.dto;

import example.practice4.model.entity.EnrollEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder 
public class EnrollDto {
    private Integer enrollId;
    private String status;
    private Integer courseId;
    private Integer studentId;
    private String courseName;
    private String studentName;

    public EnrollEntity toEntity( ){
        return EnrollEntity.builder()
                .status( this.status )
                .build();
    }

    public static EnrollDto from( EnrollEntity entity ){
        return EnrollDto.builder()
                .enrollId( entity.getEnrollId() )
                .status( entity.getStatus() )
                .courseName( entity.getCourseEntity().getCourseName() )
                .studentName( entity.getStudentEntity().getStudentName() )
                .build();
    }
}
