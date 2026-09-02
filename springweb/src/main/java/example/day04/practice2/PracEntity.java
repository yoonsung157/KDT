package example.day04.practice2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "exam")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PracEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer eno;
    private String econtent;
    private String ewriter;

}
