package kh.or.iei.student.run;

import java.util.ArrayList;

import kh.or.iei.student.controller.StudentController;
import kh.or.iei.student.model.vo.Student;
import kh.or.iei.student.view.StudentView;

public class Run {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentController sCtrl = new StudentController();
		Student student = null;
		ArrayList<Student> sList = null;
		int result = 0;
		String studentName = null;
		String studentId = null;
		EXIT: while (true) {
			char choice = view.mainMenu();
			switch (choice) {
			case '0':
				System.out.println("프로그램을 종료합니다.");
				break EXIT;
			case '1':
				sList = sCtrl.selectAllStudent();
				
				System.out.println("메인메뉴1번: " + sList);
				
				if(!sList.isEmpty()) {
					//데이터 출력
					view.viewShowAll(sList);
				}else {
					sCtrl.failMessage();
				}
				break;
			case '2':
				String inputId = view.inputId();
				student = sCtrl.selectByIdStudent(inputId);
				view.viewShowById(student);
				
				break;
			case '3':
				studentName = view.inputName();
				sList = sCtrl.printStudentByName(studentName);
				if(!sList.isEmpty()) {
					//데이터출력
					view.viewShowAll(sList);
				}else {
					sCtrl.failMessage();
				}
				break;
			case '4':
				// 등록
				student = view.inputStudent();
				result = sCtrl.registerStudent(student);
				if (result > 0) {
					sCtrl.successMessage();
				} else {
					sCtrl.failMessage();
				}

				break;
			case '5':
				//1. 회원아이디 존재확인
				//2. 있다면 정보를 수정
				//없으면 정보 조회 실패 메시지 출력
				inputId = view.inputId();
				result = sCtrl.checkStudentId(inputId);
				if(result != 0) {
					//학생정보 수정
					student = view.modifyStudent();
					student.setStudentId(inputId);
					result = sCtrl.modifyStudent(student);
					System.out.println("수정 후 result :" +result);
					if(result > 0) {
						sCtrl.successMessage();
					}else {
						sCtrl.failMessage();
					}
					
				}else {
					sCtrl.failMessage();
				}
				
				break;
			case '6':
				studentId = view.inputId();
				result = sCtrl.removeStudent(studentId);
				if(result == 1) {
					sCtrl.successMessage();
				}else {
					sCtrl.failMessage();
				}
				
				break;
			default:
				System.out.println("잘못입력하였습니다.");
				break;
			}
		}
	}
}
