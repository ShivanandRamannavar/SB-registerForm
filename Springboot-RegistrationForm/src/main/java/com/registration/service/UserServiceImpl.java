package com.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.entity.User;
import com.registration.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
     @Autowired
	private UserRepository repo;
	
	
	@Override
	public void userRegister(User user) {
		
		
		repo.save(user);
		
	}

}
