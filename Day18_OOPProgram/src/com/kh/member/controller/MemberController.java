package com.kh.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.member.model.vo.Member;

// 데이터 추가, 수정, 삭제
public class MemberController {

	private ArrayList<Member> mList;

	//생성자에서 mList초기화
	public MemberController() {
		mList = new ArrayList<Member>();
	}

	//데이터 추가
	public void registerMember(Member member) {
		mList.add(member);
	}

	//전체 데이터 조회
	public ArrayList<Member> printAllMember() {
		return mList;
	}
	
	//특정 데이터 삭제
	public void removeMember(int index) {
		//id로 검색하여 해당 데이터의 인덱스를 가져와야함.
		
		mList.remove(index);
	}
	
	//찾는 id의 인덱스 확인
	public int findMemberId(String memberId) {
		for(int i = 0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			if(memberId.equals(mOne.getMemberId())) {
				return i;
			}
		}
		return -1; // 없을 때 -1
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
