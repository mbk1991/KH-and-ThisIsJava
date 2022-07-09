package exercise.boardex.model.view;

import java.util.ArrayList;
import java.util.Scanner;

import exercise.board.model.vo.Board;

public class BoardView {
	Board board = null;
	
	public void boardList(ArrayList<Board> bList) {
		System.out.println("��ȣ | �ۼ��� |\t\t\t����\t\t\t|");
		System.out.println("--------------------------------------------------------------");
		if(bList ==null) {
			System.out.println("�Խñ��� �����ϴ�.\n");
		}else {
			for(int i = 0; i<bList.size(); i++) {
				System.out.println(bList.get(i).toString());
			}
		}
		System.out.println("--------------------------------------------------------------");
		
	}
	public char mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�۾���");
		System.out.println("2.�� �б�");
		System.out.println("3.�����ϱ�");
		System.out.println("4.save");
		System.out.println("5.load");
		System.out.println("0.����");
		return sc.next().charAt(0);
	}
	public Board write() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====�� �ۼ�=====");
		System.out.println("�ۼ��� �г��� > ");
		String writer = sc.nextLine();
		System.out.println("�� ���� > ");
		String title = sc.nextLine();
		System.out.println("�� ���� > ");
		String content = sc.nextLine();
		return new Board(writer,title,content);
		
	}
	public void oneView(Board board) {
		System.out.print("no " + board.getNo());
		System.out.print("���� : ");
		System.out.println(board.getTitle());
		System.out.print("���� > ");
		System.out.println(board.getContent());
	}
	public int searchWritingByNo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �� ��ȣ > ");
		return sc.nextInt() -1;
		
	}
}
