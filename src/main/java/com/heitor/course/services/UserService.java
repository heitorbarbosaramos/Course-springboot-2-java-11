package com.heitor.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.heitor.course.entity.User;
import com.heitor.course.repositories.UserRepository;

import services.exceptions.DatabaseException;
import services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repositorie;
	
	public List<User> findAll(){
		return repositorie.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repositorie.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repositorie.save(obj);
	}
	
	public void delete (Long id) {
		try {
			repositorie.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		User entities = repositorie.getOne(id);
		updateData(entities, obj);
		return repositorie.save(entities);
	}

	private void updateData(User entities, User obj) {
		entities.setNome(obj.getNome());
		entities.setEmail(obj.getEmail());
		entities.setPhone(obj.getPhone());
	}
	
}
