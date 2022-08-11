package com.kh.notice.contoller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.notice.model.vo.Notice;
import com.kh.notice.service.NoticeService;

@WebServlet("/notice/detail.do")
public class NoticeDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NoticeService nService = new NoticeService();
	Notice notice;

	public NoticeDetailServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int noticeNo = Integer.parseInt(request.getParameter("noticeNo"));
		notice = nService.selectOneByNo(noticeNo);
		if (notice != null) {
			request.setAttribute("notice",notice);
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeDetail.jsp").forward(request,response);
		} else {
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeFailed.html").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
	}
}
