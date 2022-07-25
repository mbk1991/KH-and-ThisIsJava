package comm.kh.abstractex;

public abstract class Car {
	private String carName;
	
	public abstract void move(int x);  //추상메소드
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}

}
