package com.boa.inventoryservice.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="Category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Category_Id")
	private long categoryId;
	@Column(name="Category_Name",nullable = false,length = 100)
	private String categoryName;
	@OneToMany
	private List<Product> productList;
	
}
