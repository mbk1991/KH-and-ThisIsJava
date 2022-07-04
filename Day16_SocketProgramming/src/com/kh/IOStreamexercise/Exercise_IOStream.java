package com.kh.IOStreamexercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Exercise_IOStream {

	static Scanner sc = null;
	static InputStream is = null;
	static OutputStream os = null;
	static File file = null;
	
	static FileInputStream fis = null;
	static FileOutputStream fos = null;
	private static String name;
	private static String age;
	private static String address;
	private static byte[] informations = null;

	public static void main(String[] args) {

		menu();

	}

	static void menu() {
		sc = new Scanner(System.in);

		EXIT: while (true) {
			System.out.println("1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.정보저장(save)");
			System.out.println("4.정보불러오기(load)");
			System.out.println("0.종료");
			System.out.println("메뉴를 선택하세요.");
			char choice = sc.nextLine().charAt(0);
			switch (choice) {
			case '1':
				insert();
				break;
			case '2':
				print();
				break;
			case '3':
				save();
				break;
			case '4':
				load();
				break;
			case '0':

				System.out.println("종료");
				break EXIT;
			default:
				System.out.println("다시 입력하세요.");
				break ;

			}
		}

	}

	static void insert() {
		sc = new Scanner(System.in);

		System.out.print("이름입력> ");
		name = sc.nextLine();

		System.out.print("나이입력> ");
		age = sc.nextLine();

		System.out.print("주소입력> ");
		address = sc.nextLine();
	}

	static void print() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		System.out.println();
	}

	static void save() {
		try {
			os = new FileOutputStream(name + ".txt");
			
			String temp = name +"/" + age + "/" + address;
			informations = new byte[temp.length()];
			informations = temp.getBytes();
			os.write(informations);
			System.out.println("파일 저장 완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void load() {
		sc = new Scanner(System.in);
		System.out.print("파일명> ");
		String fileName = sc.nextLine();
		file = new File(fileName);
		if(!file.exists()) {
			System.out.println("존재하지 않는 파일입니다.");
			System.out.print("파일명> ");
			fileName = sc.nextLine();
		}
	
		
		try {
			is = new FileInputStream(fileName);
			byte[] bufferBytes = new byte[100];
			int readByteNum;
			String temp = "";
			String[] strArray = null;
			while((readByteNum = is.read(bufferBytes)) != -1) {
				temp += new String(bufferBytes);
			}
//			System.out.println(temp);
			strArray = temp.split("/");
			name = strArray[0];
			age = strArray[1];
			address = strArray[2];
			System.out.println("파일을 읽어왔습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
