package com.boa.springannotationlab.utility;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.boa.springannotationlab.models.ATM;
import com.boa.springannotationlab.models.Customer;
import com.boa.springannotationlab.models.RefillCash;

public class IOCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/boa/"
				+ "springannotationlab/resources/spring-config.xml");
		
		Customer customer=(Customer) ctx.getBean("customer");
		System.out.println(customer.getTransaction().getTransactionId());
		System.out.println(customer.getTransaction().getATM().getAtmCode());
	//to access predestroy
		ctx.registerShutdownHook();
		//import configuration
		ApplicationContext annCtx = new  AnnotationConfigApplicationContext
				(RefillCash.class);
	         ATM atm=(ATM) annCtx.getBean("atm");
	    
	         
	}

}
