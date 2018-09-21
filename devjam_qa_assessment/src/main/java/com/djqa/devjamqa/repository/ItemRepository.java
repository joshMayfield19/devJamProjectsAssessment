package com.djqa.devjamqa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.djqa.devjamqa.entity.ItemDao;

@Repository
public interface ItemRepository extends CrudRepository<ItemDao, Long>{

}
