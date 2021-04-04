package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
	static SqlSessionFactory sqlSessionFactory;
	static {
		String resource = "com/config/mybatis-config.xml";
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
	   sqlSessionFactory =
		new SqlSessionFactoryBuilder().build(inputStream);
	}//end static
	
	// 임의의 클래스에서  MySqlSessionFactory.getSession() 호출해서 SqlSession 리턴받아서 사용하게 된다.
	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}
}