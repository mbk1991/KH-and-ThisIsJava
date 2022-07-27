package com.kh.member.controller;

import java.util.ArrayList;

import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;

public class MemberController {
	ArrayList<Member> mList = null;
	MemberDAO mDao = new MemberDAO();
	private MemberService mService = new MemberService();

	public ArrayList<Member> memberSelectAll() {
		mList = mService.printAllService();
		return mList;
	}

	public ArrayList<Member> memberSelectById(String inputId) {
		mList = mService.printByIdService(inputId);
		return mList;
	}

	public ArrayList<Member> memberSelectByName(String inputName) {
		mList = mService.printByNameService(inputName);
		return mList;
	}

	public int memberInsertDB(Member member) {
		int result = mService.insertMemberService(member);
		return result;
	}

	public int memberUpdate(Member member) {
		int result = mService.updateMemberService(member);
		return result;
	}

	public int memberDelete(String inputIdForDelete) {
		int result = mService.deleteMemberService(inputIdForDelete);
		return result;
	}
	
	public boolean idCheck(String inputIdForUpdate) {
		int result = mService.checkMemberIdService(inputIdForUpdate);
		if(result >= 1) return true;
		else return false;
	}

	public boolean pwdCheck(String inputIdForDelete, String inputPassword) {
		String dbPwd = mService.checkMemberPwdService(inputIdForDelete);
		if(inputPassword.equals(dbPwd)) {
			return true;
		}else {
			return false;
		}
	}

	


}
