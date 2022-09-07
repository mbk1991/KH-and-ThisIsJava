package com.kh.springmvc.board.store.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kh.springmvc.board.domain.Board;
import com.kh.springmvc.board.store.BoardStore;

@Repository
public class BoardStoreLogic implements BoardStore {

	@Override
	public int insertBoard(SqlSession session, Board board) {
		int result = session.insert("BoardMapper.insertBoard", board);
		return result;
	}

}
