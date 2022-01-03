package com.boa.springcorelab.models;

import java.time.LocalDate;

import lombok.Data;
@Data
public class Customer {
	
	private long customerId;
	private String name;
	private LocalDate dob;
	private String email;

}
