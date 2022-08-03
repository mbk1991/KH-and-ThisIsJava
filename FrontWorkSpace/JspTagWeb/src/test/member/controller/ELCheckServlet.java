package test.member.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.member.Member;

@WebServlet("/el/check.do")
public class ELCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ELCheckServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Member member = new Member("khuser02","pass02","이용자");
		ArrayList<Member>mList
		=new ArrayList<Member>();
		mList.add(new Member("khuser03","pass03","삼용자"));
		mList.add(new Member("khuser04","pass04","사용자"));
		mList.add(new Member("khuser05","pass05","오용자"));
			
		request.setAttribute("mList",mList);
		request.setAttribute("member",member);
		RequestDispatcher view
						=request.getRequestDispatcher("/EL/jsp_ELTest1.jsp");
		view.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
