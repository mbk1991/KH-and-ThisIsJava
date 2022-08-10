package com.kh.notice.contoller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.notice.model.vo.Notice;
import com.kh.notice.service.NoticeService;

@WebServlet("/notice/modify.do")
public class NoticeModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NoticeService nService = new NoticeService();

	public NoticeModifyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int noticeNo = Integer.parseInt(request.getParameter("noticeNo"));
		Notice notice = nService.selectOneByNo(noticeNo);
		if (notice != null) {
			request.setAttribute("notice", notice);
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeModify.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeFailed.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int noticeNo = Integer.parseInt(request.getParameter("noticeNo"));
		String contents = request.getParameter("contents");
		String subject = request.getParameter("subject");
		Notice notice = new Notice();
		notice.setNoticeNo(noticeNo);
		notice.setSubject(subject);
		notice.setContents(contents);
		int result = nService.updateNotice(notice);
		if(result < 0) {
			response.sendRedirect("/notice/detail.do");
		}else {
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeFailed.jsp").forward(request,response);
		}
	}
}
