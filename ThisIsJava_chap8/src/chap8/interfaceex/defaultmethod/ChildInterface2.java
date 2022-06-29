package chap8.interfaceex.defaultmethod;

public interface ChildInterface2 extends ParentInterface{
	
	@Override
	public default void method2() {
		System.out.println("ChildInterface2_디폴트메소드 재정의");
	}
	
	public void method3();

}
