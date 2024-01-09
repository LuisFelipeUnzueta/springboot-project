package com.luisunzueta.cursojava.repositories;

import com.luisunzueta.cursojava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
