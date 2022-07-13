package chap16.streamexam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","�ſ��","���ڹ�","���ٽ�","�ں���");
		
		//����ó��
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample::print);  // ParallelExample�� print�޼ҵ带 �����Ѵ�.7
		//forEach������ ������ ��Ҹ� �ϳ��� ��� �ݺ��ؼ� ��������� �ǹ̶�� ����(�̰����ڹٴ� ��Ʃ���ΰ�)
		//�޼ҵ� ���� �� �� ������..
		System.out.println();
		
		//����ó��
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample::print);
		
		
	}


//���� �ݺ����� ����
//�����ڴ� ���ó�� �ڵ忡�� ����
//��Ƽ�ھ� cpu�� �ִ��� Ȱ���ϱ� ���� ��ҵ��� �й���� ����ó���۾��� �� �� �ִ�.
//����(parallel)ó�� �Ѱ��� �۾��� ���� �۾����� ������ ���� �۾����� �и��� �����忡�� ���������� 
//ó���� �� ���� �۾����� ������� ���� �����ϴ� ���
// 1���� 1000������ ���� ���� �� 1~500������ ��, 501~ 1000������ ���� ���ϴ� ������
//�����۾����� ������ ���������� ó����
//����ó���� �� �� �ִ� ��Ʈ�� ForkJoinPool ������Ǯ.
// stream �� �̱۽�����
// parallelStream�� ��Ƽ������ ����ó��
	
//14�� �޼ҵ� ����   ���ٽ��� �޼ҵ������� �����Ѵ�?
//���ٽĿ��� �Ű������� �ܼ��� ���޸� �ϴ� ��� -> �޼ҵ����� ::
	//���ٽĿ��� ��ü�� �ܼ��� ������ �ϴ� ��� -> �żҵ�����(������ ����) ::

public static void print(String str) {
	System.out.println(str + ":" + Thread.currentThread().getName());
}
}