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
				break;
			case '6':
				break;
			default:
				System.out.println("잘못입력하였습니다.");
				break;
			}
		}
	}
}
