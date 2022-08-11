package com.kh.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.model.service.MemberService;
import com.kh.model.vo.Member;

@WebServlet("/member/view.do")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService memberService = null;
	ArrayList<Member> mList = null;
       
    public ViewServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			memberService = new MemberService();
			mList = memberService.selectAllMember();
			if(!mList.isEmpty()) {
				//성공하면 memberList.jsp로 이동.
				request.setAttribute("mList", mList);
				RequestDispatcher view = 
						request.getRequestDispatcher("/member/memberList.jsp");
				view.forward(request, response);
				
				
				
			}else {
				response.sendRedirect("/member/memberError.html");
			}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
