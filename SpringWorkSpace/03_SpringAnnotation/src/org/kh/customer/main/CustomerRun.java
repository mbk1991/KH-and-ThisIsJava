package org.kh.customer.main;

import java.util.List;

import org.kh.customer.domain.Customer;
import org.kh.customer.service.CustomerService;
import org.kh.customer.service.logic.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomerRun {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		CustomerService cService = (CustomerServiceImpl)ctx.getBean("customerService");
		List<Customer> cList = cService.findAll();
		for(Customer cOne : cList) {
			System.out.println(cOne.toString());
		}
	
	}
}
