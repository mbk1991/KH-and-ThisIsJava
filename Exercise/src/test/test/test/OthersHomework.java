package test.test.test;



import java.util.Random;

import java.util.Scanner;



import exercise.nintendo.game.Com;

import exercise.nintendo.game.Player;



public class OthersHomework {



	public static void main(String[] args) {



		intro();



		while (ingEscape) {

			mainMenu();

		}

	}



	public static void mainMenu() {

		Scanner sc = new Scanner(System.in);

		System.out.println();

		effectPrintFast("<�޴� ����>");

		effectPrintFast("1. �ֺ��� ���캻��.");

		effectPrintFast("2. �Ҹ��� ��������.");

		effectPrintFast("3. ����ǰ�� ���캻��.");

		effectPrintFast("4. ��Ʈ�� ����.");

		System.out.print(" ���� >> ");

		char choice = sc.nextLine().charAt(0);

		switch (choice) {

		case '1':

			searchRoom();

			break;

		case '2':

			shout();

			break;

		case '3':

			checkItem();

			break;

		case '4':

			getHint();

			break;

		default:

			effectPrint("�ٸ� �������� ���� �� ����...");

			break;

		}

	}



	public static void searchRoom() {

		Scanner sc = new Scanner(System.in);

		System.out.println();

		effectPrint("... ...");

		effectPrint("���� �ѷ�����...");

		effectPrintFast("1. ���鿡�� ��������� ��� ���� �ִ�.");

		effectPrintFast("2. ���ʿ��� ��Ʈ���� �ִ�.");

		effectPrintFast("3. �����ʿ��� �ڹ��谡 �ɸ� ���ڰ� �ִ�.");

		effectPrintFast("4. �� ���� å���̰� �ִ�.");



		char choice = sc.nextLine().charAt(0);



		switch (choice) {

		case '1':

			openDoorLock();

			break;

		case '2':

			checkNoteBook();

			break;

		case '3':

			checkBox();

			break;

		case '4':

			checkBookShelf();

			break;

		default:

			effectPrint("�ٸ� ���� �ѷ��� ���� ����...");

			break;

		}

	}



	public static void checkNoteBook() {

		effectPrint("��Ʈ���� ���캻��...");

		effectPrint("���� ������ �Ǿ� ���� �ʾ� �� ���� ����.");

		if (item.contains("�����")) {

			effectPrint("����͸� �����غ���?");

			effectPrint("��ǻ�Ͱ� ������.");

			effectPrint("<��ǻ�͸� �̱�� ��Ʈ�� ���� �� �ִ�.>");

			System.out.println();

			beskinGame();

		} else {

			effectPrint("����Ͱ� ���� �� ���� ����.");

			System.out.println();

		}

	}



	public static void checkBox() {

		Scanner sc = new Scanner(System.in);

		effectPrint("�ڹ��谡 �ɸ� ���ڸ� ���캻��.");

		effectPrint("�ڹ���: StringT��������������r"); // gTokenize

		System.out.print("��й�ȣ �Է� > ");

		String input = sc.next();

		if (input.equals("okenize")) {

			effectPrint("���ڰ� ���ȴ�.");

			effectPrint("��Ʈ�� ����͸� �߰��ߴ�..!");

			getItem("�����");

		} else {

			effectPrint("���ڰ� ������ �ʴ´�.");

		}

	}



	public static void checkBookShelf() {

		effectPrint("å���̸� ���캻��...");

		effectPrint("å���� ���� �ִ�.");

		effectPrintFast("��VJƯ���� ��û���� ��С�");

		effectPrintFast("������A �μ������ �����ΰ���");

		effectPrintFast("��Hemingway�� ���ΰ� �ٴ١�");

		effectPrintFast("��K�� ����");



		saveHint((hintCount + 1) + ": ��VJƯ���� ��û���� ��С�,������A �μ������ �����ΰ���,��Hemingway�� ���ΰ� �ٴ١�,��K�� ����");

	}



	public static void beskinGame() {

		int gamePointerNumber = 0;

		int GOAL_NUMBER = 31;

		boolean gamePlay = true;

		Random rand = new Random();

		Scanner sc = new Scanner(System.in);



		effectPrint("����Ų��� 31 ����");

		while (gamePlay) {

			System.out.print("User: 1~3 ���� ���� >");

			int userChoice = sc.nextInt();



			for (int i = 1; i <= userChoice; i++) {

				gamePointerNumber++;

				System.out.println("User : " + gamePointerNumber + "!!");

				try {

					Thread.sleep(400);

					if (gamePointerNumber == GOAL_NUMBER) {

						System.out.println("31�� �ҷ����ϴ�.");

						System.out.println("User�� �й�!");

						gamePlay = false;

						break;

					}

				} catch (InterruptedException e) {

					e.printStackTrace();

				}

			}



			int comChoice;

			if ((((gamePointerNumber + 1)) - 2) % 4 == 0) {

				comChoice = 1;

			} else if ((((gamePointerNumber + 2)) - 2) % 4 == 0) {

				comChoice = 2;

			} else if ((((gamePointerNumber + 3)) - 2) % 4 == 0) {

				comChoice = 3;

			} else {

				comChoice = rand.nextInt(3) + 1;

			}



			for (int i = 1; i <= comChoice; i++) {

				gamePointerNumber++;

				System.out.println("COM : " + gamePointerNumber + "!!");

				try {

					Thread.sleep(400);

					if (gamePointerNumber == GOAL_NUMBER) {

						System.out.println("31�� �ҷ����ϴ�.");

						System.out.println("COM�� �й�!");



						saveHint((hintCount + 1) + " : CAPITAL 534621");

						System.out.println();

						System.out.println("<CAPITAL 534621>");

						gamePlay = false;

						break;

					}

				} catch (InterruptedException e) {

					e.printStackTrace();

				}

			}

		}

	}



