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

		effectPrintFast("<메뉴 선택>");

		effectPrintFast("1. 주변을 살펴본다.");

		effectPrintFast("2. 소리를 질러본다.");

		effectPrintFast("3. 소지품을 살펴본다.");

		effectPrintFast("4. 힌트를 본다.");

		System.out.print(" 선택 >> ");

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

			effectPrint("다른 선택지는 없는 것 같다...");

			break;

		}

	}



	public static void searchRoom() {

		Scanner sc = new Scanner(System.in);

		System.out.println();

		effectPrint("... ...");

		effectPrint("방을 둘러본다...");

		effectPrintFast("1. 정면에는 도어락으로 잠긴 문이 있다.");

		effectPrintFast("2. 왼쪽에는 노트북이 있다.");

		effectPrintFast("3. 오른쪽에는 자물쇠가 걸린 상자가 있다.");

		effectPrintFast("4. 뒷 편에는 책꽂이가 있다.");



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

			effectPrint("다른 곳은 둘러볼 곳이 없다...");

			break;

		}

	}



	public static void checkNoteBook() {

		effectPrint("노트북을 살펴본다...");

		effectPrint("전원 연결이 되어 있지 않아 켤 수가 없다.");

		if (item.contains("어댑터")) {

			effectPrint("어댑터를 연결해볼까?");

			effectPrint("컴퓨터가 켜졌다.");

			effectPrint("<컴퓨터를 이기면 힌트를 얻을 수 있다.>");

			System.out.println();

			beskinGame();

		} else {

			effectPrint("어댑터가 없어 켤 수가 없다.");

			System.out.println();

		}

	}



	public static void checkBox() {

		Scanner sc = new Scanner(System.in);

		effectPrint("자물쇠가 걸린 상자를 살펴본다.");

		effectPrint("자물쇠: StringTㅇㅇㅇㅇㅇㅇㅇr"); // gTokenize

		System.out.print("비밀번호 입력 > ");

		String input = sc.next();

		if (input.equals("okenize")) {

			effectPrint("상자가 열렸다.");

			effectPrint("노트북 어댑터를 발견했다..!");

			getItem("어댑터");

		} else {

			effectPrint("상자가 열리지 않는다.");

		}

	}



	public static void checkBookShelf() {

		effectPrint("책꽂이를 살펴본다...");

		effectPrint("책들이 꽂혀 있다.");

		effectPrintFast("『VJ특공대 시청률의 비밀』");

		effectPrintFast("『더블A 인쇄용지는 무엇인가』");

		effectPrintFast("『Hemingway의 노인과 바다』");

		effectPrintFast("『K팝 혁명』");



		saveHint((hintCount + 1) + ": 『VJ특공대 시청률의 비밀』,『더블A 인쇄용지는 무엇인가』,『Hemingway의 노인과 바다』,『K팝 혁명』");

	}



	public static void beskinGame() {

		int gamePointerNumber = 0;

		int GOAL_NUMBER = 31;

		boolean gamePlay = true;

		Random rand = new Random();

		Scanner sc = new Scanner(System.in);



		effectPrint("베스킨라빈스 31 게임");

		while (gamePlay) {

			System.out.print("User: 1~3 사이 선택 >");

			int userChoice = sc.nextInt();



			for (int i = 1; i <= userChoice; i++) {

				gamePointerNumber++;

				System.out.println("User : " + gamePointerNumber + "!!");

				try {

					Thread.sleep(400);

					if (gamePointerNumber == GOAL_NUMBER) {

						System.out.println("31을 불렀습니다.");

						System.out.println("User의 패배!");

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

						System.out.println("31을 불렀습니다.");

						System.out.println("COM의 패배!");



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

		System.out.print("뭐라고 소리를 지를까?");

		String shout = sc.nextLine();

		effectPrint(shout);

		if (shout.equals(shoutAnswer)) {

			// 방

			effectPrint("???: 어? 그럼 내보내야겠군...");

			effectPrint("띠로링(도어락 열리는 소리)");

			effectPrint("히든엔딩, 방탈출 성공");

			ingEscape = false;

		} else {

			effectPrint("하지만 아무 일도 일어나지 않는다.");

		}

	}



	public static void checkItem() {

		effectPrint("... ...");

		effectPrint("호주머니를 뒤져본다...");

		if (item.equals(" ")) {

			effectPrint("호주머니가 텅 비었다..");

		} else {

			effectPrint(item + "을 가지고 있다.");

		}



	}



	public static void openDoorLock() {

		Scanner sc = new Scanner(System.in);

		effectPrint("도어락 커버를 올린다.");

		effectPrint("비밀번호를 입력한다.");

		System.out.print("비밀번호 입력> ");

		String inputPassword = sc.next();

		sc.nextLine();

		if (inputPassword.equals(password)) {

			effectPrint("띠리리링");

			effectPrint("도어락이 열린다.");

			effectPrint("방 문을 힘껏 열어젖힌다..!");

			effectPrint("드디어... 탈출인가...!!");

			effectPrint("... ...");

			effectPrint("하지만 열린 문 너머로 보이는 것은 또다른 밀폐된 방이었다...");

			effectPrint("1번 방 탈출 성공");

			effectPrint("<To be continue...>");

			ingEscape = false;



		} else {

			effectPrint("삐!!삐!!삐!!삐!!");

			countDoorLock--;

			if (countDoorLock <= 0) {

				effectPrint("도어락의 전원이 꺼집니다. 방에서 영원히 빠져나갈 수 없습니다.");

				effectPrint("Game Over...");

				ingEscape = false;

			}

			effectPrint("비밀 번호를 틀렸습니다. (남은 횟수 : " + countDoorLock + " )");

			if (countDoorLock == 2) {

				effectPrint("남은 횟수가 있는 건가...? 신중해야겠군...");

			}

		}



	}



	public static void intro() {

		effectPrint("인트로");

		effectPrint("==========");

		effectPrint("머리가 지끈거린다..");

		effectPrint("여기가 어디지..?");

		effectPrint("눈을 떠보니 낯선 방이다.");

		effectPrint("창문 하나 없는 방에 푸른 형광등 불빛이 지직거린다..");

		effectPrint("내가 왜 이런 곳에 있는거지...?");

		effectPrint("어제 술을 마시다 필름이 끊긴 후로 기억이 나질 않는다...");

		effectPrint("... ...");

		effectPrint("문이 보인다.");

		effectPrint("문고리를 돌려보았으나 역시나 열리지 않는다.");

		effectPrint("도어락이 달려있다...");

		effectPrint("비밀번호를 입력해야 나갈 수 있는 건가...?");

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

			effectPrint("지금까지 모은 힌트들...");

			for (int i = 0; i < hintCount; i++) {

				effectPrint(hints[i]);

				System.out.println();

			}

		} else {

			effectPrint("지금까지 얻은 힌트가 없다.");

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

	public static String shoutAnswer = "아 정말 아늑한 방이다!!!";

	public static int countDoorLock = 3;

	String tempStr = " ";

	public static boolean ingEscape = true;

	public static String[] hints = new String[2];

	public static int hintCount = 0;

}