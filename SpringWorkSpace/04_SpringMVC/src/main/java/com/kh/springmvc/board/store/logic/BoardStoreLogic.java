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
	public int insertBoard(SqlSession session, Board board) {
		int result = session.insert("BoardMapper.insertBoard", board);
		return result;
	}

	@Override
	public List<Board> selectAllBoard(SqlSession session,int currentPage,int limit) {
		//offset은 currentPage에 의해서 변경되는 값
		//limit는 한 페이지당 보여주고 싶은 게시물의 개수
		int offset = (currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<Board> bList =session.selectList("BoardMapper.selectAllBoard",null,rowBounds);
//		System.out.println(bList.get(0).getBoardWriter());
		return bList;
	}

	@Override
	public int selectTotalCount(SqlSession session) {
		int totalCount = session.selectOne("BoardMapper.selectTotalCount");
		return totalCount;
	}

	
}
