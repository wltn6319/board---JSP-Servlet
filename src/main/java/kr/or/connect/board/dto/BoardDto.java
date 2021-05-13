package kr.or.connect.board.dto;

import java.util.Date;

public class BoardDto {
	private int num;
	private String userID;
	private String title;
	private String content;
	private String date;
	
	public BoardDto() {
		
	}
	public BoardDto(String userID, String title, String content, String date) {
		super();
		this.userID = userID;
		this.title = title;
		this.content = content;
		this.date = date;
	}

	
	public BoardDto(int num, String userID , String title, String content, String date) {
		super();
		this.num = num;
		this.userID = userID;
		this.title = title;
		this.content = content;
		this.date = date;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	

	
}