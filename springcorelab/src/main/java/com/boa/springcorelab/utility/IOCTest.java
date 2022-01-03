package com.boa.springcorelab.utility;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.boa.springcorelab.models.Customer;

public class IOCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource=new ClassPathResource("com/boa/springcorelab"
				+ "/resources/spring-config.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		//IOC
		Customer customer=(Customer) beanFactory.getBean("customer");
		//testing DI
		System.out.println(customer);
	}

}
