package com.kh.mamber.run;

import java.util.ArrayList;

import com.kh.member.controller.MemberController;
import com.kh.member.model.vo.Member;
import com.lh.member.view.MemberView;

//�����Ŭ����
public class Run {
	public static void main(String[] args) {
		MemberView view = new MemberView();
		MemberController mController = new MemberController();

		EXIT: while (true) {

			char choice = view.mainMenu();
			switch (choice) {
			case '1':
				ArrayList<Member> mList = mController.printAllMember();
				view.showAllMember(mList);
				break;
			case '2':
				System.out.println("2");
				break;
			case '3':
				System.out.println("3");
				break;
			case '4':
				Member member = view.inputMember();
				mController.registerMember(member);
				break;
			case '5':
				System.out.println("5");
				break;
			case '6':
				String memberId = view.inputMemberId();
				int index = mController.findMemberId(memberId);
				if (index != -1) {
					mController.removeMember(index);
					view.displaySuccess("ID�� �����Ǿ����ϴ�.");
				} else {
					view.displayError("��ġ�ϴ� ID�� �����ϴ�.");
				}
				break;
			case '0':
				System.out.println("0");
				break EXIT;
			default:
				System.out.println("�޴��� �ٽ� �����ϼ���.");

			}
		}
	}
}
