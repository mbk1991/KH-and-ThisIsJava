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
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.��������(save)");
			System.out.println("4.�����ҷ�����(load)");
			System.out.println("0.����");
			System.out.println("�޴��� �����ϼ���.");
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

				System.out.println("����");
				break EXIT;
			default:
				System.out.println("�ٽ� �Է��ϼ���.");
				break ;

			}
		}

	}

	static void insert() {
		sc = new Scanner(System.in);

		System.out.print("�̸��Է�> ");
		name = sc.nextLine();

		System.out.print("�����Է�> ");
		age = sc.nextLine();

		System.out.print("�ּ��Է�> ");
		address = sc.nextLine();
	}

	static void print() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�ּ�: " + address);
		System.out.println();
	}

	static void save() {
		try {
			os = new FileOutputStream(name + ".txt");
			
			String temp = name +"/" + age + "/" + address;
			informations = new byte[temp.length()];
			informations = temp.getBytes();
			os.write(informations);
			System.out.println("���� ���� �Ϸ�");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void load() {
		sc = new Scanner(System.in);
		System.out.print("���ϸ�> ");
		String fileName = sc.nextLine();
		file = new File(fileName);
		if(!file.exists()) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
			System.out.print("���ϸ�> ");
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
			System.out.println("������ �о�Խ��ϴ�.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
