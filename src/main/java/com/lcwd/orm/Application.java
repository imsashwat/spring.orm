package com.lcwd.orm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lcwd.orm.entities.User;
import com.lcwd.orm.services.UserService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();

		user.setName("Ankit");
		user.setCity("Delhi");
		user.setAge(34);

		User savedUser = userService.saveUser(user);
		System.out.print(savedUser);
	}

}
