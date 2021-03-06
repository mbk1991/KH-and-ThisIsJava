package chap11.objects.compare;

import java.util.Comparator;

import chap11.clone.Student;

public class StudentComparator implements Comparator<Student>{
	//학생 번호 비교자
	@Override
	public int compare(Student a, Student b) {
		if(a.sno < b.sno) return -1;
		else if (a.sno == b.sno) return 0;
		else return 1;
	}
	
}
