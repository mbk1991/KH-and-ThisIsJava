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
			System.out.println(getLocation() + "Kumho ���� :" + (getMaxRotation()-getAccumulatedRotation() + "ȸ"));
			return true;
		}else {
			System.out.println("*** " + getLocation() + " HankookTire ��ũ ***");
			return false;
		}
	}

}
