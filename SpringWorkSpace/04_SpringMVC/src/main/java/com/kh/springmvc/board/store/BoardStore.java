package com.kh.springmvc.board.store;

import org.apache.ibatis.session.SqlSession;

import com.kh.springmvc.board.domain.Board;

public interface BoardStore {
	public int insertBoard(SqlSession session, Board board);
}
