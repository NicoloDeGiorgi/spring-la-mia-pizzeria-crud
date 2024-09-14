package com.esercizio.pizzeria.Model;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="pizzas")
public class Pizza {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 100)
	private String name;
	
	@Column(length = 1000)
	private String description;
	
	@Column(name= "image_url", nullable = true)
	private String img_url;
	
	private double price;
	
	
	private Boolean availabe;
	
	@Column(name ="created_at")
	private LocalDateTime createdAt;
	
	@Column(name ="update_at")
	private LocalDateTime updatedAt;
	
	
	//GETTER E SETTER

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	public String getName() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}
	

	public String getDescription() {
		return description;
	}

	public void setDescriptione(String description) {
		this.description = description;
	}

	
	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double prezzo) {
		this.price = prezzo;
	}

	
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Boolean getAvailabe() {
		return availabe;
	}

	public void setAvailabe(Boolean availabe) {
		this.availabe = availabe;
	}

}