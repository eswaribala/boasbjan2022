package com.boa.inventoryui.models;

import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;


@Data
public class ProductDescription {
   
	private String productName;
   
	private String manuFacturerName;
 
    
    private LocalDate dom;
   

    private LocalDate doe;
  
    private long cost;
     
}
