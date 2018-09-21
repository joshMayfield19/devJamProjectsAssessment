package com.djqa.devjamqa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.djqa.devjamqa.entity.UserDao;

@Repository
public interface UserRepository extends CrudRepository<UserDao, Long>{

	
	UserDao findByUsername(String username);
}
