package com.kh.junspring.board.service;

import java.util.List;

import com.kh.junspring.board.domain.Board;

public interface BoardService {
	// registerBoard
	// BOARD_TBL <- INSERT INTO BOARD_TBL VALUES(~~~~
	public int registerBoard(Board board);
	// printAllBoard
	// BOARD_TBL <- SELECT * FROM BOARD_TBL WHERE B_STATUS = 'Y'
	public List<Board> printAllBoard(int currentPage, int limit);
	// getTotalCount 
	// BOARD_TBL <- SELECT COUNT(*) FROM BOARD_TBL WHERE B_STATUS = 'Y'
	public int getTotalCount();
}
