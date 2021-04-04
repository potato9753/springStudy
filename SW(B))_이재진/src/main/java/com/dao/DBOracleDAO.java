package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dto.Notice;

@Repository
public class DBOracleDAO implements DBDao {
	@Override
	public List<Notice> noticeList(SqlSessionTemplate session) {
		return session.selectList("NoticeMapper.noticeList");
	}

	@Override
	public Notice selectByNo(SqlSessionTemplate session, int no) {
		int no2 = session.update("NoticeMapper.readcnt",no);
		return session.selectOne("NoticeMapper.selectByNo", no);
	}

	@Override
	public int noticeWrite(SqlSessionTemplate session, Notice notice) {
		return session.insert("NoticeMapper.noticeWrite", notice);
	}

	@Override
	public int noticeUpdate(SqlSessionTemplate session, Notice notice) {
		return session.update("NoticeMapper.noticeUpdate", notice);
	}

	@Override
	public int noticeDelete(SqlSessionTemplate session, int no) {
		return session.delete("NoticeMapper.noticeDelete", no);
	}

}
