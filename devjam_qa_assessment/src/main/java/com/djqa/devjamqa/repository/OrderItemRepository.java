package com.djqa.devjamqa.repository;

import org.springframework.data.repository.CrudRepository;

import com.djqa.devjamqa.entity.OrderItemDao;

public interface OrderItemRepository extends CrudRepository<OrderItemDao, Long>{

}
