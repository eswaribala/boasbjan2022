package com.boa.inventoryui.models;

import java.util.List;

import lombok.Data;

@Data

public class Category {
	
	private long categoryId;
	
	private String categoryName;	
	 
	private List<Product> productList;
	
}
