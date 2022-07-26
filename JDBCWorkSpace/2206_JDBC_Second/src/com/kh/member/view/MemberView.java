package com.kh.member.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberView {
	/*회원관리 프로그램
	 *Statement와 PrepareStatement를 적절하게 사용하기.
	 *회원 등록
	 *회원 전체 조회
	 *회원 아이디로 조회
	 *회원 이름으로 조회
	 *회원 정보 수정
	 *회원 삭제
	*/
	ArrayList<Member> mList = null;
	Member member = null;
	
	
	public char showMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====회원 관리 프로그램=====");
		System.out.println("1.전체 회원 조회");
		System.out.println("2.아이디로 회원 조회");
		System.out.println("3.이름으로 회원 조회");
		System.out.println("4.회원 등록");
		System.out.println("5.회원 정보 수정");
		System.out.println("6.회원 삭제");
		System.out.print("번호 입력 >> ");
		return sc.next().charAt(0);
	}
	
	public void showAll(ArrayList<Member> mList) {
		System.out.println("=====회원 정보 출력=====");
		mList.stream().forEach( 
				m-> {
					System.out.println("회원 ID : "+m.getMemberId());
					System.out.println("회원 이름 : "+m.getMemberName());
					System.out.println("회원 성별 : "+m.getGender());
					System.out.println("회원 나이 : "+m.getAge());
					System.out.println("회원 이메일 : "+m.getEmail());
					System.out.println("회원 전화번호 : "+m.getPhone());
					System.out.println("회원 주소 : "+m.getAddress());
					System.out.println("회원 취미 : "+m.getHobby());
					System.out.println("=====");
				}
				);
	}
	
	public String inputId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====아이디 검색=====");
		System.out.print("아이디 입력 >>");
		return sc.next();
	}
	
	public String inputName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====이름 검색=====");
		System.out.print("이름 입력 >>");
		return sc.next();
	}
	
	public void systemMessage(String message) {
		System.out.println("!시스템 메시지!");
		System.out.println(": "+ message);
	}

	public Member insertMemberMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====회원 등록 메뉴=====");
		System.out.print("1.아이디 입력 >>");
		String memberId = sc.next();
		System.out.print("2.비밀번호 입력 >>");
		String memberPwd = sc.next();
		System.out.print("3.이름 입력 >>");
		String memberName = sc.next();
		System.out.print("4.성별 입력 >>");
		char gender = sc.next().charAt(0);
		System.out.print("5.나이 입력 >>");
		int age = sc.nextInt();
		System.out.print("6.이메일 입력 >>");
		String email = sc.next();
		System.out.print("7.전화번호 입력 >>");
		String phone = sc.next();
		System.out.print("8.주소 입력 >>");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print("9.취미 입력 >>");
		String hobby = sc.next();
		
		member = new Member(memberId, memberPwd, 
				memberName, gender, age, 
				email, phone, address, hobby);
		return member;
	}

	public Member modifyMemberMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====회원 정보 수정 메뉴=====");
		System.out.println("1.비밀번호 수정> ");
		String memberPwd = sc.next();
		System.out.println("2. 이름 수정> ");
		String memberName = sc.next();
		System.out.println("3. 성별 수정> ");
		char gender = sc.next().charAt(0);
		System.out.println("4. 나이 수정> ");
		int age = sc.nextInt();
		System.out.println("5. 이메일 수정> ");
		String email = sc.next();
		System.out.println("6. 전화번호 수정> ");
		String phone = sc.next();
		System.out.println("7. 주소 수정>  ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("8. 취미 수정>  ");
		String hobby = sc.next();
		
		member =  new Member(memberPwd, memberName,
				gender, age, email, phone, address,
				hobby);
		return member;
	}

	public String inputPwd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====비밀번호 입력 메뉴=====");
		System.out.print("비밀번호 입력 >>");
		return sc.next();
	}
	
	
	
}
