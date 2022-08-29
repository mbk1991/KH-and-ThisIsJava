package com.kh.membercontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.model.service.MemberServiceImpl;
import com.kh.member.model.vo.Member;

@WebServlet("/member/register.do")
public class MemberRegistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberRegistController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/member/regstForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 가입버튼 눌렀을 때 동작
		request.setCharacterEncoding("utf-8"); // 한글 깨지지 않게 입력
		String memberId = request.getParameter("userId");
		String memberPwd = request.getParameter("userPwd");
		String memberName = request.getParameter("userName");
		String memberAddr = request.getParameter("userAddr");
		Member member = new Member();
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberAddress(memberAddr);
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		try {
			int result = new MemberServiceImpl().registerMember(member);
			if (result > 0) {
				// 회원가입 완료 alert창 띄우기
				PrintWriter out = response.getWriter();
				out.print("<script>alert('회원가입성공');</script>");
				out.flush();
				out.close();
			}
		} catch (Exception e) {
			request.setAttribute("msg",e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request,response);
		}
	}
}
