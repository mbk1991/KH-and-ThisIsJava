package com.kh.springmvc.customer.store;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.springmvc.customer.domain.Customer;

@Repository
public class CustomerStoreLogic {
	@Autowired
	private SqlSession session;
	
	public int insertCustomer(Customer customer) {
		return session.insert("CustomerMapper.insertCustomer", customer);
	}
}
