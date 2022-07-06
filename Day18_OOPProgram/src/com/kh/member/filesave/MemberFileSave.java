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

	// ArrayList�� txt���Ͽ� �����Ϸ���?
	// ArrayList�� �ʵ尪�� �ϳ��ϳ� �а� �����ڸ� ���Ͽ� �����Ѵ�?
	// ���̵�/�̸�/����/����/�̸���/����ȣ/�ּ�/���
	// �ʵ尣�� ���� '/f/' ��ü���� ���� '/o/' �� �غ���

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
