package com.boa.springannotationlab.models;

import lombok.Data;

@Data
public class Transaction {

	private long transactionId;
	private long amount;
}
