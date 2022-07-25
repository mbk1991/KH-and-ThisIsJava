package chap10.exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		
		changeDog(dog);
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
//		if (animal instanceof Dog) {
		
			Dog dog = (Dog) animal;
			System.out.println("Dog��ü�� ��ȯ�մϴ�.");
//			
//		}else {
//			System.out.println("��ȯ���� �ʽ��ϴ�.");
//		}
	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}