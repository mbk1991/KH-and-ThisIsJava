package com.kh.notice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.notice.model.service.NoticeService;
import com.kh.notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeModifyServlet
 */
@WebServlet("/notice/modify.do")
public class NoticeModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeService nService = new NoticeService();
		int noticeNo = Integer.parseInt(request.getParameter("noticeNo"));
		Notice notice = nService.selectOneByNo(noticeNo);
		if(notice != null) {
			request.setAttribute("notice", notice);
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeModify.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeFailed.html").forward(request, response);
		}
	}
	/*
	 * 1. RequestDispatcher
	 * - 디비에서 가져온 값을 jsp에서 출력하게 하고 싶을 때
	 * - WEB-INF 안에 있는 Web Files을 접근할 때
	 * 2. sendRedirect
	 * - 크롬 주소창에 url 입력을 함.
	 * 
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int noticeNo = Integer.parseInt(request.getParameter("noticeNo")); 	// NumberFormatException(Name값 불일치)
		String subject = request.getParameter("subject");
		String contents = request.getParameter("contents"); // cannot update ~~ to NULL(입력X, Name값 불일치)
		Notice notice = new Notice();
		NoticeService nService = new NoticeService();
		notice.setSubject(subject);
		notice.setContents(contents);
		notice.setNoticeNo(noticeNo);
		int result = nService.updateNotice(notice);
		if(result > 0) {
			// 수정하고 성공하면 보통 어떤 페이지(화면)이 보이나요?
			// 리스트? 상세페이지?
			response.sendRedirect("/notice/list.do");
		}else {
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeFailed.html").forward(request, response);
		}
	}

}
