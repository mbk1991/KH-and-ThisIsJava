package chap5;

public class EnumMethodExample {
	//열거 객체의 메소드
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);  //SUNDAY 출력
		
		int ordinal = today.ordinal();  // 전체 열거객체 중 몇번째 객체인지 출력하는 메소드
		System.out.println(ordinal);  //1 출력
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); //
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		if(args.length ==1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요.");
			}else {
				System.out.println("평일이군요.");
			}
		}
		Week[] days = Week.values();
		for(Week day:days) {
			System.out.println(day);
		}
	}
}



