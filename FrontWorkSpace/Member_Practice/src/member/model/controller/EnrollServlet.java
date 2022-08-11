package member.model.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;
@WebServlet("/enroll.do")
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService mService = new MemberService();
       
    public EnrollServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Member member = new Member();
		request.setCharacterEncoding("utf-8");
		member.setMemberId(request.getParameter("id"));
		member.setMemberPwd(request.getParameter("pwd"));
		member.setMemberName(request.getParameter("name"));
		member.setMemberPhone(request.getParameter("phone"));
		member.setMemberEmail(request.getParameter("email"));
	
		if(mService.memberInsert(member)>0) {
			response.sendRedirect("/view/worksuccess.jsp");
		}else {
			response.sendRedirect("/view/membererror.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
