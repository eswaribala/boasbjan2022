package com.boa.springannotationlab.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Configuration
public class Transaction {

	
	private long transactionId;
	private long amount;
	
	@Bean
	public ATM getATM() {
		return new ATM();
	}
}
