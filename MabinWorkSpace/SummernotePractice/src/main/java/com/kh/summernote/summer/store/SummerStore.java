package com.kh.summernote.summer.store;

import org.apache.ibatis.session.SqlSession;

import com.kh.summernote.summer.domain.TestTable;

public interface SummerStore {
	public int insertBoard(TestTable table,SqlSession session);
}
