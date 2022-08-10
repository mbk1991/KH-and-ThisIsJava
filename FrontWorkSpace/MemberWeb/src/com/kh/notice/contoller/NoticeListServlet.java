package com.kh.notice.contoller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.notice.model.vo.Notice;
import com.kh.notice.service.NoticeService;

@WebServlet("/NoticeListServlet")
public class NoticeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NoticeService nService = new NoticeService();
	ArrayList<Notice> nList;
	Notice notice;
       
    public NoticeListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		nList = nService.selectAllNotice();
		if(!nList.isEmpty()) {
			request.setAttribute("nList",nList);
			request.getRequestDispatcher("").forward(request, response);;
		}else {
			response.sendRedirect("/member/memberError.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
