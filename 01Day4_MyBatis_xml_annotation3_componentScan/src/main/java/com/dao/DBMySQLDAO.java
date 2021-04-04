package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dto.Dept;

@Repository("mysql")
public class DBMySQLDAO implements DBDao {

	@Override
	public List<Dept> list(SqlSessionTemplate session) {
		return session.selectList("DeptMapper.selectAll2");
	}

	@Override
	public int insert(SqlSessionTemplate session, Dept dto) {
		return session.insert("DeptMapper.insert",dto);
	}

	@Override
	public int deleteByDeptno(SqlSessionTemplate session, int deptno) {
		return session.delete("DeptMapper.deleteByDeptno", deptno);
	}

	@Override
	public int update(SqlSessionTemplate session, Dept dto) {
		return session.update("DeptMapper.update", dto);
	}
	

}
