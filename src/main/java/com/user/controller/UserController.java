package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	//save operation
	@PostMapping("/users")
	public User saveUser(@Validated   @RequestBody User user) {
		
		return userService.saveUser(user);
	}
	
	//fetch data
	@GetMapping("/getuser")
	public List<User> fetchData(){
		return userService.fetchData();
		
	}
	
	
}
