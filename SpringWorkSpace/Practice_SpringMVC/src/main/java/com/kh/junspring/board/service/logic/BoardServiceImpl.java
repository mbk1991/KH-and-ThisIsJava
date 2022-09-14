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
	public int getTotalCount(String searchCondition,String searchValue) {
		int totalCount = bStore.selectTotalCount(session,searchCondition,searchValue);
		return totalCount;
	}
	@Override
	public Board printOneByNo(int boardNo) {
		Board board = bStore.selectOneByNo(session,boardNo);
		return board;
	}
	@Override
	public int removeOneByNo(int boardNo) {
		int result = bStore.deleteOneByNo(session, boardNo);
		return result;
	}
	@Override
	public int modifyBoard(Board board) {
		int result = bStore.updateBoard(session, board);
		return result;
	}
	@Override
	public List<Board> printAllByValue(int currentPage,int boardLimit, String searchCondition, String searchValue) {
		List<Board> bList = bStore.printAllByValue(session,currentPage,boardLimit, searchCondition, searchValue);
		return bList;
	}

}
