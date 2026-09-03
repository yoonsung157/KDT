package example.day05;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter @ToString
public class TestDto {
    private Integer no;
    private String name;
    private String descri;
    private Integer price;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    // DTO --> entity 함수 : c -> s(d -> e) , toEntity()
    // this란? 해당 메소드를 호출한 인스턴스를 가리킴
    public TestEntity toEntity() {
        return TestEntity.builder() // 빌더패턴이란? new 대신에 객체 생성을 메소드방식으로 지원
        .name( this.name )
        .descri( this.descri )
        .price(this.price)
        .build(); // 빌더패턴 끝
    }
    // entity --> dto 함수 : s -> c(e -> d), from( Entity entity ), 주로 find
    public static TestDto from( TestEntity testEntity ) {
        return TestDto.builder() // 빌더 시작, 순서/개수 상관없이 자유롭게 객체생성
            .no( testEntity.getNo() )
            .name( testEntity.getName() )
            .descri( testEntity.getDescri() )
            .price( testEntity.getPrice() )
            .createDate( testEntity.getCreateDate() )
            .updateDate(testEntity.getUpdateDate() )
            .build();
    }
}
