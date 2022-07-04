package chap6_exam.bank;

import java.util.*;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	private static int listCheckNum = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------");
			System.out.print("선택 > ");

			int selecNo = sc.nextInt();

			switch (selecNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("-----");
		System.out.println("계좌 생성");
		System.out.println("-----");

		System.out.print("계좌번호 > ");
		String ano = sc.next();
		System.out.print("예금주 > ");
		String owner = sc.next();
		System.out.print("초기 입금액 > ");
		int balance = sc.nextInt();

		setAccount(ano, owner, balance);
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("-----");
		System.out.println("계좌목록");
		System.out.println("-----");

		for (Account account : accountArray) {
			if (account != null) {
				System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
			}
		}

	}

	// 예금하기
	private static void deposit() {
		System.out.println("-----");
		System.out.println("예금");
		System.out.println("-----");
		System.out.print("입금할 계좌 > ");
		String ano = sc.next();
		System.out.print("입금액 > ");
		int deposit = sc.nextInt();

		Account account = findAccount(ano);
		int balance = account.getBalance() + deposit;
		account.setBalance(balance);

		System.out.println("예금이 성공되었습니다.");

	}

	// 출금하기
	private static void withdraw() {
		System.out.println("-----");
		System.out.println("출금");
		System.out.println("-----");

		System.out.print("출금할 계좌 > ");
		String ano = sc.next();
		System.out.print("출금액 > ");
		int withdraw = sc.nextInt();

		Account account = findAccount(ano);
		int balance = account.getBalance() - withdraw;
		account.setBalance(balance);

		System.out.println("출금이 성공되었습니다.");

	}

	// Account배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for (Account account : accountArray) {
			if (account.getAno().equals(ano)) {
				return account;
			}
		}
		System.out.println("일치하는 계좌가 없습니다.");
		return null;
	}

	private static void setAccount(String ano, String owner, int balance) {
		Account account = new Account(ano, owner, balance);
		accountArray[listCheckNum] = account;
		listCheckNum++;
	}

}
