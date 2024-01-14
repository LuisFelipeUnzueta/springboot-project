package com.luisunzueta.cursojava.repositories;

import com.luisunzueta.cursojava.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
