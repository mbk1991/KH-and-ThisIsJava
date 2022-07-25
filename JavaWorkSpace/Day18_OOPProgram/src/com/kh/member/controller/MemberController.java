package com.kh.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.member.model.vo.Member;

// ������ �߰�, ����, ����
public class MemberController {

	private ArrayList<Member> mList;

	//�����ڿ��� mList�ʱ�ȭ
	public MemberController() {
		mList = new ArrayList<Member>();
	}

	//������ �߰�
	public void registerMember(Member member) {
		mList.add(member);
	}

	//��ü ������ ��ȸ
	public ArrayList<Member> printAllMember() {
		return mList;
	}
	
	//Ư�� ������ ����
	public void removeMember(int index) {
		//id�� �˻��Ͽ� �ش� �������� �ε����� �����;���.
		
		mList.remove(index);
	}
	
	//ã�� id�� �ε��� Ȯ��
	public int findMemberId(String memberId) {
		for(int i = 0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			if(memberId.equals(mOne.getMemberId())) {
				return i;
			}
		}
		return -1; // ���� �� -1
	}
	
	public int findMemberName(String memberName) {
		for(int i = 0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			if(memberName.equals(mOne.getMemberName())) {
				return i;
			}
		}
		return -1; 
	}
	
	public Member printOneById(int index) {
		return mList.get(index);
	}
	
	public void loadFile(ArrayList<Member> mList) {
		this.mList = mList;
	}
	
	

}
