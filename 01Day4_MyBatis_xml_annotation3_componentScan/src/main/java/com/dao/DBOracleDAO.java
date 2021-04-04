package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dto.Dept;

@Repository("oracle")
public class DBOracleDAO implements DBDao {

	@Override
	public List<Dept> list(SqlSessionTemplate session) {
		return session.selectList("DeptMapper.selectAll");
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
