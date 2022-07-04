package chap7.promotion;

public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		setAccumulatedRotation();
		if(getAccumulatedRotation() < getMaxRotation()) {
			System.out.println(getLocation() + "HankookTire ¼ö¸í : " + (getMaxRotation() - getAccumulatedRotation()) + "È¸");
			return true;
		}else {
			System.out.println("*** " + getLocation() + "KumhoTire ÆãÅ© ***");
			return false;
		}
		
	}
	
}
