package member.model.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService mService = new MemberService();
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Member member = new Member(request.getParameter("id"), request.getParameter("pwd"));
		if(mService.memberCheck(member) == 1) {
			request.getSession().setAttribute("memberId", member.getMemberId());
			response.sendRedirect("view/worksuccess.jsp");
		}else if(mService.memberCheck(member) == 2) {
			request.getSession().setAttribute("memberId",member.getMemberId());
			request.getSession().setAttribute("adminCheck","Y");
			response.sendRedirect("view/worksuccess.jsp");
		}else {
			response.sendRedirect("view/membererror.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
