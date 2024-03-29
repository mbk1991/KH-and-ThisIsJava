package exercise.mini;

import java.util.Random;
import java.util.Scanner;

import exercise.nintendo.game.Com;
import exercise.nintendo.game.Player;

public class EscapeRoom {

	public static void main(String[] args) {

		intro();

		while (ingEscape) {
			mainMenu();
		}
	}

	public static void mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		effectPrintFast("<五敢 識澱>");
		effectPrintFast("1. 爽痕聖 詞縄沙陥.");
		effectPrintFast("2. 社軒研 霜君沙陥.");
		effectPrintFast("3. 社走念聖 詞縄沙陥.");
		effectPrintFast("4. 微闘研 沙陥.");
		System.out.print(" 識澱 >> ");
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
			effectPrint("陥献 識澱走澗 蒸澗 依 旭陥...");
			break;
		}
	}

	public static void searchRoom() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		effectPrint("... ...");
		effectPrint("号聖 却君沙陥...");
		effectPrintFast("1. 舛檎拭澗 亀嬢喰生稽 節延 庚戚 赤陥.");
		effectPrintFast("2. 図楕拭澗 葛闘栽戚 赤陥.");
		effectPrintFast("3. 神献楕拭澗 切弘取亜 杏鍵 雌切亜 赤陥.");
		effectPrintFast("4. 急 畷拭澗 奪家戚亜 赤陥.");

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
			effectPrint("陥献 員精 却君瑳 員戚 蒸陥...");
			break;
		}
	}

	public static void checkNoteBook() {
		effectPrint("葛闘栽聖 詞縄沙陥...");
		effectPrint("穿据 尻衣戚 鞠嬢 赤走 省焼 柘 呪亜 蒸陥.");
		if (item.contains("嬢基斗")) {
			effectPrint("嬢基斗研 尻衣背瑳猿?");
			effectPrint("陳濃斗亜 佃然陥.");
			effectPrint("<陳濃斗研 戚奄檎 微闘研 条聖 呪 赤陥.>");
			System.out.println();
			beskinGame();
		} else {
			effectPrint("嬢基斗亜 蒸嬢 柘 呪亜 蒸陥.");
			System.out.println();
		}
	}

	public static void checkBox() {
		Scanner sc = new Scanner(System.in);
		effectPrint("切弘取亜 杏鍵 雌切研 詞縄沙陥.");
		effectPrint("切弘取: StringTしししししししr"); // gTokenize
		System.out.print("搾腔腰硲 脊径 > ");
		String input = sc.next();
		if (input.equals("okenize")) {
			effectPrint("雌切亜 伸携陥.");
			effectPrint("葛闘栽 嬢基斗研 降胃梅陥..!");
			getItem("嬢基斗");
		} else {
			effectPrint("雌切亜 伸軒走 省澗陥.");
		}
	}

	public static void checkBookShelf() {
		effectPrint("奪家戚研 詞縄沙陥...");
		effectPrint("奪級戚 家粕 赤陥.");
		effectPrintFast("〆VJ働因企 獣短懸税 搾腔〇");
		effectPrintFast("〆希鷺A 昔錫遂走澗 巷譲昔亜〇");
		effectPrintFast("〆Hemingway税 葛昔引 郊陥〇");
		effectPrintFast("〆K橡 舶誤〇");
		
		if(hintCount <2 ) {
			saveHint((hintCount + 1) + ": 〆VJ働因企 獣短懸税 搾腔〇,〆希鷺A 昔錫遂走澗 巷譲昔亜〇,〆Hemingway税 葛昔引 郊陥〇,〆K橡 舶誤〇");
		}
	}

	public static void beskinGame() {
		int gamePointerNumber = 0;
		int GOAL_NUMBER = 31;
		boolean gamePlay = true;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		effectPrint("今什轍虞朔什 31 惟績");
		while (gamePlay) {
			System.out.print("User: 1~3 紫戚 識澱 >");
			int userChoice = sc.nextInt();
			while(userChoice <1 || userChoice >3) {
				System.out.println("1~3紫戚幻 脊径馬獣虞壱!");
				System.out.print("User: 1~3 紫戚 識澱 >");
				userChoice = sc.nextInt();
				
			}

			for (int i = 1; i <= userChoice; i++) {
				gamePointerNumber++;
				System.out.println("User : " + gamePointerNumber + "!!");
				try {
					Thread.sleep(400);
					if (gamePointerNumber == GOAL_NUMBER) {
						System.out.println("31聖 災袈柔艦陥.");
						System.out.println("User税 鳶壕!");
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
						System.out.println("31聖 災袈柔艦陥.");
						System.out.println("COM税 鳶壕!");
						
						if(hintCount < 2) {
							saveHint((hintCount + 1) + " : CAPITAL 534621");
						}
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
		System.out.print("更虞壱 社軒研 走研猿?");
		String shout = sc.nextLine();
		effectPrint(shout);
		if (shout.equals(shoutAnswer)) {
			// 号
			effectPrint("???: 嬢? 益軍 鎧左鎧醤畏浦...");
			effectPrint("苦稽元(亀嬢喰 伸軒澗 社軒)");
			effectPrint("備窮殖漁, 号纏窒 失因");
			ingEscape = false;
		} else {
			effectPrint("馬走幻 焼巷 析亀 析嬢蟹走 省澗陥.");
		}
	}

	public static void checkItem() {
		effectPrint("... ...");
		effectPrint("硲爽袴艦研 及閃沙陥...");
		if (item.equals(" ")) {
			effectPrint("硲爽袴艦亜 砥 搾醸陥..");
		} else {
			effectPrint(item + "聖 亜走壱 赤陥.");
		}

	}

	public static void openDoorLock() {
		Scanner sc = new Scanner(System.in);
		effectPrint("亀嬢喰 朕獄研 臣鍵陥.");
		effectPrint("搾腔腰硲研 脊径廃陥.");
		System.out.print("搾腔腰硲 脊径> ");
		String inputPassword = sc.next();
		sc.nextLine();
		if (inputPassword.equals(password)) {
			effectPrint("苦軒軒元");
			effectPrint("亀嬢喰戚 伸鍵陥.");
			effectPrint("号 庚聖 毘億 伸嬢船微陥..!");
			effectPrint("球巨嬢... 纏窒昔亜...!!");
			effectPrint("... ...");
			effectPrint("馬走幻 伸鍵 庚 格袴稽 左戚澗 依精 暁陥献 腔二吉 号戚醸陥...");
			effectPrint("1腰 号 纏窒 失因");
			effectPrint("<To be continue...>");
			ingEscape = false;

		} else {
			effectPrint("止!!止!!止!!止!!");
			countDoorLock--;
			if (countDoorLock <= 0) {
				effectPrint("亀嬢喰税 穿据戚 襖増艦陥. 号拭辞 慎据備 匙閃蟹哀 呪 蒸柔艦陥.");
				effectPrint("Game Over...");
				ingEscape = false;
			}
			effectPrint("搾腔 腰硲研 堂携柔艦陥. (害精 判呪 : " + countDoorLock + " )");
			if (countDoorLock == 2) {
				effectPrint("害精 判呪亜 赤澗 闇亜...? 重掻背醤畏浦...");
			}
		}

	}

	public static void intro() {
		effectPrint("昔闘稽");
		effectPrint("==========");
		effectPrint("袴軒亜 走廻暗鍵陥..");
		effectPrint("食奄亜 嬢巨走..?");
		effectPrint("勧聖 彊左艦 蓋識 号戚陥.");
		effectPrint("但庚 馬蟹 蒸澗 号拭 祢献 莫韻去 災笹戚 走送暗鍵陥..");
		effectPrint("鎧亜 訊 戚訓 員拭 赤澗暗走...?");
		effectPrint("嬢薦 綬聖 原獣陥 琶硯戚 快延 板稽 奄常戚 蟹霜 省澗陥...");
		effectPrint("... ...");
		effectPrint("庚戚 左昔陥.");
		effectPrint("庚壱軒研 宜形左紹生蟹 蝕獣蟹 伸軒走 省澗陥.");
		effectPrint("亀嬢喰戚 含形赤陥...");
		effectPrint("搾腔腰硲研 脊径背醤 蟹哀 呪 赤澗 闇亜...?");
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
			effectPrint("走榎猿走 乞精 微闘級...");
			for (int i = 0; i < hintCount; i++) {
				effectPrint(hints[i]);
				System.out.println();
			}
		} else {
			effectPrint("走榎猿走 条精 微闘亜 蒸陥.");
		}
	}

	public static void effectPrint(String tempStr) {
		try {
			for (int i = 0; i < tempStr.length(); i++) {
				System.out.print(tempStr.charAt(i));
				Thread.sleep(20);
			}
			Thread.sleep(400);
			System.out.println();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void effectPrintFast(String tempStr) {
		try {
			for (int i = 0; i < tempStr.length(); i++) {
				System.out.print(tempStr.charAt(i));
				Thread.sleep(10);
			}
			Thread.sleep(10);
			System.out.println();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String item = " ";
	public static String password = "KHJAVA";
	public static String shoutAnswer = "焼 舛源 焼漢廃 号戚陥!!!";
	public static int countDoorLock = 3;
	String tempStr = " ";
	public static boolean ingEscape = true;
	public static String[] hints = new String[2];
	public static int hintCount = 0;
}
