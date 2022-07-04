package test.test.test;



import java.util.Random;

import java.util.Scanner;



public class OthersHomework {

	static String name = "";

	static int money = 0;

	static int coin = 0;



	static Random r = new Random();

	static Scanner sc = new Scanner(System.in);



	public static void main(String[] args) {



		String[] present = new String[3];

		String gift = "";

		for (int i = 0; i < 3; i++) {

			present[i] = "";

		}



		end: while (true) {

			System.out.println();

			System.out.println("==========메뉴==========");

			System.out.println("1.오락실 입장하기");

			System.out.println("2.게임 시작하기");

			System.out.println("3.상품 교환하기");

			System.out.println("4.오락실 퇴장하기");

			System.out.println("5.내 정보");

			System.out.println();

			System.out.println("입장 먼저 해주세요~ :)");

			System.out.println("=======================");

			System.out.print("[선택]");

			System.out.println();



			int menu = sc.nextInt();



			switch (menu) {



			case 1:

				if (money > 0) {

					System.out.println("이미 오락실에 입장 했습니다.");

					break;

				}

				System.out.println();

				System.out.println("========오락실에 입장 했습니다.========");

				System.out.print("이름을 입력해주세요 : ");

				name = sc.next();

				while (true) {

					System.out.println("10코인에 1000원 입니다. 얼마를 충전하겠습니까? ");

					System.out.println("(1000원 단위로 충전해 주세요)");

					System.out.println("(충전은 한번만 됩니다.)");

					System.out.print(">>");

					money = sc.nextInt();

					if (money < 2000) {

						System.out.println();

						System.out.println("2000원 이상 충전해주세요");

						System.out.println();

					} else {

						coin = money / 100;

						System.out.println(coin + "코인 충전 되었습니다.");

						break;

					}

				}



				break;



			case 2:

				if (name.equals("")) {

					System.out.println("오락실 입장 먼저 해주세요.");

					break;

				}

				System.out.println();

				System.out.println("=========게임을 선택하세요=========");

				System.out.println("1. 동전(앞/뒤) 맞추기   [코인 20개]");

				System.out.println("2. 가위! 바위! 보!      [코인 10개]");

				System.out.println();

				System.out.println("**이기면 낸 코인의 2배를 얻습니다**");

				System.out.println("===================================");

				System.out.println();

				System.out.print("[선택]");



				int game = sc.nextInt();

				switch (game) {

				case 1:

					if (coin < 20) {

						System.out.println("코인이 부족합니다.");

						break;

					}

					CoinGame();

					break;



				case 2:

					if (coin < 10) {

						System.out.println("코인이 부족합니다.");

						break;

					}

					RPS_Game();

					break;



				default:

					System.out.println("없는 게임입니다.");

					break;

				}

				break;



			case 3:

				if (name.equals("")) {

					System.out.println("오락실 입장 먼저 해주세요.");

					break;

				}



				System.out.println();

				System.out.println("==========상품 교환==========");

				System.out.println("1.곰인형[코인 30개]");

				System.out.println("2.작은 인형[코인10개] ");

				System.out.println("3.키링[코인5개]");

				System.out.println("=============================");

				System.out.println();

				System.out.print("[선택]");



				int num = sc.nextInt();

				switch (num) {

				case 1:

					if (coin < 30) {

						System.out.println("코인이 부족합니다.");

						break;

					}

					gift = " 곰인형 ";

					coin -= 30;

					System.out.println(gift + "으로 교환하였습니다.");

					break;

				case 2:

					if (coin < 10) {

						System.out.println("코인이 부족합니다.");

						break;

					}

					gift = " 작은인형 ";

					coin -= 10;

					System.out.println(gift + "으로 교환하였습니다.");

					break;

				case 3:

					if (coin < 5) {

						System.out.println("코인이 부족합니다.");

						break;

					}

					gift = " 키링 ";

					coin -= 5;

					System.out.println(gift + "으로 교환하였습니다.");

					break;



				default:

					System.out.println("없는 상품입니다.");

					break;



				}

				if (num > 0 && num < 4) {

					present[num - 1] = gift;

				}



				break;



			case 4:



				System.out.println("잘가요~~");



				break end;



			case 5:

				if (name.equals("")) {

					System.out.println("오락실 입장 먼저 해주세요.");

					break;

				}

				System.out.println();

				System.out.println("==========내 정보==========");

				System.out.println("이름 :" + name);

				System.out.println("보유 코인 : " + coin + "개");

				System.out.println("보유 상품 : " + present[0] + present[1] + present[2]);

				break;



			default:

				System.out.println("메뉴에 있는 번호만 누르세요");

				break;



			}

		}

	}



	static void CoinGame() {

		coin -= 20;

		System.out.println("========동전 맞추기 게임========");

		System.out.println("숫자를 입력해주세요(1.앞면/2.뒷면)");

		System.out.print(">>>");

		int coinGame = sc.nextInt();

		int coinComputer = r.nextInt(2) + 1;

		switch (coinComputer) {

		case 1:

			System.out.println("컴퓨터는 앞면이 나왔습니다.");

			break;

		case 2:

			System.out.println("컴퓨터는 뒷면이 나왔습니다.");

			break;



		}

		if (coinGame == coinComputer) {

			System.out.println("맞췼습니다!! 코인 2배를 획득하였습니다.");

			coin += 40;

		} else {

			System.out.println("틀렸습니다.. 코인 20개를 잃었습니다.");

		}



	}



	static void RPS_Game() {

		coin -= 10;

		String com = "";

		String win = "";

		System.out.println("===========가위! 바위! 보!==========");

		end: while (true) {

			System.out.println("숫자를 입력해주세요 (1.가위 / 2.바위 / 3.보)");

			System.out.print(">>>");

			System.out.println();

			int me = sc.nextInt();

			int computer = r.nextInt(2) + 1;

			if (me == computer) {

				System.out.println("비겼습니다. 다시할께요");

				System.out.println();



			} else {

				switch (me) {

				case 1:

					if (computer == 3) {

						win = "이겼";

					} else if (computer == 2) {

						win = "졌";

					}

					break;

				case 2:

					if (computer == 1) {

						win = "이겼";

					} else if (computer == 3) {

						win = "졌";

					}

					break;

				case 3:

					if (computer == 2) {

						win = "이겼";

					} else if (computer == 1) {

						win = "졌";

					}

					break;

				}



				switch (computer) {

				case 1:

					com = "가위";

					break;

				case 2:

					com = "바위";

					break;

				case 3:

					com = "보";

					break;

				}

				System.out.println("컴퓨터는 " + com + "를 냈습니다.");

				System.out.println(win + "습니다.");

				if (win.equals("이겼")) {

					System.out.println();

					System.out.println("축하합니다! 코인 2배를 획득하였습니다.");

					coin += 20;

					break end;

				} else {

					System.out.println();

					System.out.println("코인 10개를 잃었습니다.");

					break end;

				}

			}

		}



	}

}

