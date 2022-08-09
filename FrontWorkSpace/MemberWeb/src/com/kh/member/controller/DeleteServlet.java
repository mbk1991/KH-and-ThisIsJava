package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.model.service.MemberService;

@WebServlet("/member/delete.do")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberService memberService = new MemberService();
		String memberId = (String)session.getAttribute("memberId");
		int result = memberService.deleteMember(memberId);
		if(result > 0) {
			//세션에 있는 정보 파괴/ 비즈니스 로직 성공 후 처리 예정 / 세션에 있는 정보를 파괴하는 url을 적음(logout)
//			session.invalidate();
//			response.sendRedirect("/index.jsp");
			response.sendRedirect("/member/logout.do"); // logout.do에 구현한 로그아웃 기능을 이용.
		}else {
			response.sendRedirect("/member/memberError.html");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
