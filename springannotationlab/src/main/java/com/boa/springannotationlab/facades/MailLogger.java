package com.boa.springannotationlab.facades;

import org.springframework.stereotype.Component;

@Component
public class MailLogger implements Logger{

	@Override
	public boolean writeMessage(String message) {
		// TODO Auto-generated method stub
		return true;
	}

}
