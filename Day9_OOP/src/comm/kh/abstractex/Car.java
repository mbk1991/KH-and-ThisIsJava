package comm.kh.abstractex;

public abstract class Car {
	private String carName;
	
	public abstract void move(int x);  //�߻�޼ҵ�
	
	public void stop() {
		System.out.println("���� ����ϴ�.");
	}

}
