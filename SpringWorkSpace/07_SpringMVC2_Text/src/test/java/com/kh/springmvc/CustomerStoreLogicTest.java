package com.kh.springmvc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kh.springmvc.customer.domain.Customer;
import com.kh.springmvc.customer.store.CustomerStoreLogic;

//스프링에서 jUnit을 사용하기 위한 어노테이션이 필요하다., db관련 설정
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"
								 ,"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class CustomerStoreLogicTest {

	//테스트하고자 하는 클래스, 결과값을 테스트해주는 기능이 있다.
	@Autowired
	private CustomerStoreLogic store;
	
	@Test
	public void testInsertCustomer() {
		Customer customer = new Customer();
		customer.setId("khuser01");
		customer.setName("일용자");
		customer.setAge(21);
		int result = store.insertCustomer(customer);
		assertEquals(1, result);
	}

}
