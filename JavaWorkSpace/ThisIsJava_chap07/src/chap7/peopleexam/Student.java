package chap7.peopleexam;

public class Student extends People {
	private int studentNo;

	public Student() {
	}

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);   //�� �������� ����Ʈ�� �θ� �����ڿ� �����ϴ� ��.
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

}
