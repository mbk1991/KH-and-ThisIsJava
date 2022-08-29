package com.kh.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {
	
	public static SqlSession getSqlSession() {
		SqlSession session = null;
		String resource = "mybatis-config.xml";
		
		try {
			//resource 경로 inputStream객체 생성
			InputStream is = Resources.getResourceAsStream(resource);
			//builder객체 생성
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder(); // 빌더 생성
			//factory객체 생성 후
			//연결 공장을 만드는 사람(빌더) 가 연결 공장을 만들면
			SqlSessionFactory factory = builder.build(is);
			//연결 공장을 통해 연결(세션)을 만들 수 있다.
			session = factory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return session;  // 반드시 리턴 session;
	}
}
