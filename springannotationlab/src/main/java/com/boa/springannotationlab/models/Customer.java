package com.boa.springannotationlab.models;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

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
	public Customer(Transaction transaction) {
		
	}

}
