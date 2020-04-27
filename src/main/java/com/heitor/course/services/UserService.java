package com.heitor.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heitor.course.entity.User;
import com.heitor.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repositorie;
	
	public List<User> findAll(){
		return repositorie.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repositorie.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repositorie.save(obj);
	}
	
	public void delete (Long id) {
		repositorie.deleteById(id);
	}
	
}
