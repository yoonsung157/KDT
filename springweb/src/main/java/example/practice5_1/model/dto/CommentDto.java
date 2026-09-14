package example.practice5_1.model.dto;

import java.time.LocalDateTime;

import example.practice5_1.model.entity.CommentEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor @AllArgsConstructor @Data @Builder 
public class CommentDto {
    private Integer id;
    private String author;
    private String content;
    private String password;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Integer boardId;

    public CommentEntity toEntity() {
        return CommentEntity.builder()
        .author(this.author)
        .content(this.content)
        .password(this.password)
        .build();
    }

    public static CommentDto from(CommentEntity entity) {
        return CommentDto.builder()
        .id(entity.getId() )
        .author(entity.getAuthor() )
        .content(entity.getContent() )
        .password(entity.getPassword() )
        .createdAt(entity.getCreatedAt() )
        .updatedAt(entity.getUpdatedAt() )
        .build();
    }
}
