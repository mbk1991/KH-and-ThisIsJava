package chap7.peopleexam;

public class Student extends People {
	private int studentNo;

	public Student() {
	}

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);   //이 예제에서 포인트는 부모 생성자에 접근하는 법.
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

}
