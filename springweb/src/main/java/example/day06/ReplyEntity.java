package example.day06;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Table( name = "reply" )
@NoArgsConstructor @AllArgsConstructor @Builder @Data

public class ReplyEntity {
    @Id
    private Integer rno;
    private String rname;
    // 단방향 참조
    @ManyToOne( cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @JoinColumn( name = "bno" )
    private BoardEntity boardEntity;
}

/*
    - 영속성이란? 자바는 영구저장이 불가능하므로 DB 매핑/연결하여 영속성(영구저장) 표현
        - Entity entity = new entity(); // 객체
        - repository.save( ), repository.findAll( ), repository.findById( ) 등등 결과 영속된
        - 즉) Entity 영속된entity = repository.save( 비영속 entity )
    - @ManyToOne( cascade = 영속성제약조건, fetch = 불러오기시기 )
    - CascadeType
        CascadeType.REMOVE : 만일 부모 엔티티가 삭제되면 자식 엔티티 같이 삭제된다.
        CascadeType.MERGE : 만일 부모 엔티티가 수정되면 자식 엔티티 수정 값이 반영된다.
        CascadeType.DETACH : 만일 부모 엔티티가 영속(연결)해제하면 자식 엔티티도 같이 해제한다.
        CascadeType.REFRESH : 만약 부모 엔티티가 재호출(갱신)되면 자식 엔티티 같이 갱신한다.
        CascadeType.PERSIST : 만약 부모 엔티티가 저장하면 자식 엔티티 같이 저장한다.
        CascadeType.ALL : 위 속성들을 모두 사용
    - fetch
        FetchType.LAZY : 해당 엔티티 조회시 자식(참조) 엔티티 불러오지 않는다.
            - 초기 로딩 빠르다. 재사용성 느리다. 필요한 정보만 불러온다. <지연로딩>
            - 즉) 
        FetchType.EAGER : 해당 엔티티 조회시 자식(참조) 엔티티 (즉시) 불러온다. 손자도 포함.
            - 기본값, 초기로딩은 느림, 재사용성 빠름, 불필요한 정보까지 불러옴.(성능저하) 
*/
