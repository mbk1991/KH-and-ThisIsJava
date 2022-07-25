package chap16.streamexam;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","�ſ��","���ڹ�");
		
		//Iterator �̿�
		Iterator<String> iterator = list.iterator();  // List�� Iterator�� �ڽ��������̽�. Iterator��ü�� �����ϴ� �޼ҵ�.
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println("=====");
		
		Stream<String> stream = list.stream();  //Collections�������̽��� stream�޼ҵ�� Stream��ü�� �����Ѵ�.
		stream.forEach(name ->System.out.println(name));  //forEach�� Stream�� ������ �޼ҵ��̴�!. �����Ӵ� ���ϰ��� ���� �Լ��� �������̽�
							     //forEach�� �Ű������� �Լ����������̽� Consumer�� �� �� �ִ� �ڸ��̹Ƿ� ���ٽ��� �����ϴ�.
								//forEach�� �پ��ϰ� �������̵� �Ǿ��ִ�.
								 //Consumer���� accept�߻�޼ҵ尡 �ִ�. ���ٽ��� accept�߻�޼ҵ带 �����Ͽ� ���°�. �Ķ���ʹ�  TŸ�� 1��.
	
		//�Լ��� �������̽��� �Ű������� ���� �޼ҵ带 �̿��Ͽ� ���ٽ��� �̿��Ѵ�.
		// �Լ����������̽� Consumer�� �Ű������� ���� forEach�޼ҵ忡 ���ٽ����� accept�� �������Ͽ� �Լ��� �����.
	}					
}
