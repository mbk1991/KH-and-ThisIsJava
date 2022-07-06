package com.lh.member.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

//ȭ�� ����� ����ϴ� Ŭ����
public class MemberView {
	public char mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====ȸ������ ���α׷�=====");
		System.out.println("1. ȸ������ ��ü��ȸ");
		System.out.println("2. ȸ�� ���̵�� ��ȸ");
		System.out.println("3. ȸ�� �̸����� ��ȸ");
		System.out.println("4. ȸ�� ����");
		System.out.println("5. ȸ�� ���� ����");
		System.out.println("6. ȸ�� ���� ����");
		System.out.println("0. ����");
		System.out.println("8. save");
		System.out.println("9. load");
		System.out.print("�޴� ���� > ");
		char choice = sc.nextLine().charAt(0);
		return choice;
	}

	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.println("���̵� : ");
		member.setMemberId(sc.next());
		System.out.println("��й�ȣ : ");
		member.setMemberPwd(sc.next());
		System.out.println("�̸� : ");
		member.setMemberName(sc.next());

		while (true) {
			try {
				System.out.println("���� : ");
				member.setMemberAge(sc.nextInt());
				break;
			} catch (Exception e) {
				System.out.println("������ �Է��ϼ���.");
				sc.next();
				continue;
			}
		}
		System.out.println("���� : ");
		member.setMemberGender(sc.next());
		System.out.println("�̸��� : ");
		member.setMemberEmail(sc.next());
		System.out.println("��ȭ��ȣ: ");
		member.setMemberPhone(sc.next());
		System.out.println("�ּ� : ");
		sc.nextLine(); // ���� ����
		member.setMemberAddress(sc.nextLine());
		System.out.println("��� : ");
		member.setMemberHobby(sc.next());

		return member;
	}
	
	public void updateMember(Member member) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� ���� > ");
		member.setMemberEmail(sc.next());
		System.out.println("��ȭ��ȣ ���� > ");
		member.setMemberPhone(sc.next());
		System.out.println("�ּ� ���� > ");
		member.setMemberAddress(sc.next());
	}
	

	public void showAllMember(List<Member> mList) {
		System.out.println("=====��ü ȸ������ ��ȸ��� =====");
		for (int i = 0; i < mList.size(); i++) {
			System.out.println("ȸ�� ��ȣ : " + (i + 1));
			System.out.println(mList.get(i).toString());
		}
	}
	
	public void showOneMember(Member member) {
		System.out.println("=====ȸ������ ��ȸ��� =====");
		System.out.println(member.toString());
	}

	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ���̵� �Է� > ");
		String memberId = sc.next();
		return memberId;
	}
	
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �̸� �Է� > ");
		String memberName = sc.next();
		return memberName;
		
	}

	public void displaySuccess(String message) {
		System.out.println("[���� ����] " + message);
	}

	public void displayError(String message) {
		System.out.println("[���� ����] " + message);
	}
}
