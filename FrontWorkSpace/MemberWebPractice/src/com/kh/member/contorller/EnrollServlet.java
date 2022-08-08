package com.kh.member.contorller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.model.vo.Member;
import com.kh.member.service.MemberService;

@WebServlet("/member/enroll.do")
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Member member = null;
	MemberService mService = new MemberService();
       
    public EnrollServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String memberId = request.getParameter("id");
		String memberPwd = request.getParameter("pwd1");
		String memberName = request.getParameter("name");
		String yyyy = request.getParameter("yyyy");
		String mm = request.getParameter("mm");
		String dd = request.getParameter("dd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		member = new Member(memberId, memberPwd, memberName,
				yyyy, mm, dd, email, phone);
		
		int result = mService.memberInsert(member);
		if(result > 0) {
			response.sendRedirect("/member/enrollSuccess.jsp");
		}else {
			response.sendRedirect("/member/enrollError.jsp");
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
