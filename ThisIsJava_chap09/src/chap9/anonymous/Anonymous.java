package chap9.anonymous;

public class Anonymous {
	// �ʵ� �ʱⰪ���� �͸��ڽİ�ü �����Ͽ� ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};

	void method1() {
//		���� ���������� �͸� �ڽİ�ü �����Ͽ� ����
		Person localVar = new Person() {
			void work() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				work();
			}
		};
		
		//���� ���� ���
		localVar.wake();
		localVar.wake();
		
	}
	
	void method2(Person person) {
		person.wake();
	}
}
