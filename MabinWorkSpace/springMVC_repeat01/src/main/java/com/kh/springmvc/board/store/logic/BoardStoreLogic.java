package com.kh.springmvc.board.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kh.springmvc.board.domain.Board;
import com.kh.springmvc.board.store.BoardStore;

@Repository
public class BoardStoreLogic implements BoardStore {

	@Override
	public List<Board> selectAllBoardList(SqlSession session) {
		List<Board> bList = session.selectList("BoardMapper.selectAllBoard");
		return bList;
	}

}
