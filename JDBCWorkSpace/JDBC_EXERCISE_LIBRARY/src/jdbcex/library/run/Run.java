package jdbcex.library.run;

import java.util.ArrayList;

import jdbcex.library.controller.LibraryController;
import jdbcex.library.model.vo.Book;
import jdbcex.library.model.vo.Lease;
import jdbcex.library.model.vo.User;
import jdbcex.library.view.LibraryView;

public class Run {

	public static void main(String[] args) {
		LibraryView view = new LibraryView();
		LibraryController lCtrl = new LibraryController();
//		ArrayList<? extends Library> superList = null;
		ArrayList<Book> bList = null;
		ArrayList<User> uList = null;
		ArrayList<Lease> lList = null;
		String tableName = null;

		EXIT: while (true) {
			char input = view.mainMenu();
			switch (input) {
			case '1': // 책관리
				char bInput = view.bookMenu();
				switch (bInput) {
				case '1': // 책 전체 조회
					bList = lCtrl.selectAllBookControl();
					if (!bList.isEmpty()) {
						view.printBook(bList);
					} else {
						view.systemMessage("도서 데이터가 없음");
					}
					break;
				case '2': // 책 번호로 조회
					String inputBookNo = view.inputBookNoMenu();
					bList = lCtrl.selectBookByNoControl(inputBookNo);
					if(!bList.isEmpty()) {
						view.printBook(bList);
					}else {
						view.systemMessage("조회 실패");
					}
					
					break;
				case '3': // 책 추가하기
					Book book = view.inputBookMenu();
					int result = lCtrl.registBookControl(book);
					if(result != 0) {
						view.systemMessage("도서 등록 완료");
					}else {
						view.systemMessage("도서 등록 실패");
					}
					
					
					break;
				case '4': // 책 삭제하기
					break;
				case '0': // 메인 메뉴 이동
					break;
				}

				break;
			case '2': // 회원관리
				char uInput = view.userMenu();
				switch (uInput) {
				case '1': // 회원 전체 조회
					uList = lCtrl.selectAllUserControl();
					if (!uList.isEmpty()) {
						view.printUser(uList);
					} else {
						view.systemMessage("회원데이터가 없음");
					}

					break;
				case '2': // 회원 이름으로 조회
					break;
				case '3': // 회원 아이디로 조회
					break;
				case '4': // 회원 가입
					break;
				case '5': // 회원 정보 수정
					break;
				case '6': // 회원 탈퇴
					break;
				case '0': // 메인 메뉴로 이동
					break;
				}

				break;
			case '3': // 대여관리
				char lInput = view.leaseMenu();
				switch (lInput) {
				case '1': // 대여 관리 전체 조회
					lList = lCtrl.selectAllLeaseControl();
					if (!lList.isEmpty()) {
						view.printLease(lList);
					} else {
						view.systemMessage("대여 정보 없음");
					}

					break;
				case '2': // 회원 아이디로 대여 조회
					break;
				case '3': // 책 이름으로 대여 조회
					break;
				case '4': // 대여정보 추가
					break;
				case '0': // 메인메뉴로 이동
					break;
				}
				break;
			case '0': // 종료
				System.out.println("종료");
				break EXIT;
			}

		}
	}
}
