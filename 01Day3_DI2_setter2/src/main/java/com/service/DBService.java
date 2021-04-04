package com.service;

import java.util.Arrays;
import java.util.List;

import com.dao.DBDao;

public class DBService {
	
	DBDao dao;

	// setter injection
	public void setDao(DBDao dao) {
		this.dao = dao;
	}


	public List<String> list(){
		return dao.list();
	}

	
}
