package chap8.interfaceex.driverexam;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		bus.run();
		
		Vehicle vehicle = new Bus();
		vehicle.run();
		((Bus)vehicle).checkFare();
		
		Bus bus2 = (Bus) vehicle;
		bus2.checkFare();
	
		
	}
}
