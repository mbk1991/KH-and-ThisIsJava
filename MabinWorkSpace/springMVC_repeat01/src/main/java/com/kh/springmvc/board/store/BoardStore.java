package com.kh.springmvc.board.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.springmvc.board.domain.Board;

public interface BoardStore {
	public List<Board> selectAllBoardList(SqlSession session);
}
