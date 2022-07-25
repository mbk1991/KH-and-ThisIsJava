package com.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exem_WriterStr {
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("filewriter.txt");
			String data = "자바가 제일 쉬웠어요";
			writer.write(data);
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
