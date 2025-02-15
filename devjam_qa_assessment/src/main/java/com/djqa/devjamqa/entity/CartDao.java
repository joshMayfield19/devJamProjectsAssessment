package com.djqa.devjamqa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table
@AllArgsConstructor
@Data
public class CartDao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long orderId;
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.MERGE, mappedBy="cart")
    private List<OrderItemDao> orderItems = new ArrayList<>();
	private Long userId;
	private String status;

}
