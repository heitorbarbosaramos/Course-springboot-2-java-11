package com.heitor.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heitor.course.entity.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAl(){
		User u = new User(1l, "Maria", "99999999999", "maria@gmail");
		return ResponseEntity.ok().body(u);
	}
}
