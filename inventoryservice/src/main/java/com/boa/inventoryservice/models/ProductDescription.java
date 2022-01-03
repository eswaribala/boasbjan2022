package com.boa.inventoryservice.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Embeddable
public class ProductDescription {
    @Column(name="Product_Name")
	private String productName;
    @Column(name="Manufacturer_Name")
	private String manuFacturerName;
    @Column(name="Production_Date")
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dop;
    @Column(name="Production_Expiry")
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate doe;
     
}
