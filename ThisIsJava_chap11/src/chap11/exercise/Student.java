package chap11.exercise;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return this.studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (this.studentNum.equals(student.studentNum)) {
				return true;
			}
		}
		return false;
	}

}
