package com.luisunzueta.cursojava.repositories;

import com.luisunzueta.cursojava.entities.Category;
import com.luisunzueta.cursojava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
