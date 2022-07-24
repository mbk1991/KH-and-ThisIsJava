package sec11.stream_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {
	public static void main(String[] args) {
		//ArrayList의 요소를 그룹핑해서 수집(collect)하기
		
		List<Student> totalList = Arrays.asList(
			new Student("홍길동",10,Student.Sex.MALE,Student.City.Seoul),
			new Student("김수애",6,Student.Sex.FEMALE,Student.City.Pusan),
			new Student("신용권",10,Student.Sex.MALE,Student.City.Pusan),
			new Student("박수미",6,Student.Sex.FEMALE,Student.City.Seoul)
				);
		
		//Student타입 ArrayList totalList에서 성별을 key로 그룹핑하여 Map으로 변환한다.
		Map<Student.Sex, List<Student>> mapBySex =
				totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex));
		
		System.out.print("남학생 : ");
		mapBySex.get(Student.Sex.MALE)
		.stream().forEach(s->System.out.print(s.getName()+" "));
		
		System.out.print("\n여학생 : ");
		mapBySex.get(Student.Sex.FEMALE)
		.stream().forEach(s->System.out.print(s.getName()+" "));
		
		//학생의 거주도시를 key로하여 학생의 이름을 저장하는 맵 객체를 만들기
		Map<Student.City,List<String>> mapByCity = 
			totalList.stream()
			.collect(
					Collectors.groupingBy(
							Student::getCity,
							Collectors.mapping(Student::getName,Collectors.toList())));
		
		System.out.print("\n서울 거주 학생 : ");
		mapByCity.get(Student.City.Seoul)
		.stream().forEach(s->System.out.print(s +" "));
		
		System.out.print("\n부산 거주 학생 : ");
		mapByCity.get(Student.City.Pusan)
		.stream().forEach(s->System.out.print(s +" "));
		
				
	}
}
