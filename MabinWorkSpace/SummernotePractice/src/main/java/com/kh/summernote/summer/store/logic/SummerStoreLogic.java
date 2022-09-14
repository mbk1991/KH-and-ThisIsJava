package com.kh.summernote.summer.store.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kh.summernote.summer.domain.TestTable;
import com.kh.summernote.summer.store.SummerStore;


@Repository
public class SummerStoreLogic implements SummerStore {

	@Override
	public int insertBoard(TestTable table, SqlSession session) {
		int result = session.insert("SummerMapper.insertBoard", table);
		return result;
	}

}
