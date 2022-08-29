package com.kh.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.student.model.service.StudentServiceImpl;
import com.kh.student.model.vo.Student;

@WebServlet("/student/detail.do")
public class StudentDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentDetailController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studentNo = 5;
		StudentServiceImpl stdService = new StudentServiceImpl();
		Student student = stdService.printStudentByNo(studentNo);
		System.out.println(student.toString());
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
