package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByEmail(String email);
	Optional<User> findByUsername(String username);
}
