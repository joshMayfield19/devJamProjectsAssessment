package com.djqa.devjamqa.repository;

import org.springframework.data.repository.CrudRepository;

import com.djqa.devjamqa.entity.UserDao;

public interface UserRepository extends CrudRepository<UserDao, Long>{

	UserDao findByUsername(String username);
}
