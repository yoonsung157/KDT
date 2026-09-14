package example.practice5_1.model.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import example.practice5_1.model.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data @Builder 
public class BoardDto {
    private Integer id;
    private String author;
    private String content;
    private String password;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @Builder.Default
    private List<CommentDto> comments = new ArrayList<>();

    public BoardEntity toEntity() {
        return BoardEntity.builder()
        .author(this.author)
        .content(this.content)
        .password(this.password)
        .build();
    }

    public static BoardDto from(BoardEntity entity){
        return BoardDto.builder()
        .id(entity.getId() )
        .author(entity.getAuthor() )
        .content(entity.getContent() )
        .password(entity.getPassword() )
        .createdAt(entity.getCreatedAt() )
        .updatedAt(entity.getUpdatedAt() )
        .build();
    }
}
