package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.dto.Board;

public interface DBDao {
	
	public abstract List<Board> boardList(SqlSessionTemplate session);
	public abstract Board selectByNum(SqlSessionTemplate session, int no);
	public abstract int boardWrite(SqlSessionTemplate session, Board notice);
	public abstract int boardUpdate(SqlSessionTemplate session, Board notice);
	public abstract int boardDelete(SqlSessionTemplate session, int no);

}
