package com.kh.fileclass;

import java.io.File;
import java.io.IOException;

public class Exam_File2 {
	public static void main(String[] args) {
		//���� ���� �˾ƿ���
		File inFile = new File("inputStream.txt");
		File exam_File2 = new File("C:\\KHWorkSpace\\Day13_IOStream\\src\\com\\kh\\fileclass\\Exam_File2");
		
		File fileInfo = new File("");
		System.out.println("File()�� ���� ���:" + fileInfo.getAbsolutePath());
		
		
		try {
			inFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Exam_File2.java �� ���� ��� :"+exam_File2.getAbsolutePath());
		
		System.out.println("���ϸ� : " + inFile.getName());
		System.out.println("���Ͽ뷮 : " + inFile.length());
		System.out.println("�������� : " + inFile.getParent());
		System.out.println("���ϰ�� : " + inFile.getPath());
		System.out.println("���ϰ�� : " + inFile.getAbsolutePath());
	}
}
