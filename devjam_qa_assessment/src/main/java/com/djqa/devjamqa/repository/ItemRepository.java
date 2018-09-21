package com.djqa.devjamqa.repository;

import org.springframework.data.repository.CrudRepository;

import com.djqa.devjamqa.entity.ItemDao;

public interface ItemRepository extends CrudRepository<ItemDao, Long>{

}
