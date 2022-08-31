package com.kh.lecture.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.lecture.model.domain.Lecture;
import com.kh.lecture.model.service.LectureServiceImpl;

@WebServlet("/lecture/list.do")
public class LectureListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Lecture> lecList = (ArrayList<Lecture>)new LectureServiceImpl().printAllLecture();
		try {
			if(!lecList.isEmpty()) {
				request.setAttribute("lecList",lecList);
				request.getRequestDispatcher("/WEB-INF/views/lecture/list.jsp").forward(request,response);
			}else {
				
			}
			
		} catch (Exception e) {
			request.setAttribute("msg",e.getMessage());
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
