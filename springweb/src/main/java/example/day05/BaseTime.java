package example.day05;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@MappedSuperclass
@EntityListeners( AuditingEntityListener.class )
public class BaseTime {
    
    // 1. 레코드 생성 시점
    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    // 2. 레코드 변경 시점
    private LocalDateTime updateDate;
}
