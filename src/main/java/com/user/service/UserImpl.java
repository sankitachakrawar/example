package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.repository.UserRepository;

@Service
public class UserImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	//save the data
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	//fetch data 
	@Override
	public List<User> fetchData() {
		
		return (List<User>)userRepository.findAll();
		
		
	}

	/*public User getUser(String uname) {
		return this.getUser(uname).stream().filter((user))
	}
		*/	
	}
