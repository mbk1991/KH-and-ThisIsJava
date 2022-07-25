package member.view;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberView {
	/*  회원 관리 프로그램
	 * 1. 회원 가입 
	 * 		:정보를 입력해서 회원으로 가입한다.
	 * 		:아이디 및 이메일 중복체크를 실행한다.
	 * 		:전화번호, 비밀번호, 주민번호, 이메일을 양식에 맞게 입력해야 한다.
	 * 	
	 * 2. 회원 정보 수정
	 * 		:로그인 처럼 인증절차를 만들고 인증 성공 시 수정 가능하게?+
	 *  
	 * 3. 회원 탈퇴
	 * 		:로그인 처럼 인증절차를 만들고 인증 성공 시 탈퇴 가능하게?
	 * 
	 * 4. 전체 회원 조회
	 * 		:아이디로 조회, 전체 조회, 마스킹된 값을 제공하도록?
	 * 
	 * 5. 아이디로 회원 찾기
	*/ 	
	
	//기본 메뉴
	public char mainMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n<<회원관리 프로그램>>");
		System.out.println("1. 회원 가입 ");
		System.out.println("2. 회원 수정 ");
		System.out.println("3. 회원 탈퇴 ");
		System.out.println("4. 전체 회원 조회 ");
		System.out.println("5. ID로 회원 찾기 ");
		System.out.println("0. 종료 ");
		System.out.print("메뉴 입력 >> ");
		char input = sc.next().charAt(0);
		return input;
	}
	
	//회원 조회 시 마다 재사용 할 수 있도록
	public void memberPrint() {}
	
	public Member memberInsertMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==회원 가입 메뉴==");
		
		System.out.println("ID 입력 ");
		System.out.print(">> ");
		String memberId = sc.next();
		
		System.out.println("PWD 입력 ");
		System.out.print(">> ");
		String memberPwd = sc.next();
		
		System.out.println("이름 입력 ");
		System.out.print(">> ");
		String memberName = sc.next();
		
		System.out.println("주민등록번호 입력 ");
		System.out.print(">> ");
		String memberSsn = sc.next();
		
		System.out.println("주소 입력 ");
		System.out.print(">> ");
		String memberAddress = sc.nextLine();
		
		System.out.println("연락처 입력 ");
		System.out.print(">> ");
		String memberPhone = sc.next();
		
		System.out.println("이메일 입력 ");
		System.out.print(">> ");
		String memberEmail = sc.next();
		
		
		Member member = new Member(memberId, memberPwd, memberName,
				memberSsn, memberAddress, memberPhone, memberEmail);
		
		return member;
		
	}
	
	public void memberUpdateMenu() {
		System.out.println("==회원 정보 수정 메뉴==");
		
	}
	
	public void memberDeleteMenu() {
		System.out.println("==회원 탈퇴 메뉴==");
		
	}
	
	public void memberFindByIdMenu() {
		System.out.println("==ID로 회원 찾기 메뉴==");
	}
	
	public void memberConfirm() {
		System.out.println("==회원 비밀번호 인증 메뉴==");
		
	}
	
	public void memberPrintAll() {
		System.out.println("==전체 회원 조회 메뉴==");
		
	}
	
	public void memberPrintById() {
		System.out.println("==회원 조회 메뉴==");
		
	}
	
	
	
}
