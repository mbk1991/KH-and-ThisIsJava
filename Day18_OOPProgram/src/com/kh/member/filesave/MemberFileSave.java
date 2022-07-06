package com.kh.member.filesave;

import java.io.*;
import java.util.ArrayList;

import com.kh.member.model.vo.Member;

public class MemberFileSave {
	InputStream is = null;
	OutputStream os = null;
	FileInputStream fis = null;
	FileOutputStream fos = null;
	String totalSaveStr = null;
	ArrayList<Member> mList = new ArrayList<Member>();

	// ArrayList를 txt파일에 저장하려면?
	// ArrayList의 필드값을 하나하나 읽고 구분자를 정하여 저장한다?
	// 아이디/이름/성별/나이/이메일/폰번호/주소/취미
	// 필드간의 구분 '/f/' 객체간의 구분 '/o/' 로 해보자

	public void saveMemberList(ArrayList<Member> mList) {
		try {
			fos = new FileOutputStream("mListSave.txt");
			totalSaveStr = null;
			for (int i = 0; i < mList.size(); i++) {
				totalSaveStr += mList.get(i).forFileStr();
			}

			byte[] bufferBytes = totalSaveStr.getBytes();
			fos.write(bufferBytes);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Member> loadMemberList() {
		try {
			fis = new FileInputStream("mListSave.txt");
			totalSaveStr = null;

			int readData = 0;
			while ((readData = fis.read()) != -1) {
				totalSaveStr += (char) readData;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] objSplit = totalSaveStr.split("/o/");
		for(int i = 0; i < objSplit.length; i ++) {
			
		mList.add(new Member(objSplit[i].split("/f/")[0],
							 objSplit[i].split("/f/")[1],
							 objSplit[i].split("/f/")[2],
							 Integer.parseInt(objSplit[i].split("/f/")[3]),
							 objSplit[i].split("/f/")[4],
							 objSplit[i].split("/f/")[5],
							 objSplit[i].split("/f/")[6],
							 objSplit[i].split("/f/")[7],
							 objSplit[i].split("/f/")[8]
				)
				);
		}
		return mList;
		
	}
}
