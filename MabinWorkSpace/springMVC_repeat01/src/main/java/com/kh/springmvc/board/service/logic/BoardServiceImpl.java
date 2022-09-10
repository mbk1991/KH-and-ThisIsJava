package com.kh.springmvc.board.service.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.springmvc.board.domain.Board;
import com.kh.springmvc.board.service.BoardService;
import com.kh.springmvc.board.store.BoardStore;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private SqlSession session;
	@Autowired
	private BoardStore bStore;

	@Override
	public List<Board> printBoardList() {
		List<Board> bList = bStore.selectAllBoardList(session); 
		return bList;
	}
	
}
