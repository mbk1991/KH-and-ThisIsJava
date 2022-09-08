package com.kh.springmvc.board.service.logic;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.springmvc.board.domain.Board;
import com.kh.springmvc.board.service.BoardService;
import com.kh.springmvc.board.store.BoardStore;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardStore bStore;
	@Autowired
	private SqlSessionTemplate session;

	@Override
	public int registerBoard(Board board) {
		int result = bStore.insertBoard(session, board);
		return result;
	}

	@Override
	public List<Board> printAllBoard() {
		List<Board> bList = bStore.selectAllBoard(session);
		return bList;
	}

	@Override
	public int getTotalCount() {
		int result = bStore.selectTotalCount(session);
		return result;
	}

}