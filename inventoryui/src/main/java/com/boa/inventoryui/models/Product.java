package com.boa.inventoryui.models;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	private long productId;
	
	private ProductDescription productDescription;
	
	private ProductType productType;
	
	private Category category;
	
	

}
