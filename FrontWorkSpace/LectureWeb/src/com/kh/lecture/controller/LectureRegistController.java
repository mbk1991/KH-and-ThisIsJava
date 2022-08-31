package com.kh.lecture.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.lecture.model.domain.Lecture;
import com.kh.lecture.model.service.LectureServiceImpl;

@WebServlet("/lecture/regist.do")
public class LectureRegistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.sendRedirect("/WEB-INF/views/lecture/registForm.jsp");
		request.getRequestDispatcher("/WEB-INF/views/lecture/registForm.jsp").forward(request,response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	
		Lecture lecture = new Lecture(request.getParameter("lectureName"),
									   request.getParameter("instructorName"),
									   request.getParameter("lectureIntroduce"));
		
		int result = new LectureServiceImpl().registLecture(lecture);
		
		try {
			if(result>0) {
				response.setContentType("text/html");
				response.setCharacterEncoding("utf-8");
				PrintWriter out = response.getWriter();
				out.write("<script>alert('강좌가 등록되었습니다.');location.href='/lecture/list.do';</script>");
			}else {
				System.out.println("등록 실패");
			}
			
		} catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request,response);
			
		}
	}
}
