package chap11.clone;

public class Student {
	public String name;
	public String gender;
	public int grade;
	
	public int sno;
	
	public Student () {}
	public Student (int sno) {
		this.sno = sno;
	}
	public Student(String name, String gender, int grade) {
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}
	
	public Student getMember() {
		
		Student student = null;
		try {
			student = (Student)this.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return student;
		
	}
}
