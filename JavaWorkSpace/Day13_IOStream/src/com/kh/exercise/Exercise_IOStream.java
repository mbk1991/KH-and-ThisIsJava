package com.kh.exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Exercise_IOStream {
	public static void main(String[] args) {
//		저장할 파일명 입력 : khtext.txt
//		khtext.txt 파일에 저장될 내용입력
//		종료는 exit
//		1:1111
//		2:tdsaf
//		3:good
//		4:gogoogo
//		5:exit 입력 시 (exit는 제외하고 파일 저장됨)

		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		System.out.print("txt파일의 이름을 입력하세요");
		String fileName = sc.next();
		sc.nextLine();
		try {
			os = new FileOutputStream("c:\\temp3\\" + fileName + ".txt");
			System.out.println(fileName + "에 저장될 내용을 입력 >");
			System.out.println("(exit 입력 시 종료");
			int lineNumber = 1;
			while (true) {
				System.out.print(lineNumber++ + " : ");
				// lineNumber++;
				String content = sc.nextLine(); // String문자열을 입력받아줌
				if (content.equals("exit")) { // 입력받은 값이 exit와 같다면 종료
					System.out.println("종료!");
					break;
				}
				byte[] byteBuffer = content.getBytes(); // String을 byte배열로 만듦
				os.write(byteBuffer); // write()메소드로 파일에 쓰기
				os.write(13); // 엔터의 아스키코드로 띄어쓰기 작성

			}
			os.flush(); // 스트림을 비워냄
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
