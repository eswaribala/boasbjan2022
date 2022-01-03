package com.boa.springannotationlab.facades;

import org.springframework.stereotype.Component;

@Component
public interface Logger {
	
	boolean writeMessage(String message);

}
