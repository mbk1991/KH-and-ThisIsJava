package chap8.interfaceex.defaultmethod;

public interface ChildInterface3 extends ParentInterface{
	
	@Override
	public void method2(); //추상메소드로 재선언
	public void method3();
}
