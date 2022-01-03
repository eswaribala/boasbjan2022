package com.boa.springcorelab.models;

import java.time.LocalDate;

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

}
