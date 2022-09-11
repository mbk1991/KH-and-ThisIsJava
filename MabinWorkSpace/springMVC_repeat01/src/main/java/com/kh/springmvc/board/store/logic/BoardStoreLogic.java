package com.kh.springmvc.board.store.logic;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kh.springmvc.board.domain.Board;
import com.kh.springmvc.board.store.BoardStore;

@Repository
public class BoardStoreLogic implements BoardStore {

	@Override
	public List<Board> selectAllBoardList(SqlSession session,int limit, int offset) {
		RowBounds rowBounds = new RowBounds(offset, limit);
//		List<Board> bList = session.selectList("BoardMapper.selectAllBoard");
		List<Board> bList = session.selectList("BoardMapper.selectAllBoard", null, rowBounds);
		return bList;
	}

	@Override
	public int selectCountAllPost(SqlSession session) {
		int countAllPost = session.selectOne("BoardMapper.selectCountPost");
		return countAllPost;
	}

}
