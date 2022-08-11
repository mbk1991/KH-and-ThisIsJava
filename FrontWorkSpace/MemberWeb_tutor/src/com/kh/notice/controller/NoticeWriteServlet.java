package com.kh.notice.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.notice.model.service.NoticeService;
import com.kh.notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeWriteServlet
 */
@WebServlet("/notice/write.do")
public class NoticeWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 화면 조회용
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/notice/noticeWrite.html");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 데이터 저장용
		request.setCharacterEncoding("utf-8"); 	// 한글깨짐 방지
		String subject = request.getParameter("subject");
		String contents = request.getParameter("contents");
		// 로그인한 사용자의 ID를 가져와서 저장 필요
		HttpSession session = request.getSession();
		String memberId = (String)session.getAttribute("memberId");
		NoticeService nService = new NoticeService();
		Notice notice = new Notice();
		notice.setSubject(subject);
		notice.setContents(contents);
		notice.setMemberId(memberId);
		int result = nService.insertNotice(notice);
//		ArrayList<Notice> nList = nService.selectAllList();
		if(result > 0) {
			// 성공시 noticeSuccess.jsp로 이동
			//response.sendRedirect("/WEB-INF/views/notice/noticeSuccess.jsp");
//			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/notice/noticeSuccess.jsp");
//			view.forward(request, response);
			// 공지사항 작성 성공시 공지사항 목록으로 이동
//			request.setAttribute("nList", nList);
//			request.getRequestDispatcher("/WEB-INF/views/notice/noticeList.jsp").forward(request, response);
			response.sendRedirect("/notice/list.do");
		}else {
			// 실패시 noticeFailed.html로 이동
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/notice/noticeFailed.html");
			view.forward(request, response);
		}
	}

}






