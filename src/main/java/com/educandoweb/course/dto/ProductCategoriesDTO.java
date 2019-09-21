package com.educandoweb.course.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.educandoweb.course.entities.Product;

public class ProductCategoriesDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String description;
	private Double price;
	private List<CategoryDTO> categories = new ArrayList<>();
	private String imgUrl;

	public ProductCategoriesDTO(String name, String description, Double price, String imgUrl) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}


	public ProductCategoriesDTO(Product entity) {
		setName(entity.getName());
		setDescription(entity.getDescription());
		setPrice(entity.getPrice());
		setImgUrl(entity.getImgUrl());
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


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Product toEntity() {
		return new Product(null, name, description, price, imgUrl);
	}

}
