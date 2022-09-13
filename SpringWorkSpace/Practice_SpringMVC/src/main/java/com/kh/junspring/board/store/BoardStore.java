package com.kh.junspring.board.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.junspring.board.domain.Board;

public interface BoardStore {
	// insertBoard
	public int insertBoard(SqlSession session, Board board);
	// selectAllBoard
	public List<Board> selectAllBoard(SqlSession session, int currentPage, int limit);
	public int selectTotalCount(SqlSession session);
	public Board selectOneByNo(SqlSession session,int boardNo);
	public int deleteOneByNo(SqlSession session, int boardNo);

}
