package com.heitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitor.course.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
