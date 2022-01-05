package com.redis.demo.demo.web.repository;

import com.redis.demo.demo.web.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
