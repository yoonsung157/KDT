package example.practice6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.practice6.entity.Review;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByProduct_Bno(Long bno);
}