package com.heitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitor.course.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
