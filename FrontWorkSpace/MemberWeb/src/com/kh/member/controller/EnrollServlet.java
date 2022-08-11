package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.model.service.MemberService;
import com.kh.model.vo.Member;

@WebServlet("/member/enroll.do")
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService memberService = new MemberService();
       
    public EnrollServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String memberId = request.getParameter("member-id");
		String memberPwd = request.getParameter("member-pwd");
		String memberName = request.getParameter("member-name");
		int memberAge = Integer.parseInt(request.getParameter("member-age"));
		String memberEmail = request.getParameter("member-email");
		String memberPhone = request.getParameter("member-phone");
		String memberAddress = request.getParameter("member-address");
		String memberGender = request.getParameter("gender");
		String memberHobby = request.getParameter("member-hobby");
		
		Member member = new Member(memberId, memberPwd, memberName, 
				memberAge, memberEmail, memberPhone, memberAddress, 
				memberGender, memberHobby);
		int result = memberService.insertMember(member);
		if(result >0) {
			response.sendRedirect("/member/enrollSuccess.html");
		}else {
			response.sendRedirect("/member/enrollError.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
