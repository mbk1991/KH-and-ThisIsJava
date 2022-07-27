package jdbcex.library.view;

import java.util.Scanner;

public class LibraryView {

	public char mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====도서관 관리 프로그램=====");
		System.out.println("1.책 관리");
		System.out.println("2.회원 관리");
		System.out.println("3.대여 관리");
		System.out.println("0.종료");
		System.out.print("메뉴 입력 >>");
		return sc.next().charAt(0);
	}

	public char userMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====회원관리 메뉴=====");
		System.out.println("1.회원 전체 조회");
		System.out.println("2.회원 이름으로 조회");
		System.out.println("3.회원 아이디로 조회");
		System.out.println("4.회원 가입");
		System.out.println("5.회원 정보 수정");
		System.out.println("6.회원 회원 탈퇴");
		System.out.println("0.메인 메뉴 이동");
		System.out.print("메뉴 입력 >>");
		return sc.next().charAt(0);		
	}

	public char leaseMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====대여관리 메뉴=====");
		System.out.println("1.대여현황 전체 조회");
		System.out.println("2.회원 아이디로 대여 조회");
		System.out.println("3.책이름으로 대여 조회");
		System.out.println("4.대여정보 추가"); 
		System.out.println("0.메인 메뉴 이동");
		System.out.print("메뉴 입력 >>");
		return sc.next().charAt(0);
	}

	public char bookMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====책관리 메뉴=====");
		System.out.println("1.전체 책 조회");
		System.out.println("2.책코드로 조회");
		System.out.println("3.책 추가하기");
		System.out.println("4.책 삭제하기"); 
		System.out.println("0.메인 메뉴 이동");
		System.out.print("메뉴 입력 >>");
		return sc.next().charAt(0);
	}

}
