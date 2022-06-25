package chap7.promotion;

public class KumhoTire extends Tire {
	
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation,location);
	}
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		setAccumulatedRotation();
		if(getAccumulatedRotation() < getMaxRotation()) {
			System.out.println(getLocation() + "Kumho ¼ö¸í :" + (getMaxRotation()-getAccumulatedRotation() + "È¸"));
			return true;
		}else {
			System.out.println("*** " + getLocation() + " HankookTire ÆãÅ© ***");
			return false;
		}
	}

}
