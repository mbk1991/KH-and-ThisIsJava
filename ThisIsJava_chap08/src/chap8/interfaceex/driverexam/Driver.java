package chap8.interfaceex.driverexam;

public class Driver {
	public void drive(Vehicle vehicle) {
		// ��ü Ÿ��Ȯ��
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
