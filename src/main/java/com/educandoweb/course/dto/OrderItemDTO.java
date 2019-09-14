package com.educandoweb.course.dto;

import java.io.Serializable;

import com.educandoweb.course.entities.OrderItem;

public class OrderItemDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer quantity;
	private Double price;

	public OrderItemDTO(Long id, Integer quantity, Double price) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
	}

	public OrderItemDTO(OrderItem orderItem) {
		this.id = orderItem.getOrder().getId();
		this.quantity = orderItem.getQuantity();
		this.price = orderItem.getPrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
