package com.service;

import java.util.List;

import com.dto.Dept;

public interface DBService {

	public abstract List<Dept> list();
	public abstract int insert(Dept dto);
	public abstract int delete(int deptno);
	public abstract int update(Dept dto);
}
