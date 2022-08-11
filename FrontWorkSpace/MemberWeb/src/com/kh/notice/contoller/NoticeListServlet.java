package com.kh.notice.contoller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.notice.model.vo.Notice;
import com.kh.notice.model.vo.PageData;
import com.kh.notice.service.NoticeService;

@WebServlet("/notice/list.do")
public class NoticeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NoticeService nService = new NoticeService();
	ArrayList<Notice> nList;
	Notice notice;
	PageData pagedata;
       
    public NoticeListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int currentPage = 1;
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		pagedata = nService.selectAllNotice(currentPage);
		nList = pagedata.getNoticeList();
		String pageNavi = pagedata.getPageNavi();
		
		if(!nList.isEmpty()) {
			request.setAttribute("nList",nList);
			request.setAttribute("pageNavi",pageNavi);
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeList.jsp").forward(request, response);;
		}else {
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeFailed.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
