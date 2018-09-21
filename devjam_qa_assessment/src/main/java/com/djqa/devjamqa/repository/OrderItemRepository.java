package com.djqa.devjamqa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.djqa.devjamqa.entity.OrderItemDao;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItemDao, Long>{

}
