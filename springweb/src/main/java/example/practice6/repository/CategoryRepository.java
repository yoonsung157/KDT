package example.practice6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.practice6.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}