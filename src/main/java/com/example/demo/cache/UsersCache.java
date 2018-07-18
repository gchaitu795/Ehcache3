package com.example.demo.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.example.demo.modal.Users;
import com.example.demo.repository.UsersRepository;

@Component
public class UsersCache {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Cacheable(value = "usersCache", key = "#name")
	public Users getUser(String name) {
		System.out.println("Retreving from database for name" + name);
		return usersRepository.findByName(name);
	}
}
