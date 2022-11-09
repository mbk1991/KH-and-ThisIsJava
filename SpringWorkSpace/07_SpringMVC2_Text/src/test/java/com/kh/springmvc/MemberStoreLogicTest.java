package com.kh.springmvc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kh.springmvc.member.domain.Member;
import com.kh.springmvc.member.store.logic.MemberStoreLogic;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"
		 ,"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class MemberStoreLogicTest {
	@Autowired
	private SqlSession session;
	@Autowired
	private MemberStoreLogic store;
	
	
	@Test
	public void testSelectLoginMember() {
		Member member = new Member();
		member.setMemberId("khuser101");
		member.setMemberPwd("pass101");
		Member mOne = store.selectLoginMember(session, member);
		assertEquals("khuser101",mOne.getMemberId());
	}

	@Test
	public void testSelectOneById() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertMember() {
		Member member = new Member();
		member.setMemberId("khuser101");
		member.setMemberPwd("pass101");
		member.setMemberName("백일용자");
		int result = store.insertMember(session, member);
		assertEquals(1, result);
		
	}

	@Test
	public void testUpdateMember() {
		
	}

	@Test
	public void testDeleteMember() {
		fail("Not yet implemented");
	}

}
