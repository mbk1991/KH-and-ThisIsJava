package chap8.interfaceex.defaultmethod;

public interface ParentInterface {
	public void method1();
	public default void method2() {
		System.out.println("����Ʈ �޼ҵ�");
	}
}
