package kh.or.iei.student.controller;

import java.util.ArrayList;

import kh.or.iei.student.model.dao.StudentDAO;
import kh.or.iei.student.model.vo.Student;

public class StudentController {

	
	public StudentController() {}
	
	public ArrayList<Student> selectAllStudent() {
		StudentDAO sDao = new StudentDAO();
		ArrayList<Student> sList = sDao.showAll();
		return sList;
	}
	
	public Student selectByIdStudent(String id) {
		StudentDAO sDao = new StudentDAO();
		Student student = sDao.showById(id);
		return student;
	}
	
	public void selectByNameStudent() {}
	
	public void updateStudent() {}
	
	public void deleteStudent() {}
	
	public int registerStudent(Student student) {
		//저장을 ArrayList에 하지 않고 DAO에 해줌.
		//StudentDAO가 JDBC를 통해서 DB에 저장하도록 함.
		
		StudentDAO sDao = new StudentDAO();
		int result = sDao.insertStudent(student);  // 성공 여부에 따라서 숫자가 리턴, 성공1 실패0
		return result;
	}
	
	public void successMessage() {
		System.out.println("=====시스템 메시지=====");
		System.out.println("처리 성공");
	}
	
	public void failMessage() {
		System.out.println("=====시스템 메시지=====");
		System.out.println("처리 실패");
	}
}
