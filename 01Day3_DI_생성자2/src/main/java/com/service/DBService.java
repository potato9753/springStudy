package com.service;

import java.util.Arrays;
import java.util.List;

import com.dao.DBDao;

public class DBService {
	
	DBDao dao;

	//생성자 주입
	public DBService(DBDao dao) {
		this.dao = dao;
	}
	
	public List<String> list(){
		return dao.list();
	}

	
}
