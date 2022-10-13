package com.kh.junspring.board.service;

import java.util.List;

import com.kh.junspring.board.domain.Board;
import com.kh.junspring.board.domain.Reply;

public interface BoardService {
	// registerBoard
	// BOARD_TBL <- INSERT INTO BOARD_TBL VALUES(~~~~
	public int registerBoard(Board board);
	// printAllBoard
	// BOARD_TBL <- SELECT * FROM BOARD_TBL WHERE B_STATUS = 'Y'
	public List<Board> printAllBoard(int currentPage, int limit);
	// getTotalCount 
	// BOARD_TBL <- SELECT COUNT(*) FROM BOARD_TBL WHERE B_STATUS = 'Y'
	public int getTotalCount(String searchCondition,String searchValue);
	//printOneByNo
	//BOARD_TBL <- SELECT * FROM BOARD_TBL WHERE BOARD_NO = 11
	public Board printOneByNo(int boardNo);
	//removeOneByNo
	//BOARD_TBL <- DELETE FROM BOARD_TBL WHERE BOARD_NO = 22
	public int removeOneByNo(int boardNo);
	//modifyBoard
	//BOARD_TBL <- UPDATE BOARD_TBL SET BOARD_TITLE ="33", BOARD_CONTENTS="33" WHERE BOARD_NO='3'
	public int modifyBoard(Board board);
	
	public List<Board> printAllByValue(int currentPage, int boardLimit, String searchCondition, String searchValue);
	
	public int modifyBoardCount(int boardNo);
	
	public int registerReply(Reply reply);
	
	public List<Reply> printAllReplyByNo(int boardNo);
	
	public int modifyReply (Reply reply);
	
	public int removeReply (int replyNo);
	
}
