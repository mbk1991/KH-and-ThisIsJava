package chap7.promotion;

public class Tire {
//필드
	private int maxRotation;
	private int accumulatedRotation;
	private String location;
	
//생성자

	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
//메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRotation)+ "회");
			return true;
		}else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
		
	}
	
	
	
//getter setter
	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}
	public int getMaxRotation() {
		return maxRotation;
	}
	public void setAccumulatedRotation() {
		++this.accumulatedRotation;
	}
	
	public int getAccumulatedRotation() {
		return accumulatedRotation;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	
}
