package com.martacschmitt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martacschmitt.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
