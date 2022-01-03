package com.boa.springannotationlab.models;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Transaction.class)
public class RefillCash {

}
