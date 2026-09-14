package example.totalpractice1.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.totalpractice1.model.entity.ReviewEntity;

@Repository 
public interface ReviewRepository extends JpaRepository <ReviewEntity, Integer>{
}