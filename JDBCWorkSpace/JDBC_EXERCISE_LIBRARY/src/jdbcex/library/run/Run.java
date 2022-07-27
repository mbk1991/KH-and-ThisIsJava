package jdbcex.library.run;

import jdbcex.library.view.LibraryView;

public class Run {

	public static void main(String[] args) {
		LibraryView view = new LibraryView();

		EXIT: while (true) {
			char input = view.mainMenu();
			switch (input) {
			case '1': // 책관리
				char bInput = view.bookMenu();
				switch (bInput) {
				case '1': // 책 전체 조회
//컨트롤러가 다오에서 bookList를 가져와 뷰에 전달
//dao의 전체조회기능은 재사용을 하고 싶음
					
					
					break;
				case '2': // 책 코드로 조회
					break;
				case '3': // 책 추가하기
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
				switch(lInput) {
				case '1': //대여 관리 전체 조회
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
