package com.luisunzueta.cursojava.repositories;

import com.luisunzueta.cursojava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
