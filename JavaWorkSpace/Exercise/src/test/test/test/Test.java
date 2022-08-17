package test.test.test;

public class Test {
	public static void main(String[] args) {
		
		boolean injo = (1+1+1+1) > 4;
		System.out.println(injo);
		
		
//		animationAct("left");
//		animationAct("middle");
//		animationAct("right");
	}

	public static void animationAct(String choice) {
		String[][] ground = new String[5][5];
//		String choice = ""; // left , right, middle

		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++) {
				ground[i][j] = "  ";
			}
		}

		int temp = 2;
		for (int i = 4; i >= 0; i--) {
			if (i < 2) {
				switch (choice) {
				case "left":
					--temp;
					ground[i][temp] = "¡Û";
					break;
				case "middle":
					ground[i][temp] = "¡Û";
					break;
				case "right":
					++temp;
					ground[i][temp] = "¡Û";
					break;
				}
			} else {
				ground[i][temp] = "¡Û";
			}
		}
//		for (int i = 0; i < 5; i--) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(ground[i][j]);
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i<ground.length; i++) {
			for(int j = 0; j<ground[i].length; j++) {
				
				System.out.print(ground[i][j]);
			}
			System.out.println();
		}
	}
}
