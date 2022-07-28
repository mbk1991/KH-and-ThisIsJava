package com.kh.member.controller;

import java.util.ArrayList;

import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;

public class MemberController {
	ArrayList<Member> mList = null;
	MemberDAO mDao = new MemberDAO();
	MemberService mService = new MemberService();

	public ArrayList<Member> memberSelectAll() {
		mList = mService.memberSelectAllService();
		return mList;
	}

	public ArrayList<Member> memberSelectById(String inputId) {
		mList = mService.memberSelectByIdService(inputId);
		return mList;
	}

	public ArrayList<Member> memberSelectByName(String inputName) {
		mList = mService.memberSelectByNameService(inputName);
		return mList;
	}

	public int memberInsertDB(Member member) {
		int result = mService.memberInsertService(member);
		return result;
	}

	public boolean idCheck(String inputIdForUpdate) {
		int result = mService.memberIdCheckService(inputIdForUpdate);
		if (result >= 1)
			return true;
		else
			return false;
	}

	public int memberUpdate(Member member) {
		int result = mService.memberUpdateService(member);
		return result;
	}

	public boolean pwdCheck(String inputIdForDelete, String inputPassword) {
		String dbPwd = mService.memberPwdCheckSerivice(inputIdForDelete);
		if (inputPassword.equals(dbPwd)) {
			return true;
		} else {
			return false;
		}
	}

	public int memberDelete(String inputIdForDelete) {
		int result = mService.memberDeleteService(inputIdForDelete);
		return result;
	}

}
