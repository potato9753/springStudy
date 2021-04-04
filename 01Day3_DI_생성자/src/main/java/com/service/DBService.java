package com.service;

public class DBService {

	//변수, 프라퍼티(property)
	public String name;

	public DBService() {
	}

	// 생성자 주입
	public DBService(String x) {
		System.out.println("DBService 생성자~~~~~");
		this.name = x;
	}
	
	
}
