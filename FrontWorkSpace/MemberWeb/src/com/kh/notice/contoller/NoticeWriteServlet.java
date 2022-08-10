package com.kh.notice.contoller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.notice.model.vo.Notice;
import com.kh.notice.service.NoticeService;

@WebServlet("/notice/write.do")
public class NoticeWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NoticeService nService = new NoticeService();

	public NoticeWriteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet은 조회용
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/notice/noticeWrite.html");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doPost는 저장용
		request.setCharacterEncoding("utf-8");
		String subject = request.getParameter("subject");
		String contents = request.getParameter("contents");
		// 로그인한 사용자의 ID를 가져와서 저장 필요.
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("memberId");

		Notice notice = new Notice(subject, contents);
		notice.setMemberId(memberId);
		int result = nService.insertNotice(notice);
		if (result > 0) {
			//성공 시 noticeSuccess.jsp로 이동
			//리다이렉트는 URL접근과 마찬가지라서 불가하다.
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeSuccess.jsp").forward(request, response);
		} else {
			//실패 시 noticeFailed.jsp로 이동
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeFailed.jsp").forward(request, response);
		}
	}

}
