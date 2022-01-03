package com.boa.springannotationlab.models;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.boa.springannotationlab.facades.Logger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Component
@Data
public class Customer {
	
	private long customerId;
	private String name;
	//private LocalDate dob;
	private String email;
	@Autowired
	//@Qualifier(value = "transaction2")
	private Transaction transaction;	
	private Logger logger;
	 @Autowired
	 public Customer(Logger logger) { 
		 this.logger=logger;
		 }
	 

}
