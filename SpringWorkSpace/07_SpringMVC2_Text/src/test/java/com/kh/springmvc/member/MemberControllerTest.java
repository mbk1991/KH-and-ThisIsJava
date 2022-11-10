package com.kh.springmvc.member;

import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


// Controller 및 웹 환경에서 사용되는 빈을 자동 생성 등록
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"
								 ,"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class MemberControllerTest {

	
	private static final Logger logger = LoggerFactory.getLogger(MemberControllerTest.class);
	
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		//mockMvc를 사용하기 위해 builder와 wac객체를 이용하여 setup!
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		logger.info("setup()완료!!!");
	}
	@Test
	public void testMemberRegister() throws Exception{
		try {
			mockMvc.perform(
					post("/memberRegister.do")
					.param("userId","khadmin")
					.param("password","qwer1234")
					.param("name","김경호")
					.param("email","khadmin@kh.com")
					.param("tel","01011231234"))
			.andDo(print())
			.andExpect(status().isOk());
			logger.info(">>>>>테스트 수행 성공! <<<<<");
		} catch (Exception e) {
		}
		
	}
	
//	@Test
//	public void testMemberJoinView() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMemberJoin() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMemberLogin() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMemberLogout() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testShowMyPage() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testModifyMember() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemoveMember() {
//		fail("Not yet implemented");
//	}

}
