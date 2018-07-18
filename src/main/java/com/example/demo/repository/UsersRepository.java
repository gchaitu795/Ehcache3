package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.Users;

public interface UsersRepository extends CrudRepository<Users, Long>{

	Users findByName(String name);
}
