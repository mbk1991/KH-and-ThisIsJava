package com.kh.lecture.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.lecture.model.domain.Lecture;
import com.kh.lecture.model.service.LectureServiceImpl;

@WebServlet("/lecture/lectureDetail.do")
public class LectureDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int lectureNo = Integer.parseInt(request.getParameter("lectureNo"));
		try {
			Lecture lecture = new LectureServiceImpl().printOneLecture(lectureNo);
			if(lecture != null) {
				request.setAttribute("lecture", lecture);
				request.getRequestDispatcher("/WEB-INF/views/lecture/detail.jsp").forward(request,response);
			}
		} catch (Exception e) {
			request.setAttribute("msg",e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request,response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
