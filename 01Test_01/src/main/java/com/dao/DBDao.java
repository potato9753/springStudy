package com.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import com.dto.Board;

public interface DBDao {
	
	public abstract List<Board> boardList(SqlSessionTemplate session);
	public abstract Board selectByNum(SqlSessionTemplate session, int num);
	public abstract int boardWrite(SqlSessionTemplate session, Board board);
	public abstract int boardUpdqte(SqlSessionTemplate session, Board board);
	public abstract int boardDelete(SqlSessionTemplate session, int num);
	
}
