package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Board;

public class BoardRepository {
	//싱글턴
	private static BoardRepository br = new BoardRepository();
	private BoardRepository() {}
	public static BoardRepository getInstance() {
		return br;
	}
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Connection conn= null;
	//DB 연결
	public Connection dbconn() {
		
		try {
			String url="jdbc:mysql://localhost:3306/bookmarketdb_crud";
			String user="root";
			String password = "1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
			System.out.println("데이터베이스 연결이 성공했습니다");
			
		}catch(Exception e) {
			System.out.println("데이터베이스 연결이 실패했습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}
	//행의 개수를 리턴
	public int getTotalCount() {
		int count=0;
		//DB 연결;
		conn=dbconn();
		//쿼리 전송
		String sql = "select count(*) from board";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			//resultSet
			if(rs.next()) {
				count=rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return count;
	}
	
	
	//create
	public void create() {
		
	}
	//read all
	public ArrayList<Board> getAllBoard() {
		ArrayList<Board> arr = new ArrayList<Board>();
		
		//DB 연결
		conn = dbconn();
		
		//sql 전송
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from board";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			//ResultSet 처리
			while(rs.next()) {
				Board bd = new Board();
				bd.setNum(rs.getInt("num"));
				bd.setId(rs.getString("id"));
				bd.setName(rs.getString("name"));
				bd.setSubject(rs.getString("subject"));
				bd.setContent(rs.getString("content"));
				bd.setRegist_day(rs.getTimestamp("regist_day"));
				bd.setHit(rs.getInt("hit"));
				bd.setIp(rs.getString("ip"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return arr;
	}
	

	//read one
	
	
	//update
	
	//delete
}
