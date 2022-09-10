package com.kh.junspring.board.service.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.junspring.board.domain.Board;
import com.kh.junspring.board.service.BoardService;
import com.kh.junspring.board.store.BoardStore;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private SqlSession session;
	@Autowired
	private BoardStore bStore;
	@Override
	public int registerBoard(Board board) {
		int result = bStore.insertBoard(session, board);
		return result;
	}
	@Override
	public List<Board> printAllBoard(int currentPage, int limit) {
		List<Board> bList = bStore.selectAllBoard(session, currentPage, limit);
		return bList;
	}
	@Override
	public int getTotalCount() {
		int totalCount = bStore.selectTotalCount(session);
		return totalCount;
	}

}
