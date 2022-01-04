package com.boa.inventoryui.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data

public class Product {
	
	private long productId;
	
	private ProductDescription productDescription;
	
	private ProductType productType;
	
	private Category category;
	
	

}
