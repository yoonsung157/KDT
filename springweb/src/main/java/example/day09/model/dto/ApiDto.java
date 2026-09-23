package example.day09.model.dto;

import java.time.LocalDateTime;

import example.day09.model.entity.ApiEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data @Builder 
public class ApiDto {
    
    private Integer id;
    private String subject;
    private String name;
    private String regdate;
    private String content;

    public ApiEntity toEntity() {
        return ApiEntity.builder()
        .subject(this.subject)
        .name(this.name)
        .regdate(LocalDateTime.now().toString() )
        .content(this.content)
        .build();
    }
    
    public static ApiDto from(ApiEntity entity){
        return ApiDto.builder()
        .id(entity.getId() )
        .subject(entity.getSubject() )
        .name(entity.getName() )
        .regdate(entity.getRegdate() )
        .content(entity.getContent() )
        .build();
    }
}
