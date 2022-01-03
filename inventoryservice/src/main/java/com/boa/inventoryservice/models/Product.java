package com.boa.inventoryservice.models;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Product_Id")
	private long productId;
	@Embedded
	//value object
	private ProductDescription productDescription;
	@Enumerated(EnumType.STRING)
	@Column(name="Product_Type")
	private ProductType productType;
	
	

}
