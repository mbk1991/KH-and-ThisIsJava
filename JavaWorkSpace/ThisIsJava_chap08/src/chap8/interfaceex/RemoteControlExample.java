package chap8.interfaceex;

public class RemoteControlExample {
	public static void main(String[] args) {
		
//		Television television = new Television();
//		run(television);
//		System.out.println();
//		Audio audio = new Audio();
//		run(audio);
		
		//익명구현객체. 일회성 구현객체를 클래스로 만드는 것은 비효율적. 소스파일을 만들지 않고 구현객체를 만드는 방법. 익명구현객체를 생성해서 인터페이스 변수에 대입하는 코드.
		//UI프로그래밍이나 임시작업 스레드에서 활용한다.
		RemoteControl rc = new RemoteControl() {
			int volume;
			@Override
			public void turnOn() {
				System.out.println("익명구현객체를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("익명구현객체를 끕니다.");
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("익명구현객체의 소리조절");
				this.volume = volume;
				System.out.println("익명구현객체의 볼륨 : "+ this.volume);
			}
			
		};
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		rc.setMute(true);
		RemoteControl.changeBattery();
		
		
	}
	
	public static void run(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(true);
		RemoteControl.changeBattery();
	}
	
}
