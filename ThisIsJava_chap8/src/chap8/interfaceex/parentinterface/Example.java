package chap8.interfaceex.parentinterface;

public class Example {
	public static void main(String[] args) {
		Implementation imp1 =new Implementation();
		
		InterfaceA ia = imp1;
		ia.methodA();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		InterfaceB ib = imp1;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
