package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.model.service.MemberService;
import com.kh.model.vo.Member;

@WebServlet("/member/mypage.do")
public class MyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService memberService = new MemberService();

	public MyInfoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberIdInput = request.getParameter("memberId");
		Member member = null;
		member = memberService.selectMyInfo(memberIdInput);
		if (member != null) {
			// 성공 시 myinfo.jsp로 member객체를 보내주어야 한다.
			request.setAttribute("member", member);
			RequestDispatcher view = request.getRequestDispatcher("/member/myinfo.jsp");
			view.forward(request, response);

		} else {
			// 실패 시 에러페이지 이동 myinfoError.jsp
			response.sendRedirect("/member/myinfoError.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
