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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------");
			System.out.print("���� > ");

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
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

	// ���»����ϱ�
	private static void createAccount() {
		System.out.println("-----");
		System.out.println("���� ����");
		System.out.println("-----");

		System.out.print("���¹�ȣ > ");
		String ano = sc.next();
		System.out.print("������ > ");
		String owner = sc.next();
		System.out.print("�ʱ� �Աݾ� > ");
		int balance = sc.nextInt();

		setAccount(ano, owner, balance);
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
	}

	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("-----");
		System.out.println("���¸��");
		System.out.println("-----");

		for (Account account : accountArray) {
			if (account != null) {
				System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
			}
		}

	}

	// �����ϱ�
	private static void deposit() {
		System.out.println("-----");
		System.out.println("����");
		System.out.println("-----");
		System.out.print("�Ա��� ���� > ");
		String ano = sc.next();
		System.out.print("�Աݾ� > ");
		int deposit = sc.nextInt();

		Account account = findAccount(ano);
		int balance = account.getBalance() + deposit;
		account.setBalance(balance);

		System.out.println("������ �����Ǿ����ϴ�.");

	}

	// ����ϱ�
	private static void withdraw() {
		System.out.println("-----");
		System.out.println("���");
		System.out.println("-----");

		System.out.print("����� ���� > ");
		String ano = sc.next();
		System.out.print("��ݾ� > ");
		int withdraw = sc.nextInt();

		Account account = findAccount(ano);
		int balance = account.getBalance() - withdraw;
		account.setBalance(balance);

		System.out.println("����� �����Ǿ����ϴ�.");

	}

	// Account�迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		for (Account account : accountArray) {
			if (account.getAno().equals(ano)) {
				return account;
			}
		}
		System.out.println("��ġ�ϴ� ���°� �����ϴ�.");
		return null;
	}

	private static void setAccount(String ano, String owner, int balance) {
		Account account = new Account(ano, owner, balance);
		accountArray[listCheckNum] = account;
		listCheckNum++;
	}

}
