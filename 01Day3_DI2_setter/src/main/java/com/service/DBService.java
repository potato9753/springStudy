package com.service;

public class DBService {

	//변수, 프라퍼티(property)
	public String name;

	public DBService() {
		System.out.println("DBService 생성자");
	}

	public String getName() {
		return name;
	}

	//setter-based injection
	public void setName(String name) {
		System.out.println("setName 메서드");
		this.name = name;
	}
	
}
