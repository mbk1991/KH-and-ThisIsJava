package com.kh.music.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class MusicFile {
	Writer writer = null;
	Reader reader = null;

	public void saveFile(String str) {
		try {
			writer = new FileWriter("music.txt");
			writer.write(str);
			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String readFile() {
		try {
			reader = new FileReader("music.txt");
			char[] cbuf = new char[100];
			StringBuilder sb = new StringBuilder();
			while((reader.read(cbuf)) != -1) {
				sb.append(cbuf);
			}
			String loadStr = sb.toString();
			return loadStr;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
