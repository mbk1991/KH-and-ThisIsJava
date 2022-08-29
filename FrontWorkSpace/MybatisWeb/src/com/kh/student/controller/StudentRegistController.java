package com.kh.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.student.model.service.StudentServiceImpl;
import com.kh.student.model.vo.Student;

@WebServlet("/student/regist.do")
public class StudentRegistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentRegistController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//마이바티스만 보기 위해서 화면단 없이 하드코딩으로 값을 입력함.
		Student student = new Student();
		student.setStudentName("일용자");
		student.setStudentTel("010-1111-1111");
		student.setStudentEmail("khuser01@iei.or.kr");
		student.setStudentAddr("서울시 중구");
		
		int result = new StudentServiceImpl().registerStudent(student);
		
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		if(result>0) {
			out.println("<script>alert('학생 등록 완료!')</script>");
		}else {
			out.println("<script>alert('학생 등록 실패!')</script>");
		}
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
