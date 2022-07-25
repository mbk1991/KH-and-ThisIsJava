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

			System.out.println("==========∏ﬁ¥∫==========");

			System.out.println("1.ø¿∂ÙΩ« ¿‘¿Â«œ±‚");

			System.out.println("2.∞‘¿” Ω√¿€«œ±‚");

			System.out.println("3.ªÛ«∞ ±≥»Ø«œ±‚");

			System.out.println("4.ø¿∂ÙΩ« ≈¿Â«œ±‚");

			System.out.println("5.≥ª ¡§∫∏");

			System.out.println();

			System.out.println("¿‘¿Â ∏’¿˙ «ÿ¡÷ººø‰~ :)");

			System.out.println("=======================");

			System.out.print("[º±≈√]");

			System.out.println();



			int menu = sc.nextInt();



			switch (menu) {



			case 1:

				if (money > 0) {

					System.out.println("¿ÃπÃ ø¿∂ÙΩ«ø° ¿‘¿Â «ﬂΩ¿¥œ¥Ÿ.");

					break;

				}

				System.out.println();

				System.out.println("========ø¿∂ÙΩ«ø° ¿‘¿Â «ﬂΩ¿¥œ¥Ÿ.========");

				System.out.print("¿Ã∏ß¿ª ¿‘∑¬«ÿ¡÷ººø‰ : ");

				name = sc.next();

				while (true) {

					System.out.println("10ƒ⁄¿Œø° 1000ø¯ ¿‘¥œ¥Ÿ. æÛ∏∂∏¶ √Ê¿¸«œ∞⁄Ω¿¥œ±Ó? ");

					System.out.println("(1000ø¯ ¥‹¿ß∑Œ √Ê¿¸«ÿ ¡÷ººø‰)");

					System.out.println("(√Ê¿¸¿∫ «—π¯∏∏ µÀ¥œ¥Ÿ.)");

					System.out.print(">>");

					money = sc.nextInt();

					if (money < 2000) {

						System.out.println();

						System.out.println("2000ø¯ ¿ÃªÛ √Ê¿¸«ÿ¡÷ººø‰");

						System.out.println();

					} else {

						coin = money / 100;

						System.out.println(coin + "ƒ⁄¿Œ √Ê¿¸ µ«æ˙Ω¿¥œ¥Ÿ.");

						break;

					}

				}



				break;



			case 2:

				if (name.equals("")) {

					System.out.println("ø¿∂ÙΩ« ¿‘¿Â ∏’¿˙ «ÿ¡÷ººø‰.");

					break;

				}

				System.out.println();

				System.out.println("=========∞‘¿”¿ª º±≈√«œººø‰=========");

				System.out.println("1. µø¿¸(æ’/µ⁄) ∏¬√ﬂ±‚   [ƒ⁄¿Œ 20∞≥]");

				System.out.println("2. ∞°¿ß! πŸ¿ß! ∫∏!      [ƒ⁄¿Œ 10∞≥]");

				System.out.println();

				System.out.println("**¿Ã±‚∏È ≥Ω ƒ⁄¿Œ¿« 2πË∏¶ æÚΩ¿¥œ¥Ÿ**");

				System.out.println("===================================");

				System.out.println();

				System.out.print("[º±≈√]");



				int game = sc.nextInt();

				switch (game) {

				case 1:

					if (coin < 20) {

						System.out.println("ƒ⁄¿Œ¿Ã ∫Œ¡∑«’¥œ¥Ÿ.");

						break;

					}

					CoinGame();

					break;



				case 2:

					if (coin < 10) {

						System.out.println("ƒ⁄¿Œ¿Ã ∫Œ¡∑«’¥œ¥Ÿ.");

						break;

					}

					RPS_Game();

					break;



				default:

					System.out.println("æ¯¥¬ ∞‘¿”¿‘¥œ¥Ÿ.");

					break;

				}

				break;



			case 3:

				if (name.equals("")) {

					System.out.println("ø¿∂ÙΩ« ¿‘¿Â ∏’¿˙ «ÿ¡÷ººø‰.");

					break;

				}



				System.out.println();

				System.out.println("==========ªÛ«∞ ±≥»Ø==========");

				System.out.println("1.∞ı¿Œ«¸[ƒ⁄¿Œ 30∞≥]");

				System.out.println("2.¿€¿∫ ¿Œ«¸[ƒ⁄¿Œ10∞≥] ");

				System.out.println("3.≈∞∏µ[ƒ⁄¿Œ5∞≥]");

				System.out.println("=============================");

				System.out.println();

				System.out.print("[º±≈√]");



				int num = sc.nextInt();

				switch (num) {

				case 1:

					if (coin < 30) {

						System.out.println("ƒ⁄¿Œ¿Ã ∫Œ¡∑«’¥œ¥Ÿ.");

						break;

					}

					gift = " ∞ı¿Œ«¸ ";

					coin -= 30;

					System.out.println(gift + "¿∏∑Œ ±≥»Ø«œø¥Ω¿¥œ¥Ÿ.");

					break;

				case 2:

					if (coin < 10) {

						System.out.println("ƒ⁄¿Œ¿Ã ∫Œ¡∑«’¥œ¥Ÿ.");

						break;

					}

					gift = " ¿€¿∫¿Œ«¸ ";

					coin -= 10;

					System.out.println(gift + "¿∏∑Œ ±≥»Ø«œø¥Ω¿¥œ¥Ÿ.");

					break;

				case 3:

					if (coin < 5) {

						System.out.println("ƒ⁄¿Œ¿Ã ∫Œ¡∑«’¥œ¥Ÿ.");

						break;

					}

					gift = " ≈∞∏µ ";

					coin -= 5;

					System.out.println(gift + "¿∏∑Œ ±≥»Ø«œø¥Ω¿¥œ¥Ÿ.");

					break;



				default:

					System.out.println("æ¯¥¬ ªÛ«∞¿‘¥œ¥Ÿ.");

					break;



				}

				if (num > 0 && num < 4) {

					present[num - 1] = gift;

				}



				break;



			case 4:



				System.out.println("¿ﬂ∞°ø‰~~");



				break end;



			case 5:

				if (name.equals("")) {

					System.out.println("ø¿∂ÙΩ« ¿‘¿Â ∏’¿˙ «ÿ¡÷ººø‰.");

					break;

				}

				System.out.println();

				System.out.println("==========≥ª ¡§∫∏==========");

				System.out.println("¿Ã∏ß :" + name);

				System.out.println("∫∏¿Ø ƒ⁄¿Œ : " + coin + "∞≥");

				System.out.println("∫∏¿Ø ªÛ«∞ : " + present[0] + present[1] + present[2]);

				break;



			default:

				System.out.println("∏ﬁ¥∫ø° ¿÷¥¬ π¯»£∏∏ ¥©∏£ººø‰");

				break;



			}

		}

	}



	static void CoinGame() {

		coin -= 20;

		System.out.println("========µø¿¸ ∏¬√ﬂ±‚ ∞‘¿”========");

		System.out.println("º˝¿⁄∏¶ ¿‘∑¬«ÿ¡÷ººø‰(1.æ’∏È/2.µﬁ∏È)");

		System.out.print(">>>");

		int coinGame = sc.nextInt();

		int coinComputer = r.nextInt(2) + 1;

		switch (coinComputer) {

		case 1:

			System.out.println("ƒƒ«ª≈Õ¥¬ æ’∏È¿Ã ≥™ø‘Ω¿¥œ¥Ÿ.");

			break;

		case 2:

			System.out.println("ƒƒ«ª≈Õ¥¬ µﬁ∏È¿Ã ≥™ø‘Ω¿¥œ¥Ÿ.");

			break;



		}

		if (coinGame == coinComputer) {

			System.out.println("∏¬ÆuΩ¿¥œ¥Ÿ!! ƒ⁄¿Œ 2πË∏¶ »πµÊ«œø¥Ω¿¥œ¥Ÿ.");

			coin += 40;

		} else {

			System.out.println("∆≤∑»Ω¿¥œ¥Ÿ.. ƒ⁄¿Œ 20∞≥∏¶ ¿“æ˙Ω¿¥œ¥Ÿ.");

		}



	}



	static void RPS_Game() {

		coin -= 10;

		String com = "";

		String win = "";

		System.out.println("===========∞°¿ß! πŸ¿ß! ∫∏!==========");

		end: while (true) {

			System.out.println("º˝¿⁄∏¶ ¿‘∑¬«ÿ¡÷ººø‰ (1.∞°¿ß / 2.πŸ¿ß / 3.∫∏)");

			System.out.print(">>>");

			System.out.println();

			int me = sc.nextInt();

			int computer = r.nextInt(2) + 1;

			if (me == computer) {

				System.out.println("∫Ò∞ÂΩ¿¥œ¥Ÿ. ¥ŸΩ√«“≤≤ø‰");

				System.out.println();



			} else {

				switch (me) {

				case 1:

					if (computer == 3) {

						win = "¿Ã∞Â";

					} else if (computer == 2) {

						win = "¡≥";

					}

					break;

				case 2:

					if (computer == 1) {

						win = "¿Ã∞Â";

					} else if (computer == 3) {

						win = "¡≥";

					}

					break;

				case 3:

					if (computer == 2) {

						win = "¿Ã∞Â";

					} else if (computer == 1) {

						win = "¡≥";

					}

					break;

				}



				switch (computer) {

				case 1:

					com = "∞°¿ß";

					break;

				case 2:

					com = "πŸ¿ß";

					break;

				case 3:

					com = "∫∏";

					break;

				}

				System.out.println("ƒƒ«ª≈Õ¥¬ " + com + "∏¶ ≥¬Ω¿¥œ¥Ÿ.");

				System.out.println(win + "Ω¿¥œ¥Ÿ.");

				if (win.equals("¿Ã∞Â")) {

					System.out.println();

					System.out.println("√‡«œ«’¥œ¥Ÿ! ƒ⁄¿Œ 2πË∏¶ »πµÊ«œø¥Ω¿¥œ¥Ÿ.");

					coin += 20;

					break end;

				} else {

					System.out.println();

					System.out.println("ƒ⁄¿Œ 10∞≥∏¶ ¿“æ˙Ω¿¥œ¥Ÿ.");

					break end;

				}

			}

		}



	}

}

