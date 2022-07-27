package jdbcex.library.view;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import jdbcex.library.model.vo.Book;
import jdbcex.library.model.vo.Lease;
import jdbcex.library.model.vo.Library;
import jdbcex.library.model.vo.User;

public class LibraryView {
	ArrayList<Book> bList = null;
	ArrayList<User> uList = null;
	ArrayList<Lease> lList = null;
	
	
	

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
		System.out.println("3.책 이름으로 대여 조회");
		System.out.println("4.대여 정보 추가");
		System.out.println("0.메인 메뉴 이동");
		System.out.print("메뉴 입력 >>");
		return sc.next().charAt(0);
	}
	public char bookMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====책관리 메뉴=====");
		System.out.println("1.전체 책 조회");
		System.out.println("2.책 번호로 조회");
		System.out.println("3.책 추가하기");
		System.out.println("4.책 삭제하기");
		System.out.println("0.메인 메뉴 이동");
		System.out.print("메뉴 입력 >>");
		return sc.next().charAt(0);
	}

	public void printBook(ArrayList<Book> bList) {
		System.out.println("=====책 전체 조회=====");
		bList.stream().forEach(b -> {
			System.out.println("\n----------");
			System.out.println("1.책 번호 : " + b.getBookNo());
			System.out.println("2.책 제목 : " + b.getBookName());
			System.out.println("3.작가 : " + b.getBookWriter());
			System.out.println("4.가격 : " + b.getBookPrice());
			System.out.println("5.출판사 : " + b.getPublisher());
			System.out.println("6.장르 : " + b.getGenre());
			System.out.println("----------");
		});
	}
	public void printUser(ArrayList<User> uList) {
		System.out.println("=====회원 전체 조회=====");
		uList.stream().forEach(u -> {
			System.out.println("\n-----");
			System.out.println("1.회원 번호 : " + u.getUserNo());
			System.out.println("2.회원 아이디 : " + u.getUserId());
			System.out.println("3.회원 이름 : " + u.getUserName());
			System.out.println("4.회원 나이 : " + u.getUserAge());
			System.out.println("5.회원 주소 : " + u.getAddr());
			System.out.println("6.회원 성별 : " + u.getGender());
			System.out.println("7.회원 가입 일자 : " + u.getEnrollDate());
			System.out.println("-----");
		});
	}
	public void printLease(ArrayList<Lease> lList) {
		System.out.println("=====대여 정보 전체 조회=====");
		lList.stream().forEach(l->{
			System.out.println("\n-----");
			System.out.println("1.대여번호"+l.getLeaseNo());
			System.out.println("2.도서번호"+l.getBookNo());
			System.out.println("3.대여자ID"+l.getUserId());
			System.out.println("4.대출일"+l.getLeaseDate());
			System.out.println("5.반납일"+l.getReturnDate());
			System.out.println("-----");
			
		});
		
	}

	
	
	public String inputBookNoMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====도서 번호 입력======");
		System.out.print(">> ");
		return sc.next();
	}
	public String inputBookNameMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====도서 제목 입력======");
		System.out.print(">> ");
		return sc.next();
	}
	public String inputUserIdMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====회원 ID 입력======");
		System.out.print(">> ");
		return sc.next();
	}
	public String inputUserNameMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====회원 이름 입력======");
		System.out.print(">> ");
		return sc.next();
	}

	
	
	
	public void systemMessage(String message) {
		System.out.println("!시스템 메시지!");
		System.out.println("<" + message + ">");
	}
	
	public Book inputBookMenu() {
		Scanner sc = new Scanner(System.in);
		String regexInt = "\\d+";
		
		System.out.println("=====도서 등록 메뉴=====");
		System.out.println("1.도서 번호 > ");
		String bookNoTemp = sc.next();
		while(!Pattern.matches(regexInt,bookNoTemp)) {
			System.out.println("숫자만 입력");
			bookNoTemp = sc.next();
		}
		int bookNo = Integer.parseInt(bookNoTemp);
		
		System.out.println("2.도서 제목 > ");
		String bookName = sc.next();
		System.out.println("3.도서 작가 > ");
		String bookWriter= sc.next();
		System.out.println("4.도서 가격 > ");
		String bookPriceTemp = sc.next();
		while(!Pattern.matches(regexInt, bookPriceTemp)) {
			System.out.println("숫자만 입력");
			bookPriceTemp = sc.next();
		}
		int bookPrice = Integer.parseInt(bookPriceTemp);
		
		System.out.println("5.도서 출판사 > ");
		String publisher = sc.next();
		System.out.println("6.도서 장르 > ");
		String genre = sc.next();
		
		Book book = new Book(bookNo, bookName, bookWriter, bookPrice, publisher, genre);
		return book;
	}
}
