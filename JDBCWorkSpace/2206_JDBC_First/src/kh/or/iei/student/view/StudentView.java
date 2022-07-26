package kh.or.iei.student.view;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import kh.or.iei.student.model.vo.Student;

public class StudentView {

	public String inputId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 ID 입력 >>");
		String inputId = sc.next();
		return inputId;
	}

	public char mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======학생 관리 프로그램=======");
		System.out.println("1. 학생 정보 전체조회");
		System.out.println("2. 학생 아이디로 조회");
		System.out.println("3. 학생 이름으로 조회");
		System.out.println("4. 학생 정보 등록");
		System.out.println("5. 학생 정보 변경");
		System.out.println("6. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("번호 선택 >>");
		char input = sc.next().charAt(0);
		return input;
	}

	public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		// 아이디,비밀번호,이름,성별,나이,이메일,전화번호,주소,취미
		// 방법1.기본생성자 사용하여 객체만든 후 저장해서 리턴
		// 방법2. 매개 변수 생성자 사용해서 객체 만든 후 저장해서 리턴

		System.out.println("아이디: ");
		String studentId = sc.next();
		System.out.println("비밀번호: ");
		String studentPwd = sc.next();
		System.out.println("이름: ");
		String studentName = sc.next();
		System.out.println("나이: ");
		int age = sc.nextInt();
		System.out.println("성별: ");
		char gender = sc.next().charAt(0);
		while (!(gender == 'M' || gender == 'F')) {
			System.out.println("M또는 F로 입력하세요.");
			gender = sc.next().charAt(0);
		}
		System.out.println("이메일: ");
		String email = sc.next();
		System.out.println("전화번호: ");
		String phone = sc.next();
		sc.nextLine();
		System.out.println("주소: ");
		String address = sc.nextLine();
		sc.nextLine();
		System.out.println("취미: ");
		String hobby = sc.nextLine();

		Student student = new Student(studentId, studentPwd, studentName, age, gender, email, phone, address, hobby);
		return student;
	}

	public void viewShowAll(ArrayList<Student> sList) {
		// 전체 학생정보 조회 결과 출력
		System.out.println("=====전체 학생 정보 조회 결과=====");
		sList.stream()
				.forEach(s -> System.out.println("==========" + "\n학생 아이디 : " + s.getStudentId() + "\n학생 비밀번호 : "
						+ s.getStudentPwd() + "\n학생 이름 : " + s.getStudentName() + "\n학생 나이 : " + s.getAge()
						+ "\n학생 성별 : " + s.getGender() + "\n학생 이메일 : " + s.getEmail() + "\n학생 전화번호 : " + s.getPhone()
						+ "\n학생 주소 : " + s.getAddress() + "\n학생 취미 : " + s.getHobby() + "\n=========="));
	}

	public void viewShowById(Student s) {
		System.out.println("=====ID로 학생 정보 조회 결과=====");

		System.out.println("==========" + "\n학생 아이디 : " + s.getStudentId() + "\n학생 비밀번호 : " + s.getStudentPwd()
				+ "\n학생 이름 : " + s.getStudentName() + "\n학생 나이 : " + s.getAge() + "\n학생 성별 : " + s.getGender()
				+ "\n학생 이메일 : " + s.getEmail() + "\n학생 전화번호 : " + s.getPhone() + "\n학생 주소 : " + s.getAddress()
				+ "\n학생 취미 : " + s.getHobby() + "\n==========");
	}

	public String inputName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 이름 입력 : ");
		return sc.next();
	}

	public Student modifyStudent() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("=====수정할 정보 입력=====");
		System.out.println("비밀번호 : ");
		student.setStudentPwd(sc.next());
		System.out.println("이메일 : ");
		student.setEmail(sc.next());
		System.out.println("전화번호 : ");
		student.setPhone(sc.next());
		System.out.println("주소 : ");
		sc.nextLine();
		student.setAddress(sc.nextLine());
		System.out.println("취미 : ");
		student.setHobby(sc.next());
		
		return student;
	}
}
