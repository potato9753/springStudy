package com.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DBDao;
import com.dto.Board;

@Service
public class DBOracleService implements DBService {

	
	DBDao dao;
	
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public List<Board> boardList() {
		return dao.boardList(session);
	}

	@Override
	public Board selectByNum(int num) {
		return dao.selectByNum(session, num);
	}

	@Override
	public int boardWrite(Board board) {
		return dao.boardWrite(session, board);
	}

	@Override
	public int boardUpdqte(Board board) {
		return dao.boardUpdqte(session, board);
	}

	@Override
	public int boardDelete(int num) {
		return dao.boardDelete(session, num);
	}

}

