package example.practice6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import example.practice6.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
    @Query ("SELECT p FROM Product p JOIN FETCH p.category")
    List<Product> findAllWithCategory();
}