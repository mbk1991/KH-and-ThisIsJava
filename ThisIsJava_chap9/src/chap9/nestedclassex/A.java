package chap9.nestedclassex;

public class A {
	A(){System.out.println("A ��ü�� ������");	}
	//�ν��Ͻ� ��� Ŭ����//
	class B{
		B(){System.out.println("B ��ü�� ������");}
		int field1;
		//static int filed2;  �׽�Ƽ��Ŭ������ ����ƽ �ʵ带 ������ �� ����.
		void method1() {}
//		static void method2() {}
	}
	
	//���� ��� Ŭ����//
	static class C{
		C(){System.out.println("C ��ü�� ������");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}  //static���Ŭ������ static �ʵ�� �޼ҵ� ���� ����.
		
	}
	
	
	
	void method() {
		//���� Ŭ����//
		class D{
			D(){System.out.println("D ��ü�� ������");}
			int field1;
//			static int field2;
			void method1() {}
//			static void method2() {}
			
		}
		D d= new D();
		d.field1 = 3;
		d.method1();
		
	}
}
