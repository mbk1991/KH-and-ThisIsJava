package chap8.interfaceex.driverexam;

public class Driver {
	public void drive(Vehicle vehicle) {
		// 객체 타입확인
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
