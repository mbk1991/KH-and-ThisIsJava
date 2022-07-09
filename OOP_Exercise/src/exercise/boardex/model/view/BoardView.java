package exercise.boardex.model.view;

import java.util.ArrayList;
import java.util.Scanner;

import exercise.board.model.vo.Board;

public class BoardView {
	Board board = null;
	
	public void boardList(ArrayList<Board> bList) {
		System.out.println("번호 | 작성자 |\t\t\t제목\t\t\t|");
		System.out.println("--------------------------------------------------------------");
		if(bList ==null) {
			System.out.println("게시글이 없습니다.\n");
		}else {
			for(int i = 0; i<bList.size(); i++) {
				System.out.println(bList.get(i).toString());
			}
		}
		System.out.println("--------------------------------------------------------------");
		
	}
	public char mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.글쓰기");
		System.out.println("2.글 읽기");
		System.out.println("3.정렬하기");
		System.out.println("4.save");
		System.out.println("5.load");
		System.out.println("0.종료");
		return sc.next().charAt(0);
	}
	public Board write() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====글 작성=====");
		System.out.println("작성자 닉네임 > ");
		String writer = sc.nextLine();
		System.out.println("글 제목 > ");
		String title = sc.nextLine();
		System.out.println("글 내용 > ");
		String content = sc.nextLine();
		return new Board(writer,title,content);
		
	}
	public void oneView(Board board) {
		System.out.print("no " + board.getNo());
		System.out.print("제목 : ");
		System.out.println(board.getTitle());
		System.out.print("내용 > ");
		System.out.println(board.getContent());
	}
	public int searchWritingByNo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 글 번호 > ");
		return sc.nextInt() -1;
		
	}
}
