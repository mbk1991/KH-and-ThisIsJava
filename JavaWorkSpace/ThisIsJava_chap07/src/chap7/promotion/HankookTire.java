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
			System.out.println(getLocation() + "HankookTire ���� : " + (getMaxRotation() - getAccumulatedRotation()) + "ȸ");
			return true;
		}else {
			System.out.println("*** " + getLocation() + "KumhoTire ��ũ ***");
			return false;
		}
		
	}
	
}
