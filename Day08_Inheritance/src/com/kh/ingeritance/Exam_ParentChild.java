package com.kh.ingeritance;

import java.util.Scanner;

import com.kh.exercise.Child;

public class Exam_ParentChild {
	public static void main(String[] args) {
		Child child =  new Child();
		Parent parent = new Child();
//		System.out.println(child.money);
		
		
		
		child.pizzaRecipe();
		child.printInfo();
		
		Parent p = new Child();
		Parent[] arrParant = new Parent[2];
		arrParant[0] = new Child();
		
		Object[] a = new Object[5];
		a[0] = new Parent();
		a[1] = new Child();
		a[2] = new Scanner(System.in);
		a[3] = new String();
		
		for(int i = 0 ; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
		
	}
}
