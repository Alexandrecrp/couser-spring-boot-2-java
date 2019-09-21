package com.educandoweb.course.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value= {"products"})
public class CategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private Long id;
	private Set<Product> products = new HashSet<>();

	public CategoryDTO() {
	}

	public CategoryDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.products = entity.getProducts();
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

	public Set<Product> getProducts() {
		return products;
	}

	public Category toEntity() {
		return new Category(id, name);
	}
}
