package example.practice4.model.entity;

import java.util.ArrayList;
import java.util.List;

import example.Mini2.BaseTime;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Table (name="course")
@NoArgsConstructor @AllArgsConstructor @Builder @Data 
public class CourseEntity extends example.practice4.model.entity.BaseTime {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer courseId;
    private String courseName;

    @OneToMany(mappedBy = "courseEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @Builder.Default
    private List<EnrollEntity> enrollList = new ArrayList<>();
}
