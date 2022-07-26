package com.kh.member.controller;

import java.util.ArrayList;

import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;

public class MemberController {
	ArrayList<Member> mList = null;
	MemberDAO mDao = new MemberDAO();

	public ArrayList<Member> memberSelectAll() {
		mList = mDao.memberSelectAllDB();
		return mList;
	}

	public ArrayList<Member> memberSelectById(String inputId) {
		mList = mDao.memberSelectByIdDB(inputId);
		return mList;
	}

	public ArrayList<Member> memberSelectByName(String inputName) {
		mList = mDao.memberSelectByNameDB(inputName);
		return mList;
	}

	public int memberInsertDB(Member member) {
		int result = mDao.memberInsertDB(member);
		return result;
	}

	public boolean idCheck(String inputIdForUpdate) {
		int result = mDao.memberIdCheckDB(inputIdForUpdate);
		if(result >= 1) return true;
		else return false;
	}

	public int memberUpdate(Member member) {
		int result = mDao.memberUpdateDB(member);
		return result;
	}

}
