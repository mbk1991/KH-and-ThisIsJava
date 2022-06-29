package com.kh.fileclass;

import java.io.File;
import java.io.IOException;

public class Exam_File1 {
	public static void main(String[] args) {
		/*
		 * 1. 파일 생성 2. 폴더 생성 3. 파일 존재 여부 확인 4. 파일 여부 확인 등...
		 */
//		makeFile();
		makeDirectory();
		makeFileDirectory();
		
		

	}

	
	static void makeFileDirectory() {
		File file = new File("c:\\khFile\\khtext.txt");
		try {
			file.createNewFile();
			System.out.println("파일이 존재하는가 : " + file.exists());
			System.out.println("khtext.txt가 파일이 맞는가 : " + file.isFile());
			//파일 삭제
			if(file.delete()) System.out.println("파일이 삭제되었습니다.");
			System.out.println("파일이 존재하는가 : " + file.exists());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void makeDirectory() {
		File file = new File("c:\\khFile");
		System.out.println("khfile이 폴더가 맞는가 :" + file.isDirectory());
		file.mkdir();
	}

	static void makeFile() {
		File file = new File("khfile.txt");
		// FileOutputStream의 write()메소드로 파일에 내용 쓰기
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
