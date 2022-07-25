package com.kh.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.kh.domain.Student;

public class Run {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("02", "����");
		map.put("031", "��⵵");
		map.put("061","����");
		map.put("053", "�뱸");
	
		System.out.println("02�� ������ ������ ���ɴϴ�: " + map.get("02"));
		System.out.println("031�� ������ ��⵵�� ���ɴϴ�:" + map.get("031"));
		System.out.println("����� �������� �� : " + map.size());
		System.out.println();
		
		Map<String, Object> objMap = new HashMap<String,Object>();
		objMap.put("name","������");
		objMap.put("score",100);
		objMap.put("isReal",true);
		System.out.println(objMap.get("name") + "�� " + objMap.get("score") + "���Դϴ�. " + objMap.get("isReal"));
		
		System.out.println();
		
		Map<Integer,Student> stdMap = new HashMap<Integer,Student>();
		stdMap.put(1, new Student("�տ���", 100));
		stdMap.put(2, new Student("��ȿ��",99));
		stdMap.put(3, new Student("��ȿ��",98));
		stdMap.put(4, new Student("������", 97));
		
		System.out.println(stdMap.get(1));
		System.out.println(stdMap.get(2).toString());
		
		Map<String,Object> dataMap = new HashMap<String,Object>();
		dataMap.put("name","����");
		dataMap.put("wife", new Student("�տ���",100));
		
		selectList(dataMap);
		
		
		
	}
		
		static void selectList(Map<String,Object> obj) {
			System.out.println(obj.get("name").toString() + " , " + obj.get("wife").toString());
		}
	}
