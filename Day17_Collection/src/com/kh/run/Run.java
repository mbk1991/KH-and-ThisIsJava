package com.kh.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.controller.ListController;

public class Run {
	public static void main(String[] args) {

//		ListController listCon = new ListController();
//		listCon.listExercise1();
//		listCon.listExercise2();
//		listCon.listExercise3();
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(6);
		list.add(13); // add()�޼ҵ�, ����Ʈ�� �� �߰�
	
		int size = list.size(); // size() �޼ҵ�, ����Ʈ ũ��
		System.out.println("size: " + size);
		
		list.clear();  // clear() �޼ҵ�, ����Ʈ ��� �� ����
		size = list.size();
		System.out.println("size: " + size);
		
		list.add(11);
		list.add(18);
		System.out.println("1��° : " +list.get(0));
		//get() �޼ҵ�, index�� �ش��ϴ� �� ����
		System.out.println("2��° : "+list.get(1));
		System.out.println("for������ ���");
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "��° : " + list.get(i));
		}
		
		System.out.println("list�� �����Ͱ� �ִ��� (Null Check)?"
				+ !list.isEmpty());
		
		
		
	}
}
