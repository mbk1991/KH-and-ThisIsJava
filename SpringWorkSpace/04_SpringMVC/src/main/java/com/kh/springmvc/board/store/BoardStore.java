package com.kh.springmvc.board.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.springmvc.board.domain.Board;

public interface BoardStore {
	public int insertBoard(SqlSession session, Board board);
	public List<Board> selectAllBoard(SqlSession session ,int currentPage,int limit);
	public int selectTotalCount(SqlSession session);
}
