package com.kh.fileclass;

import java.io.File;
import java.io.IOException;

public class Exam_File2 {
	public static void main(String[] args) {
		//파일 정보 알아오기
		File inFile = new File("inputStream.txt");
		File exam_File2 = new File("C:\\KHWorkSpace\\Day13_IOStream\\src\\com\\kh\\fileclass\\Exam_File2");
		
		File fileInfo = new File("");
		System.out.println("File()의 절대 경로:" + fileInfo.getAbsolutePath());
		
		
		try {
			inFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Exam_File2.java 의 절대 경로 :"+exam_File2.getAbsolutePath());
		
		System.out.println("파일명 : " + inFile.getName());
		System.out.println("파일용량 : " + inFile.length());
		System.out.println("상위폴더 : " + inFile.getParent());
		System.out.println("파일경로 : " + inFile.getPath());
		System.out.println("파일경로 : " + inFile.getAbsolutePath());
	}
}
