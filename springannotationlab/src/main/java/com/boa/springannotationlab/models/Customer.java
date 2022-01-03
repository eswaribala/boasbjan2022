package com.boa.springannotationlab.models;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	private long customerId;
	private String name;
	//private LocalDate dob;
	private String email;
	@Autowired
	@Qualifier(value = "transaction2")
	private Transaction transaction;
	
	/*
	 * public Customer(Transaction transaction) { this.transaction=transaction; }
	 */

}
