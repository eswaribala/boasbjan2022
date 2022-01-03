package com.boa.springannotationlab.facades;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FileLogger implements Logger{

	@Override
	public boolean writeMessage(String message) {
		// TODO Auto-generated method stub
		return true;
	}

}
