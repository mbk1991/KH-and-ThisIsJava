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

@WebServlet("/member/delete.do")
public class MemberDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Member member=(Member)session.getAttribute("member");
		String memberId = member.getMemberId();
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		try {
			int result = new MemberServiceImpl().deleteMember(memberId);
			if(result >0) {
				//성공하면 alert로 회원탈퇴가 완료되었습니다! 출력
				PrintWriter out = response.getWriter();
				out.println("<script>alert('회원탈퇴가 완료되었습니다!');location.href='/member/logout.do';</script>");
				out.flush();
				out.close();
			}
			//실패하면 에러메시지를 errorPage.jsp로 출력!
		} catch (Exception e) {
			request.setAttribute("msg",e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
