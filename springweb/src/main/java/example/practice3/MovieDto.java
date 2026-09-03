package example.practice3;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter @ToString

public class MovieDto {
    private Integer movieid;
    private String title;
    private String director;
    private double rating;
    private LocalDate releasedate;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public MovieEntity toEntity() {
        return MovieEntity.builder()
        .title( this.title )
        .director( this.director )
        .rating( this.rating )
        .releasedate(this.releasedate)
        .build();
    }

    public static MovieDto from( MovieEntity movieEntity ) {
        return MovieDto.builder()
        .movieid( movieEntity.getMovieid() )
        .title( movieEntity.getTitle() )
        .director( movieEntity.getDirector() )
        .rating( movieEntity.getRating() )
        .releasedate( movieEntity.getReleasedate() )
        .createDate( movieEntity.getCreateDate() )
        .updateDate( movieEntity.getUpdateDate() )
        .build();
    }

}
