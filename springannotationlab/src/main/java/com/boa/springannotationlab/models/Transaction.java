package com.boa.springannotationlab.models;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Transaction {

	private long transactionId;
	private long amount;
}
