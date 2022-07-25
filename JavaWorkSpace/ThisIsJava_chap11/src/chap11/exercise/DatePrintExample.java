package chap11.exercise;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class DatePrintExample {
	public static void main(String[] args) {
//		Date now = new Date();
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
//		
//		String timeNow = sdf.format(now);
//		System.out.println(timeNow);
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(10);
		hashSet.add(8);
		hashSet.add(9);
		
		int[] arr = new int[hashSet.size()];
		int i = 0;
		Iterator<Integer> it = hashSet.iterator();
		while(it.hasNext()) {
			arr[i] = it.next();
			i++;
		}
		
//		for(int j = 0; j < arr.length; j ++) {
//			System.out.println(arr[j]);
//		}
		
		int[] arr2 = {6,5,1,234,4,3,2};
		Arrays.sort(arr2);
		for(int l = 0; l < arr2.length; l++) {
			System.out.print(arr2[l] + " ");
		}
		

		
//		Arrays.sort(arr);
//		
//		for(int num: arr) {
//			System.out.print(num);
//		}
		
		String strInt = "+123";
		int num = Integer.parseInt(strInt);
		System.out.println(num);
		
		
		
	}
}