	public static void shout() {

		Scanner sc = new Scanner(System.in);

		System.out.print("����� �Ҹ��� ������?");

		String shout = sc.nextLine();

		effectPrint(shout);

		if (shout.equals(shoutAnswer)) {

			// ��

			effectPrint("???: ��? �׷� �������߰ڱ�...");

			effectPrint("��θ�(����� ������ �Ҹ�)");

			effectPrint("���翣��, ��Ż�� ����");

			ingEscape = false;

		} else {

			effectPrint("������ �ƹ� �ϵ� �Ͼ�� �ʴ´�.");

		}

	}



	public static void checkItem() {

		effectPrint("... ...");

		effectPrint("ȣ�ָӴϸ� ��������...");

		if (item.equals(" ")) {

			effectPrint("ȣ�ָӴϰ� �� �����..");

		} else {

			effectPrint(item + "�� ������ �ִ�.");

		}



	}



	public static void openDoorLock() {

		Scanner sc = new Scanner(System.in);

		effectPrint("����� Ŀ���� �ø���.");

		effectPrint("��й�ȣ�� �Է��Ѵ�.");

		System.out.print("��й�ȣ �Է�> ");

		String inputPassword = sc.next();

		sc.nextLine();

		if (inputPassword.equals(password)) {

			effectPrint("�츮����");

			effectPrint("������� ������.");

			effectPrint("�� ���� ���� ����������..!");

			effectPrint("����... Ż���ΰ�...!!");

			effectPrint("... ...");

			effectPrint("������ ���� �� �ʸӷ� ���̴� ���� �Ǵٸ� ����� ���̾���...");

			effectPrint("1�� �� Ż�� ����");

			effectPrint("<To be continue...>");

			ingEscape = false;



		} else {

			effectPrint("��!!��!!��!!��!!");

			countDoorLock--;

			if (countDoorLock <= 0) {

				effectPrint("������� ������ �����ϴ�. �濡�� ������ �������� �� �����ϴ�.");

				effectPrint("Game Over...");

				ingEscape = false;

			}

			effectPrint("��� ��ȣ�� Ʋ�Ƚ��ϴ�. (���� Ƚ�� : " + countDoorLock + " )");

			if (countDoorLock == 2) {

				effectPrint("���� Ƚ���� �ִ� �ǰ�...? �����ؾ߰ڱ�...");

			}

		}



	}



	public static void intro() {

		effectPrint("��Ʈ��");

		effectPrint("==========");

		effectPrint("�Ӹ��� �����Ÿ���..");

		effectPrint("���Ⱑ �����..?");

		effectPrint("���� ������ ���� ���̴�.");

		effectPrint("â�� �ϳ� ���� �濡 Ǫ�� ������ �Һ��� �����Ÿ���..");

		effectPrint("���� �� �̷� ���� �ִ°���...?");

		effectPrint("���� ���� ���ô� �ʸ��� ���� �ķ� ����� ���� �ʴ´�...");

		effectPrint("... ...");

		effectPrint("���� ���δ�.");

		effectPrint("������ ������������ ���ó� ������ �ʴ´�.");

		effectPrint("������� �޷��ִ�...");

		effectPrint("��й�ȣ�� �Է��ؾ� ���� �� �ִ� �ǰ�...?");

		effectPrint("... ...");

	}



	public static void getItem(String itemStr) {

		item += itemStr;

	}



	public static void saveHint(String hint) {

		hints[hintCount] = hint;

		hintCount++;

	}



	public static void getHint() {



		if (hints[0] != null) {

			effectPrint("���ݱ��� ���� ��Ʈ��...");

			for (int i = 0; i < hintCount; i++) {

				effectPrint(hints[i]);

				System.out.println();

			}

		} else {

			effectPrint("���ݱ��� ���� ��Ʈ�� ����.");

		}

	}



	public static void effectPrint(String tempStr) {

		try {

			for (int i = 0; i < tempStr.length(); i++) {

				System.out.print(tempStr.charAt(i));

				Thread.sleep(40);

			}

			Thread.sleep(800);

			System.out.println();

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}



	public static void effectPrintFast(String tempStr) {

		try {

			for (int i = 0; i < tempStr.length(); i++) {

				System.out.print(tempStr.charAt(i));

				Thread.sleep(30);

			}

			Thread.sleep(30);

			System.out.println();

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}



	public static String item = " ";

	public static String password = "KHJAVA";

	public static String shoutAnswer = "�� ���� �ƴ��� ���̴�!!!";

	public static int countDoorLock = 3;

	String tempStr = " ";

	public static boolean ingEscape = true;

	public static String[] hints = new String[2];

	public static int hintCount = 0;

}