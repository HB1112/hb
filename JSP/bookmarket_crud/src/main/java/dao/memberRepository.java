package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.member;

public class memberRepository {
	//싱글톤
	private static memberRepository mr = new memberRepository();
	private memberRepository() {}
	public static memberRepository getMr() {
		return mr;
	}
	//DB 연결
	public Connection dbconn() {
		Connection conn= null;
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
	//Create
	public void create(member mb) {
		//DB 연결
		Connection conn = dbconn();
		//SQL 전송
		PreparedStatement pstmt=null;
		String sql = "insert into member values(?,?,?,?,?,?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mb.getId());
			pstmt.setString(2, mb.getPassword());
			pstmt.setString(3, mb.getName());
			pstmt.setString(4, mb.getGender());
			pstmt.setString(5, mb.getBirth());
			pstmt.setString(6, mb.getMail());
			pstmt.setString(7, mb.getPhone());
			pstmt.setString(8, mb.getAddress());
			pstmt.setTimestamp(9, mb.getRegist_day());
			pstmt.executeUpdate();

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt !=null) {
					pstmt.close();
				}
				if(conn !=null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();;
			}
			
		}
	}
	
	//Read
	public member getuser(String id, String password) {
		member returnData = new member();
		// 데이터베이스 연결
		Connection conn = dbconn();
		// 쿼리전송 
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MEMBER WHERE id=? and password=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			
			// ResultSet 변환 > DTO
			
			if(rs.next()) {
				returnData.setId(rs.getString("id"));
				returnData.setPassword(rs.getString("password"));
				returnData.setName(rs.getString("name"));
				returnData.setGender(rs.getString("gender"));
				returnData.setBirth(rs.getString("birth"));
				returnData.setMail(rs.getString("mail"));
				returnData.setPhone(rs.getString("phone"));
				returnData.setAddress(rs.getString("address"));
				returnData.setRegist_day(rs.getTimestamp("regist_day"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}				
		
		
		
		return returnData;
	}
	
	
	//Update
	
	
	
	//Delete
}
