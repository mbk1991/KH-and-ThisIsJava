package member.controller;

import java.util.ArrayList;

import member.model.dao.MemberDAO;
import member.model.vo.Member;
import member.view.MemberView;

public class MemberController {
	MemberDAO mDao = new MemberDAO();//저장하는 객체가 아니므로 하나만 만들어도 되지 않을까?
	MemberView view = new MemberView();
	ArrayList<Member> mList = null;
	//mList는 하나의 객체만 만드는 것이 효율적일 것 같다.
	
	public MemberController(){
		mList = new ArrayList<Member>();
	}

	
	
	public void insertCtrl (Member member) {
		int result = mDao.memberInsertDB(member);
		if(result == 1) {
			view.printResult("가입 성공");
		}else {
			view.printResult("가입 실패");
		}
	}
	
	public void updateCtrl() {}
	
	public void deleteCtrl() {}
	
	public void printAllCtrl() {
		view.memberPrintAll(mDao.memberSelectAllDB());
	}
	
	public void findByIdCtrl() {}
	
}
