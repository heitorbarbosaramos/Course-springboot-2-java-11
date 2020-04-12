package com.heitor.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.heitor.course.entity.User;
import com.heitor.course.repositories.UserRepository;

@Configuration
@Profile("test")//application.properties =  spring.profiles.active
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository useRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Heitor Ramos", "9909909", "heitor@gmail.com", "123123");
		
		useRepository.saveAll(Arrays.asList(u1,u2,u3));
	}

}
