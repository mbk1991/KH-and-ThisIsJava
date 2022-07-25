package com.kh.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.kh.domain.Student;

public class Run {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("02", "서울");
		map.put("031", "경기도");
		map.put("061","전라도");
		map.put("053", "대구");
	
		System.out.println("02를 누르면 서울이 나옵니다: " + map.get("02"));
		System.out.println("031을 누르면 경기도가 나옵니다:" + map.get("031"));
		System.out.println("저장된 데이터의 수 : " + map.size());
		System.out.println();
		
		Map<String, Object> objMap = new HashMap<String,Object>();
		objMap.put("name","소지섭");
		objMap.put("score",100);
		objMap.put("isReal",true);
		System.out.println(objMap.get("name") + "은 " + objMap.get("score") + "점입니다. " + objMap.get("isReal"));
		
		System.out.println();
		
		Map<Integer,Student> stdMap = new HashMap<Integer,Student>();
		stdMap.put(1, new Student("손예진", 100));
		stdMap.put(2, new Student("공효진",99));
		stdMap.put(3, new Student("김효진",98));
		stdMap.put(4, new Student("서현진", 97));
		
		System.out.println(stdMap.get(1));
		System.out.println(stdMap.get(2).toString());
		
		Map<String,Object> dataMap = new HashMap<String,Object>();
		dataMap.put("name","현빈");
		dataMap.put("wife", new Student("손예진",100));
		
		selectList(dataMap);
		
		
		
	}
		
		static void selectList(Map<String,Object> obj) {
			System.out.println(obj.get("name").toString() + " , " + obj.get("wife").toString());
		}
	}
