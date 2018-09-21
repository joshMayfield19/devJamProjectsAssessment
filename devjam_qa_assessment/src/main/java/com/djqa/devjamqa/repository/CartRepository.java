package com.djqa.devjamqa.repository;

import org.springframework.data.repository.CrudRepository;

import com.djqa.devjamqa.entity.CartDao;

public interface CartRepository extends CrudRepository<CartDao, Long>{
	

}
