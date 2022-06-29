package com.kh.fileclass;

import java.io.File;
import java.io.IOException;

public class Exam_File1 {
	public static void main(String[] args) {
		/*
		 * 1. ���� ���� 2. ���� ���� 3. ���� ���� ���� Ȯ�� 4. ���� ���� Ȯ�� ��...
		 */
//		makeFile();
		makeDirectory();
		makeFileDirectory();
		
		

	}

	
	static void makeFileDirectory() {
		File file = new File("c:\\khFile\\khtext.txt");
		try {
			file.createNewFile();
			System.out.println("������ �����ϴ°� : " + file.exists());
			System.out.println("khtext.txt�� ������ �´°� : " + file.isFile());
			//���� ����
			if(file.delete()) System.out.println("������ �����Ǿ����ϴ�.");
			System.out.println("������ �����ϴ°� : " + file.exists());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void makeDirectory() {
		File file = new File("c:\\khFile");
		System.out.println("khfile�� ������ �´°� :" + file.isDirectory());
		file.mkdir();
	}

	static void makeFile() {
		File file = new File("khfile.txt");
		// FileOutputStream�� write()�޼ҵ�� ���Ͽ� ���� ����
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
