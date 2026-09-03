package example.practice3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "test")
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter @ToString
public class MovieEntity 
    extends BaseTime {
        @Id
        @GeneratedValue( strategy = GenerationType.IDENTITY )
        private Integer movieid;
        @Column( nullable = false )
        private String title;
        @Column( nullable = false)
        private String director;
        @Column( nullable = false)
        private double rating;
    
}
