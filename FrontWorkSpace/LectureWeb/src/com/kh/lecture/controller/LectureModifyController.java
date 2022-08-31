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

@WebServlet("/lecture/modify.do")
public class LectureModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int lectureNo = Integer.parseInt(request.getParameter("lectureNo"));
		Lecture lecture = new LectureServiceImpl().printOneLecture(lectureNo);
		if (lecture != null) {
			request.setAttribute("lecture", lecture);
			request.getRequestDispatcher("/WEB-INF/views/lecture/modify.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Lecture lecture = new Lecture(Integer.parseInt(request.getParameter("lectureNo")),
				request.getParameter("lectureName"), request.getParameter("lectureInstructor"),
				request.getParameter("lectureIntroduce"));

		try {
			int result = new LectureServiceImpl().updateLecture(lecture);
			if (result > 0) {
				response.setCharacterEncoding("utf-8");
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.write("<script>alert('수정이 완료되었습니다.');location.href='/lecture/list.do';</script>");
				out.flush();
				out.close();
			}
		} catch (Exception e) {
			request.setAttribute("msg",e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request,response);
		}
	}
}
