package example.day13;
import lombok.*;
import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class BoardDto {
    private Long id;
    private String title;
    private String content;

    // 파일 업로드( 파일은 문자가 아닌 바이트이므로 특정한 인터페이스 사용) String [x]
    private MultipartFile file; // 업로드/등록용
    private String fileName;    // 출력용
    private LocalDateTime createDate; // 프론트에 전달할 작성일자
    public BoardEntity toEntity() {
        return BoardEntity.builder()
                .title(title)
                .content(content)
                .build();
    }
    public static BoardDto fromEntity(BoardEntity entity) {
        return BoardDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .fileName(entity.getFileName())
                .createDate(entity.getCreateDate())
                .build();
    }
}