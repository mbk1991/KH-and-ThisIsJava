package chap8.interfaceex.defaultmethod;

public interface ChildInterface2 extends ParentInterface{
	
	@Override
	public default void method2() {
		System.out.println("ChildInterface2_����Ʈ�޼ҵ� ������");
	}
	
	public void method3();

}
