package com.kh.junspring.board.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.junspring.board.domain.Board;
import com.kh.junspring.board.domain.Reply;

public interface BoardStore {
	// insertBoard
	public int insertBoard(SqlSession session, Board board);
	// selectAllBoard
	public List<Board> selectAllBoard(SqlSession session, int currentPage, int limit);
	public int selectTotalCount(SqlSession session,String searchCondition,String searchValue);
	public Board selectOneByNo(SqlSession session,int boardNo);
	public int deleteOneByNo(SqlSession session, int boardNo);
	public int updateBoard(SqlSession session,Board board);
	public List<Board> printAllByValue(SqlSession session,int currentPage,int boardLimit, String searchCondition, String searchValue);

	public int updateBoardCount(SqlSession session,int boardNo);
	public int insertReply(SqlSession session, Reply reply);
	public List<Reply> selectAllReplyByNo(SqlSession session, int boardNo);
}
