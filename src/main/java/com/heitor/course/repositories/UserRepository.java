package com.heitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitor.course.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
