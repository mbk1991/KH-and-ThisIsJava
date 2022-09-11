package com.kh.springmvc.board.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.springmvc.board.domain.Board;

public interface BoardStore {
	public List<Board> selectAllBoardList(SqlSession session,int limit, int offset);
	public int selectCountAllPost(SqlSession session);
	public int insertPost(SqlSession session, Board board);
}
