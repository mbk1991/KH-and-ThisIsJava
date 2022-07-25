package com.kh.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Run {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;

		try {
			os = new FileOutputStream("TestFileControl.txt");
			byte[] data = "abcddsdasd;klfjsd;klfjs;daljkfsdfjsd;lkffg".getBytes();
			os.write(data);
			os.flush();

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

		try {
			is = new FileInputStream("TestFileControl.txt");
			int readByte;
			byte[] inputBytes = new byte[10];

			while(true) {
				readByte = is.read(inputBytes);
				if(readByte == -1) break;
				for (int i = 0; i < inputBytes.length; i++) {
					System.out.print((char) inputBytes[i]);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
