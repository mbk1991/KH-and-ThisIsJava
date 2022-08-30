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

@WebServlet("/member/modify.do")
public class MemberModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Member mOne = (Member)session.getAttribute("member");
		String memberId=mOne.getMemberId();
		Member member = new MemberServiceImpl().printMemberById(memberId);
		request.setAttribute("member",member);
		request.getRequestDispatcher("/WEB-INF/views/member/modify.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String memberId = request.getParameter("userId");
		String memberPwd = request.getParameter("userPwd");
		String memberAddress = request.getParameter("userAddr");
		Member mOne = new Member();
		mOne.setMemberId(memberId);
		mOne.setMemberPwd(memberPwd);
		mOne.setMemberAddress(memberAddress);
		//UPDATE MEMBER_TBL SET MEMBER_PWD=#{memberPwd}, MEMBER_ADDRESS=#{memberAddress} WHERE MEMBER_ID=#{memberId}
		
		//실패 시 errorPage.jsp로 에러내용 출력
		
		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("utf-8");
			int result = new MemberServiceImpl().updateMember(mOne);
			if(result>0) {
				//성공 시 정보수정이 완료되었습니다! 출력 후 리스트 이동
				PrintWriter out = response.getWriter();
				out.write("<script>alert('수정이 완료되었습니다.');location.href='/member/list.do';</script>");
			}
			
		} catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request,response);
		}
	}
}
