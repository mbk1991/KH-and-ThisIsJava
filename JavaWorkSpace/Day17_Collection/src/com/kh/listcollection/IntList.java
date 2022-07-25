package com.kh.listcollection;

import java.util.ArrayList;
import java.util.List;

public class IntList {
	//ListÀÇ ±¸Çö
	
	private int[] nums;
	private int current;
	List<Integer> list = new ArrayList<Integer>();
	
	public IntList() {
		nums = new int[3];
		current = 0;
	}
	
	public void add(int input) {
		nums[current] = input;
		current++;
	}
	
	public int get(int index) {
		return nums[index];
	}
	
	public int size() {
		return current;
	}
	
	public void clear() {
		nums = new int[3];
		current = 0;
	}
}
