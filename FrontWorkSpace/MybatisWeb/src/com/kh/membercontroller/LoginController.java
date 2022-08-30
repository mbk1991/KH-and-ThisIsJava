package com.kh.membercontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.model.service.MemberServiceImpl;
import com.kh.member.model.vo.Member;

@WebServlet("/member/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberId = request.getParameter("userId");
		String memberPwd = request.getParameter("userPwd");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		try {
			Member mOne = new MemberServiceImpl().printMemberLogin(memberId,memberPwd);
			
			if(mOne != null) {
				HttpSession session = request.getSession();
				session.setAttribute("member", mOne);
				response.sendRedirect("/index.jsp");
			}else {
				PrintWriter out = response.getWriter();
				out.println("<script>alert('회원정보가 없습니다.');location.href='/index.jsp';</script>");
				out.flush();
				out.close();
			}
		} catch (Exception e) {
			request.setAttribute("msg",e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request,response);
		}
	}
}
