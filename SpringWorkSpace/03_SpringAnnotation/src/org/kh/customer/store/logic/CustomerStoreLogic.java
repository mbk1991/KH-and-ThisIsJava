package org.kh.customer.store.logic;

import java.util.ArrayList;
import java.util.List;

import org.kh.customer.domain.Customer;
import org.kh.customer.store.CustomerStore;

public class CustomerStoreLogic implements CustomerStore {

	@Override
	public List<Customer> selectAll() {
		List<Customer> cList = new ArrayList<Customer>();
		
		//더미데이터 만들기.
		for(int i=0; i<10; i++) {
			Customer cOne = new Customer();
			cOne.setId(i+"");
			cOne.setName(i+"");
			cOne.setAddress(String.valueOf(i));
			cOne.setEmail(new StringBuffer().append(i).toString());
			cList.add(cOne);
		}
		return cList;
	}

}
