package com.heitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitor.course.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
