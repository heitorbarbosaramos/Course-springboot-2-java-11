package com.heitor.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heitor.course.entity.Order;
import com.heitor.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repositorie;
	
	public List<Order> findAll(){
		return repositorie.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repositorie.findById(id);
		return obj.get();
	}
	
}
