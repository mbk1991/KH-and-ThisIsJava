package com.kh.notice.contoller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.notice.service.NoticeService;

@WebServlet("/notice/delete.do")
public class NoticeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NoticeService nService = new NoticeService();
       
    public NoticeDeleteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int noticeNo = Integer.parseInt(request.getParameter("noticeNo"));
		int result = nService.deleteNotice(noticeNo);
		if(result > 0) {
			//성공 시 공지사항 목록 페이지로 이동
			response.sendRedirect("/notice/list.do");
		}else {
			//실패 시 실패페이지 이동
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeFailed.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
