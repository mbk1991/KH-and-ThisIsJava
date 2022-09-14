package com.kh.summernote.summer.service.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.summernote.summer.domain.TestTable;
import com.kh.summernote.summer.service.SummerService;
import com.kh.summernote.summer.store.SummerStore;


@Service
public class SummerServiceImpl implements SummerService {
	
	@Autowired
	SummerStore sStore;
	@Autowired
	SqlSession session;

	@Override
	public int registerBoard(TestTable table) {
		int result = sStore.insertBoard(table, session); 
		return result;
	}

}
