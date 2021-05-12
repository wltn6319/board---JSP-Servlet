package kr.or.connect.board.dao;



import java.util.*;

import kr.or.connect.board.dto.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDao {
	private static String dburl ="jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#";


	public List<BoardDto> getBoards() {
		List<BoardDto> list = new ArrayList<>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String sql = "SELECT * FROM board";
		try (Connection conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
				PreparedStatement ps = conn.prepareStatement(sql)) {

			try (ResultSet rs = ps.executeQuery()) {

				while (rs.next()) {
					int num = rs.getInt(1);
					String userID = rs.getString(2);
					String title = rs.getString(3);
					String content= rs.getString(4);
					Date date = rs.getDate(5);


					BoardDto board = new BoardDto(num, userID, title, content, date);
					list.add(board);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	
	
	public int addBoard(BoardDto board) {
		int insertCount = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "INSERT INTO todo (userID, title, content, date) VALUES ( ?, ?, ?, ?)";

		try (Connection conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
				PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setString(1, board.getUserID());
			ps.setString(2, board.getTitle());
			ps.setString(3, board.getContent());
			ps.setDate(4, (java.sql.Date) board.getDate());



			insertCount = ps.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return insertCount;
	}


	
	
}








