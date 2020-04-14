package com.heitor.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heitor.course.entity.Product;
import com.heitor.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repositorie;
	
	public List<Product> findAll(){
		return repositorie.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repositorie.findById(id);
		return obj.get();
	}
	
}
