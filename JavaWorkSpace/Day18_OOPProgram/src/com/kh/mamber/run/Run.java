package com.kh.mamber.run;

import java.util.ArrayList;

import com.kh.member.controller.MemberController;
import com.kh.member.filesave.MemberFileSave;
import com.kh.member.model.vo.Member;
import com.lh.member.view.MemberView;

//실행용클래스
public class Run {
	public static void main(String[] args) {
		MemberView view = new MemberView();
		MemberController mController = new MemberController();
		String memberId;
		String memberName;
		int index = 0;
		Member member = null;
		MemberFileSave mFileSave = new MemberFileSave();
		ArrayList<Member> mList = null;
		
		EXIT: while (true) {
			char choice = view.mainMenu();
			switch (choice) {
			case '1':
				mList = mController.printAllMember();
				view.showAllMember(mList);
				break;
			case '2':
				memberId = view.inputMemberId();
				index = mController.findMemberId(memberId);
				if(index == -1) {
					view.displayError("회원 조회 실패");
					break;
				}
				//데이터를 ID로 조회
				member = mController.printOneById(index);
				view.showOneMember(member);
				break;
			case '3':
				memberName = view.inputMemberName();
				index = mController.findMemberName(memberName);
				if(index == -1) {
					view.displayError("회원 조회 실패");
					break;
				}
				member = mController.printOneById(index);
				view.showOneMember(member);
				break;
				
			case '4':
				member = view.inputMember();
				mController.registerMember(member);
				break;
			case '5':
				memberId = view.inputMemberId();
				index = mController.findMemberId(memberId);
				if(index == -1) {
					view.displayError("회원 조회 실패");
					break;
				}
				member = mController.printOneById(index);
				view.updateMember(member);
				break;
			case '6':
				memberId = view.inputMemberId();
				index = mController.findMemberId(memberId);
				if (index != -1) {
					mController.removeMember(index);
					view.displaySuccess("ID가 삭제되었습니다.");
				} else {
					view.displayError("회원 조회 실패");
				}
				break;
			case '0':
				System.out.println("0");
				break EXIT;
			case '8':
				mList = mController.printAllMember();
				mFileSave.saveMemberList(mList);
				break;
			case '9':
				mController.loadFile(mFileSave.loadMemberList());
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");

			}
		}
	}
}
