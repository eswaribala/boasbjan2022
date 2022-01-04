package com.boa.inventoryui.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	
	private long categoryId;
	
	private String categoryName;	
	 
	private List<Product> productList;
	
}
