package com.boa.springannotationlab.models;

import java.time.LocalDate;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.boa.springannotationlab.facades.Logger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@AllArgsConstructor
@NoArgsConstructor
@Component
@Data
public class Customer  implements BeanNameAware{
	
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
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
	}
	
	@PreDestroy
	public void beforeDestoryBean()
	{
		System.out.println("Invoked before bean destroyed");
	}
	
	

}
