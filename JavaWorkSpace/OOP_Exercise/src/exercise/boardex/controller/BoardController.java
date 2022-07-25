package exercise.boardex.controller;

import java.util.ArrayList;

import exercise.board.model.vo.Board;

public class BoardController {
	ArrayList<Board> bList = null;
	public BoardController() {
		bList = new ArrayList<Board>();
	}

	public void boardCreate(Board board) {
		int no = bList.size()+1;
		board.setNo(no);
		bList.add(board);
	}
	public Board boardReadByNo(int no) {
		
		for(int i=0; i < bList.size(); i++) {
			if(bList.get(i).getNo() == no) {
				return bList.get(i);
			}
		}
		return null;
	}
	public void boardUpdate() {}
	public void boardDelete() {}
	
	public ArrayList<Board> getBList(){
		return bList;
	}
}
