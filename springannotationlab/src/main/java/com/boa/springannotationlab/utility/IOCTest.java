package com.boa.springannotationlab.utility;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.boa.springannotationlab.models.Customer;
import com.boa.springannotationlab.models.RefillCash;

public class IOCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/boa/"
				+ "springannotationlab/resources/spring-config.xml");
		
		Customer customer=(Customer) ctx.getBean("customer");
		System.out.println(customer.getTransaction().getTransactionId());
		System.out.println(customer.getTransaction().getATM().getAtmCode());
	
		RefillCash refillCash=(RefillCash) ctx.getBean("refillCash");
	
	}

}
