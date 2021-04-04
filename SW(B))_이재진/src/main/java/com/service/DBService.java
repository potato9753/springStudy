package com.service;

import java.util.List;
import com.dto.Notice;

public interface DBService {
	public abstract List<Notice> noticeList();
	public abstract Notice selectByNo(int no);
	public abstract int noticeWrite(Notice notice);
	public abstract int noticeUpdate(Notice notice);
	public abstract int noticeDelete(int no);
}
