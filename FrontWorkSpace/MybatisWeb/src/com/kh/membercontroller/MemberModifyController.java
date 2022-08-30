package com.kh.membercontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.model.service.MemberServiceImpl;
import com.kh.member.model.vo.Member;

@WebServlet("/member/modify.do")
public class MemberModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/member/modify.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String memberId = request.getParameter("");
		String memberPwd = request.getParameter("userPwd");
		String memberAddress = request.getParameter("userAddr");
		Member mOne = new Member();
		mOne.setMemberPwd(memberPwd);
		mOne.setMemberAddress(memberAddress);
		//UPDATE MEMBER_TBL SET MEMBER_PWD=#{memberPwd}, MEMBER_ADDRESS=#{memberAddress} WHERE MEMBER_ID=#{memberId}
		
		int result = new MemberServiceImpl().updateMember(mOne);
		if(result>0) {
			//성공 시 정보수정이 완료되었습니다! 출력 후 리스트 이동
		}
		//실패 시 errorPage.jsp로 에러내용 출력
	}
}
