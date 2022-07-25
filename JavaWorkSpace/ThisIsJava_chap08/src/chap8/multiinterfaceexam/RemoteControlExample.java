package chap8.multiinterfaceexam;

import chap8.interfaceex.Audio;
import chap8.interfaceex.RemoteControl;
import chap8.interfaceex.Television;

public class RemoteControlExample {
	public static void main(String [] args ) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		rc.setMute(false);
		
		
	}
}
