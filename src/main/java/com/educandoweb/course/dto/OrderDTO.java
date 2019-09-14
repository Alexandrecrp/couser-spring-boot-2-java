package com.educandoweb.course.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.Payment;
import com.educandoweb.course.entities.enums.OrderStatus;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Instant moment;
	private Integer orderStatus;
	private UserDTO client;
	private List<ProductDTO> items = new ArrayList<ProductDTO>();
	private Payment payment;

	public OrderDTO(Long id, Instant moment, Integer orderStatus, UserDTO client, List<ProductDTO> items,
			Payment payment) {
		super();
		this.id = id;
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
		this.items = items;
		this.payment = payment;
	}

	public OrderDTO(Order order) {
		this.id = order.getId();
		this.moment = order.getMoment();
		this.orderStatus = order.getOrderstatus().getCode();
		this.client = new UserDTO(order.getClient());
		this.items = order.getItems().stream().map(e -> new ProductDTO(e.getProduct())).collect(Collectors.toList());
		this.payment = order.getPayment();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public UserDTO getClient() {
		return client;
	}

	public void setClient(UserDTO client) {
		this.client = client;
	}

	public List<ProductDTO> getItems() {
		return items;
	}

	public void setItems(List<ProductDTO> items) {
		this.items = items;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Order toEnttiy() {
		return new Order(id, moment, OrderStatus.valueOf(orderStatus), client.toEntity());
	}


}
