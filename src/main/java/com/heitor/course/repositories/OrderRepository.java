package com.heitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitor.course.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
