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

			System.out.println("==========�޴�==========");

			System.out.println("1.������ �����ϱ�");

			System.out.println("2.���� �����ϱ�");

			System.out.println("3.��ǰ ��ȯ�ϱ�");

			System.out.println("4.������ �����ϱ�");

			System.out.println("5.�� ����");

			System.out.println();

			System.out.println("���� ���� ���ּ���~ :)");

			System.out.println("=======================");

			System.out.print("[����]");

			System.out.println();



			int menu = sc.nextInt();



			switch (menu) {



			case 1:

				if (money > 0) {

					System.out.println("�̹� �����ǿ� ���� �߽��ϴ�.");

					break;

				}

				System.out.println();

				System.out.println("========�����ǿ� ���� �߽��ϴ�.========");

				System.out.print("�̸��� �Է����ּ��� : ");

				name = sc.next();

				while (true) {

					System.out.println("10���ο� 1000�� �Դϴ�. �󸶸� �����ϰڽ��ϱ�? ");

					System.out.println("(1000�� ������ ������ �ּ���)");

					System.out.println("(������ �ѹ��� �˴ϴ�.)");

					System.out.print(">>");

					money = sc.nextInt();

					if (money < 2000) {

						System.out.println();

						System.out.println("2000�� �̻� �������ּ���");

						System.out.println();

					} else {

						coin = money / 100;

						System.out.println(coin + "���� ���� �Ǿ����ϴ�.");

						break;

					}

				}



				break;



			case 2:

				if (name.equals("")) {

					System.out.println("������ ���� ���� ���ּ���.");

					break;

				}

				System.out.println();

				System.out.println("=========������ �����ϼ���=========");

				System.out.println("1. ����(��/��) ���߱�   [���� 20��]");

				System.out.println("2. ����! ����! ��!      [���� 10��]");

				System.out.println();

				System.out.println("**�̱�� �� ������ 2�踦 ����ϴ�**");

				System.out.println("===================================");

				System.out.println();

				System.out.print("[����]");



				int game = sc.nextInt();

				switch (game) {

				case 1:

					if (coin < 20) {

						System.out.println("������ �����մϴ�.");

						break;

					}

					CoinGame();

					break;



				case 2:

					if (coin < 10) {

						System.out.println("������ �����մϴ�.");

						break;

					}

					RPS_Game();

					break;



				default:

					System.out.println("���� �����Դϴ�.");

					break;

				}

				break;



			case 3:

				if (name.equals("")) {

					System.out.println("������ ���� ���� ���ּ���.");

					break;

				}



				System.out.println();

				System.out.println("==========��ǰ ��ȯ==========");

				System.out.println("1.������[���� 30��]");

				System.out.println("2.���� ����[����10��] ");

				System.out.println("3.Ű��[����5��]");

				System.out.println("=============================");

				System.out.println();

				System.out.print("[����]");



				int num = sc.nextInt();

				switch (num) {

				case 1:

					if (coin < 30) {

						System.out.println("������ �����մϴ�.");

						break;

					}

					gift = " ������ ";

					coin -= 30;

					System.out.println(gift + "���� ��ȯ�Ͽ����ϴ�.");

					break;

				case 2:

					if (coin < 10) {

						System.out.println("������ �����մϴ�.");

						break;

					}

					gift = " �������� ";

					coin -= 10;

					System.out.println(gift + "���� ��ȯ�Ͽ����ϴ�.");

					break;

				case 3:

					if (coin < 5) {

						System.out.println("������ �����մϴ�.");

						break;

					}

					gift = " Ű�� ";

					coin -= 5;

					System.out.println(gift + "���� ��ȯ�Ͽ����ϴ�.");

					break;



				default:

					System.out.println("���� ��ǰ�Դϴ�.");

					break;



				}

				if (num > 0 && num < 4) {

					present[num - 1] = gift;

				}



				break;



			case 4:



				System.out.println("�߰���~~");



				break end;



			case 5:

				if (name.equals("")) {

					System.out.println("������ ���� ���� ���ּ���.");

					break;

				}

				System.out.println();

				System.out.println("==========�� ����==========");

				System.out.println("�̸� :" + name);

				System.out.println("���� ���� : " + coin + "��");

				System.out.println("���� ��ǰ : " + present[0] + present[1] + present[2]);

				break;



			default:

				System.out.println("�޴��� �ִ� ��ȣ�� ��������");

				break;



			}

		}

	}



	static void CoinGame() {

		coin -= 20;

		System.out.println("========���� ���߱� ����========");

		System.out.println("���ڸ� �Է����ּ���(1.�ո�/2.�޸�)");

		System.out.print(">>>");

		int coinGame = sc.nextInt();

		int coinComputer = r.nextInt(2) + 1;

		switch (coinComputer) {

		case 1:

			System.out.println("��ǻ�ʹ� �ո��� ���Խ��ϴ�.");

			break;

		case 2:

			System.out.println("��ǻ�ʹ� �޸��� ���Խ��ϴ�.");

			break;



		}

		if (coinGame == coinComputer) {

			System.out.println("�®u���ϴ�!! ���� 2�踦 ȹ���Ͽ����ϴ�.");

			coin += 40;

		} else {

			System.out.println("Ʋ�Ƚ��ϴ�.. ���� 20���� �Ҿ����ϴ�.");

		}



	}



	static void RPS_Game() {

		coin -= 10;

		String com = "";

		String win = "";

		System.out.println("===========����! ����! ��!==========");

		end: while (true) {

			System.out.println("���ڸ� �Է����ּ��� (1.���� / 2.���� / 3.��)");

			System.out.print(">>>");

			System.out.println();

			int me = sc.nextInt();

			int computer = r.nextInt(2) + 1;

			if (me == computer) {

				System.out.println("�����ϴ�. �ٽ��Ҳ���");

				System.out.println();



			} else {

				switch (me) {

				case 1:

					if (computer == 3) {

						win = "�̰�";

					} else if (computer == 2) {

						win = "��";

					}

					break;

				case 2:

					if (computer == 1) {

						win = "�̰�";

					} else if (computer == 3) {

						win = "��";

					}

					break;

				case 3:

					if (computer == 2) {

						win = "�̰�";

					} else if (computer == 1) {

						win = "��";

					}

					break;

				}



				switch (computer) {

				case 1:

					com = "����";

					break;

				case 2:

					com = "����";

					break;

				case 3:

					com = "��";

					break;

				}

				System.out.println("��ǻ�ʹ� " + com + "�� �½��ϴ�.");

				System.out.println(win + "���ϴ�.");

				if (win.equals("�̰�")) {

					System.out.println();

					System.out.println("�����մϴ�! ���� 2�踦 ȹ���Ͽ����ϴ�.");

					coin += 20;

					break end;

				} else {

					System.out.println();

					System.out.println("���� 10���� �Ҿ����ϴ�.");

					break end;

				}

			}

		}



	}

}

