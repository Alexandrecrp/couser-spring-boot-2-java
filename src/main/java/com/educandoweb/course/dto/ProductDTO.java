package com.educandoweb.course.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.educandoweb.course.entities.Product;

public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String description;
	private Double price;
	private List<CategoryDTO> categories = new ArrayList<>();
	private List<OrderDTO> items = new ArrayList<>();

	public ProductDTO(Long id, String name, String description, Double price, List<CategoryDTO> categories, List<OrderDTO> items) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.categories = categories;
		this.items = items;
	}


	public ProductDTO(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.description = product.getDescription();
		this.price = product.getPrice();
		this.categories = product.getCategories().stream().map(e -> new CategoryDTO(e)).collect(Collectors.toList());		
		this.items = product.getOrders().stream().map(e -> new OrderDTO(e)).collect(Collectors.toList());
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public List<CategoryDTO> getCategories() {
		return categories;
	}


	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}


	public List<OrderDTO> getItems() {
		return items;
	}


	public void setItems(List<OrderDTO> items) {
		this.items = items;
	}


	public Product toEntity() {
		return new Product(id, name, description, price, null);
	}

}
