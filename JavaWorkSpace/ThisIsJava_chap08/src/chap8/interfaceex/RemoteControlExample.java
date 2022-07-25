package chap8.interfaceex;

public class RemoteControlExample {
	public static void main(String[] args) {
		
//		Television television = new Television();
//		run(television);
//		System.out.println();
//		Audio audio = new Audio();
//		run(audio);
		
		//�͸�����ü. ��ȸ�� ������ü�� Ŭ������ ����� ���� ��ȿ����. �ҽ������� ������ �ʰ� ������ü�� ����� ���. �͸�����ü�� �����ؼ� �������̽� ������ �����ϴ� �ڵ�.
		//UI���α׷����̳� �ӽ��۾� �����忡�� Ȱ���Ѵ�.
		RemoteControl rc = new RemoteControl() {
			int volume;
			@Override
			public void turnOn() {
				System.out.println("�͸�����ü�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("�͸�����ü�� ���ϴ�.");
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("�͸�����ü�� �Ҹ�����");
				this.volume = volume;
				System.out.println("�͸�����ü�� ���� : "+ this.volume);
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
