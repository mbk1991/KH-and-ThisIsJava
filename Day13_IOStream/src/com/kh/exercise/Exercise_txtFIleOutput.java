package com.kh.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_txtFIleOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		OutputStream os = null;
		Writer writer = null;
		System.out.print("제목입력 : ");
		String fileName = sc.next();
		sc.nextLine();
		try {
			writer = new FileWriter(fileName + ".txt");
			while (true) {
				System.out.println("내용입력 : ");
				String content = sc.nextLine();
				if (content.equals("exit"))
					break;
				writer.write(content);
				writer.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
