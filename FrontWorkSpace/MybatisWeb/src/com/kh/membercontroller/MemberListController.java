package com.kh.membercontroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.model.service.MemberServiceImpl;
import com.kh.member.model.vo.Member;

@WebServlet("/member/list.do")
public class MemberListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	MemberServiceImpl mService = new MemberServiceImpl();
	ArrayList<Member> mList = mService.printMemberList();
	if(!mList.isEmpty()) {
		//성공하면 list.jsp
		request.setAttribute("mList", mList);
		request.getRequestDispatcher("/WEB-INF/views/member/list.jsp").forward(request,response);
	}else {
		//실패하면 errorPage.jsp
		request.setAttribute("msg","Fail");
		request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request,response);
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
