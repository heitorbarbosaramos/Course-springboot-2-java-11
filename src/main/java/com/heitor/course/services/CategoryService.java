package com.heitor.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heitor.course.entity.Category;
import com.heitor.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repositorie;
	
	public List<Category> findAll(){
		return repositorie.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repositorie.findById(id);
		return obj.get();
	}
	
}
