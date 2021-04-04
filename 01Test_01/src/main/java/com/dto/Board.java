package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("Board")
public class Board {
	
	int num;
	String title;
	String author;
	String content;
	String writeday;
	int readcnt;
	
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Board(int num, String title, String author, String content, String writeday, int readcnt) {
		super();
		this.num = num;
		this.title = title;
		this.author = author;
		this.content = content;
		this.writeday = writeday;
		this.readcnt = readcnt;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriteday() {
		return writeday;
	}
	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}
	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
	
	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", author=" + author + ", content=" + content + ", writeday="
				+ writeday + ", readcnt=" + readcnt + "]";
	}
	
	
}
