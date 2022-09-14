package com.kh.junspring.board.store.logic;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kh.junspring.board.domain.Board;
import com.kh.junspring.board.store.BoardStore;

@Repository
public class BoardStoreLogic implements BoardStore{

	@Override
	public int insertBoard(SqlSession session, Board board) {
		int result = session.insert("BoardMapper.insertBoard", board);
		return result;
	}

	@Override
	public List<Board> selectAllBoard(SqlSession session, int currentPage, int limit) {
		// RowBounds란 쿼리문을 변경하지 않고도 페이징을 처리할 수 있게 해주는 클래스이며
		// offset과 limit값을 이용해서 동작함. offset은 currentPage에 의해서 변하는 값이고
		// limit값은 고정값이다.
		// offset은 currentPage에 의해서 변경되는 값
		// 1 -> 1, 2 -> 11, 3 -> 21
		// offset 0, offset 10, offset 20
		// limit는 한 페이지당 보여주고 싶은 게시물의 갯수
		// 10
		int offset = (currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<Board> bList = session.selectList("BoardMapper.selectAllBoard", null, rowBounds);
		return bList;
	}

	@Override
	public int selectTotalCount(SqlSession session,String searchCondition,String searchValue) {
		
		HashMap<String,String> paramMap = new HashMap<>();
		paramMap.put("searchCondition",searchCondition);
		paramMap.put("searchValue",searchValue);
		int totalCount = session.selectOne("BoardMapper.selectTotalCount",paramMap);
		return totalCount;
	}

	@Override
	public Board selectOneByNo(SqlSession session,int boardNo) {
		Board board = session.selectOne("BoardMapper.selectOneByNo", boardNo);
		return board;
	}

	@Override
	public int deleteOneByNo(SqlSession session, int boardNo) {
		int result = session.delete("BoardMapper.deleteOneByNo", boardNo);
		return result;
	}

	@Override
	public int updateBoard(SqlSession session, Board board) {
		int result = session.update("BoardMapper.updateBoard", board);
		return 0;
	}

	@Override
	public List<Board> printAllByValue(SqlSession session,int currentPage,int limit, String searchCondition, String searchValue) {
		
		int offset = (currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		HashMap<String,String> paramMap = new HashMap<>();
		paramMap.put("searchCondition",searchCondition);
		paramMap.put("searchValue",searchValue);
		List<Board> bList = session.selectList("BoardMapper.selectAllByValue", paramMap,rowBounds);
		return bList;
	}

}
