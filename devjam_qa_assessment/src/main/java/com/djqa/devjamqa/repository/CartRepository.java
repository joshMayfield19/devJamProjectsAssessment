package com.djqa.devjamqa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.djqa.devjamqa.entity.CartDao;

@Repository
public interface CartRepository extends CrudRepository<CartDao, Long>{
	

}
