package com.kh.springmvc.board.service;

import java.util.List;

import com.kh.springmvc.board.domain.Board;

public interface BoardService {
	public List<Board> printBoardList(int limit, int offset);
	public int countAllPost();
	public int registPost(Board board);
	
}
