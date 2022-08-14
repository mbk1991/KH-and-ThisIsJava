package member.model.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Notice;
import member.model.vo.NoticePageData;

@WebServlet("/notice.do")
public class NoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService mService = new MemberService();
	NoticePageData npd;
       
    public NoticeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int currentPage = 1;
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
	
		npd = mService.noticeRead(currentPage);
		
		
		ArrayList<Notice>nList = npd.getnList();
		String currentPageStr = npd.getCurrentPage();
		
		System.out.println(currentPageStr);
		
		request.setAttribute("nList",nList);
		request.setAttribute("currentPageStr",currentPageStr);
		request.getRequestDispatcher("WEB-INF/view/notice.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
