package com.kh.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Exam_WriteByteOff {
	public static void main(String[] args) {
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("txt로 저장할 제목"); // 안되네..
		String input = sc.next();
		System.out.print("txt의 내용");
		String input2 = sc.next();
		
		try {
			os = new FileOutputStream(""+input+".txt");
			byte[] data = input2.getBytes();
			os.write(data,1,3);
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
