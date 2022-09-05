package org.kh.customer.service.logic;

import java.util.List;

import org.kh.customer.domain.Customer;
import org.kh.customer.service.CustomerService;
import org.kh.customer.store.CustomerStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Service 나중에는 Service어노테이션으로 쓴다.
@Component("customerService")  // 빈으로 등록.
public class CustomerServiceImpl implements CustomerService {
	// StoreLogic의 객체를 사용한다.
	// 원래는 Composition으로 강한 결합 상태임.
	// 강한 결합을 해결할 수 있는 방법.
	// 강한결합의 해소.
	// 강한결합은 종속적이기 때문에.
	// 강한결합은 객체의 라이프사이클을 같이하기 때문에
	// 계속 객체를 새로 만들기 때문.
	// 중간 인터페이스를 통해 강한결합을 해소한다.
//	private CustomerStoreLogic cStore;;
//	public CustomerServiceImpl() {
//		cStore = new CustomerStoreLogic();
//	}
	
	//안 쓰면 널포인트익셉션 발생!
	@Autowired(required = false) // 오류를 무시하는 설정이 required = false
	@Qualifier("cStore")
	private CustomerStore cStore;
	//세터를 이용한 의존성 주입. xml에서 setter인 것을 어떻게 인식하는거지?
	
	public CustomerServiceImpl() {}
	
	public CustomerServiceImpl(CustomerStore cStore) {
		this.cStore = cStore;
	}
	
	public void setStore(CustomerStore cStore) {
		this.cStore = cStore;
	}
	@Override
	public List<Customer> findAll() {
		List<Customer> cList = cStore.selectAll();
		return cList;
	}
}
