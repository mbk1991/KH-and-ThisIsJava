package exercise.boardex.run;

import java.util.ArrayList;

import exercise.board.model.vo.Board;
import exercise.boardex.controller.BoardController;
import exercise.boardex.model.view.BoardView;

public class Run {
	// CRUD Create, Read, Update, Delete ���� ��ȸ ���� ���� ����� �ϴ� ���� �Խ��� �����
	public static void main(String[] args) {
		BoardView bView = new BoardView();
		BoardController bController = new BoardController();
		ArrayList<Board> bList = null;

		Exit: while (true) {
			bView.boardList(bController.getBList());
			quitMenu: while (true) {
				switch (bView.mainMenu()) {
				case '1':
					bController.boardCreate(bView.write());
					System.out.println("�Խñ� ���� ����");
					break quitMenu;
				case '2':
					break quitMenu;
				case '3':
					break quitMenu;
				case '4':
					break quitMenu;
				case '5':
					break quitMenu;
				case '0':
					break Exit;
				}
			}
		}
	}
}
