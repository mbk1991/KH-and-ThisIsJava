package com.kh.springmvc.board.service;

import java.util.List;

import com.kh.springmvc.board.domain.Board;

public interface BoardService {
	public int registerBoard(Board board);
	public List<Board> printAllBoard();
	//페이징처리
	//getTotalCount
	// SELECT COUNT(*) FROM BOARD_TBL WHERE B_STATUS='Y'
	public int getTotalCount();
}
