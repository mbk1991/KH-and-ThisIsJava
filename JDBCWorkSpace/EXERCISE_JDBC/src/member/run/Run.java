package member.run;

import member.controller.MemberController;
import member.model.vo.Member;
import member.view.MemberView;

public class Run {
	public static void main(String[] args) {
		MemberView view = new MemberView();
		MemberController mCtrl = new MemberController();
		Member member = null;

		EXIT: while (true) {
			char input = view.mainMenu();

			switch (input) {
			case '1':
				member = view.memberInsertMenu();
				mCtrl.insertCtrl(member);
				
				
				break;
			case '2':
				view.memberUpdateMenu();
				
				break;
			case '3':
				view.memberDeleteMenu();
				
				break;
			case '4':
				mCtrl.printAllCtrl();
				break;
			case '5':
				view.memberFindByIdMenu();
				
				break;
			case '0':
				System.out.println("종료");
				break EXIT;
			}
		}
	}
}
