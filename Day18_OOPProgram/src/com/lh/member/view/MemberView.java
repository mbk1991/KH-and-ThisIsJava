package com.lh.member.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

//화면 출력을 담당하는 클래스
public class MemberView {
	public char mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====회원관리 프로그램=====");
		System.out.println("1. 회원정보 전체조회");
		System.out.println("2. 회원 아이디로 조회");
		System.out.println("3. 회원 이름으로 조회");
		System.out.println("4. 회원 가입");
		System.out.println("5. 회원 정보 변경");
		System.out.println("6. 회원 정보 삭제");
		System.out.println("0. 종료");
		System.out.println("8. save");
		System.out.println("9. load");
		System.out.print("메뉴 선택 > ");
		char choice = sc.nextLine().charAt(0);
		return choice;
	}

	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.println("아이디 : ");
		member.setMemberId(sc.next());
		System.out.println("비밀번호 : ");
		member.setMemberPwd(sc.next());
		System.out.println("이름 : ");
		member.setMemberName(sc.next());

		while (true) {
			try {
				System.out.println("나이 : ");
				member.setMemberAge(sc.nextInt());
				break;
			} catch (Exception e) {
				System.out.println("정수를 입력하세요.");
				sc.next();
				continue;
			}
		}
		System.out.println("성별 : ");
		member.setMemberGender(sc.next());
		System.out.println("이메일 : ");
		member.setMemberEmail(sc.next());
		System.out.println("전화번호: ");
		member.setMemberPhone(sc.next());
		System.out.println("주소 : ");
		sc.nextLine(); // 개행 제거
		member.setMemberAddress(sc.nextLine());
		System.out.println("취미 : ");
		member.setMemberHobby(sc.next());

		return member;
	}
	
	public void updateMember(Member member) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일 수정 > ");
		member.setMemberEmail(sc.next());
		System.out.println("전화번호 수정 > ");
		member.setMemberPhone(sc.next());
		System.out.println("주소 수정 > ");
		member.setMemberAddress(sc.next());
	}
	

	public void showAllMember(List<Member> mList) {
		System.out.println("=====전체 회원정보 조회결과 =====");
		for (int i = 0; i < mList.size(); i++) {
			System.out.println("회원 번호 : " + (i + 1));
			System.out.println(mList.get(i).toString());
		}
	}
	
	public void showOneMember(Member member) {
		System.out.println("=====회원정보 조회결과 =====");
		System.out.println(member.toString());
	}

	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 아이디 입력 > ");
		String memberId = sc.next();
		return memberId;
	}
	
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 입력 > ");
		String memberName = sc.next();
		return memberName;
		
	}

	public void displaySuccess(String message) {
		System.out.println("[서비스 성공] " + message);
	}

	public void displayError(String message) {
		System.out.println("[서비스 실패] " + message);
	}
}
