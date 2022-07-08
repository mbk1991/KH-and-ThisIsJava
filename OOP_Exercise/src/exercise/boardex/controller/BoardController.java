package exercise.boardex.controller;

import java.util.ArrayList;

import exercise.board.model.vo.Board;

public class BoardController {
	ArrayList<Board> bList = null;
	public BoardController() {
		bList = new ArrayList<Board>();
	}

	public void boardCreate(Board board) {
		bList.add(board);
	}
	public void boardRead() {}
	public void boardUpdate() {}
	public void boardDelete() {}
	
	public ArrayList<Board> getBList(){
		return bList;
	}
}
