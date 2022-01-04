package com.boa.inventoryservice.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Embeddable
public class ProductDescription {
    @Column(name="Product_Name",nullable = false,length = 100)
	private String productName;
    @Column(name="Manufacturer_Name",nullable = false,length = 100)
	private String manuFacturerName;
    @Column(name="Production_Date")
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dom;
    @Column(name="Production_Expiry")
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate doe;
    @Column(name="Cost")
    private long cost;
     
}
