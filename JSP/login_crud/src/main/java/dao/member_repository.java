package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dto.member_dto;

public class member_repository {
	//1개만 존재해야되므로 싱글톤으로 작성
	private static member_repository mr = new member_repository();
	public static member_repository getInstance() {
		return mr;
	}
	//데이터베이스 연결 메서드
	private Connection DBconn() throws Exception{
		//step1 : JDBC 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");
		//step2 : connection 객체 생성
		Connection conn = null;
		String database="jdbc:mysql://localhost:3306/login_crud";
		String id="root";
		String password="1234";
		conn = DriverManager.getConnection(database,id,password);
		System.out.println("데이터 베이스 연결 완료");
		
		return conn;
	}

	//create
	public void member_create(member_dto dto) {
		try {
			Connection conn = DBconn();
			//sql 쿼리 전송 : DB에 데이터를 삽입하는 절차
			Statement stmt = conn.createStatement();
			String userid = dto.getId();
			String userpw= dto.getPw();
			int userage=dto.getAge();
			//step3 : SQL 전송객체 생성
			//"insert into member values('admin','1234',12)" : 워크벤치에서 테스트 실행
			//"insert into member values('userid','pw',age)"
			//"insert into member values('"+userid+"','"+pw+"',"+age+")"
			String sql="insert into member values('"+userid+"','"+userpw+"',"+userage+")";
			stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			System.out.println("데이터 베이스 연결 오류");
		}
		//step4 : 리턴이 있다면 ResultSet객체에 담기(CUD는 해당없음)
	}
	//read
	public ArrayList<member_dto> getAllmember() {	
		ArrayList<member_dto> arr = new ArrayList<member_dto>();
		ResultSet rs=null;
		try {
			Connection conn = DBconn();
			Statement stmt = conn.createStatement();
			String sql = "select * from member";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("id");//column 명
				String pw = rs.getString("pw");
				int age = rs.getInt("age");
				
				member_dto dto=new member_dto();
				dto.setId(id);
				dto.setPw(pw);
				dto.setAge(age);
				/*
			 		member_dto dto=new member_dto();
					dto.setId(rs.getString("id");
					dto.setPw(rs.getString("pw");
					dto.setAge(rs.getInt("age"));
				 */
				arr.add(dto);
				
			}	
		
		}catch(Exception e) {
			
		}
		return arr;
	}
	
	//read one
	public member_dto getOnemember(String userid) {
		ResultSet rs = null;
		//step1 : DB 연결
		Connection conn;
		member_dto dto=new member_dto();
		try {
			conn = DBconn();
			//step2 : 쿼리 전송 및 실행
			Statement stmt = conn.createStatement();
			String sql = "select * from member where id='"+userid+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				String id = rs.getString("id");//column 명
				String pw = rs.getString("pw");
				int age = rs.getInt("age");
				
				dto.setId(id);
				dto.setPw(pw);
				dto.setAge(age);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	//update
	
	public void update_member(member_dto dto) {
		//step1 : DB 연결
		Connection conn;
		try {
			conn = DBconn();
			Statement stmt = conn.createStatement();
			String userid = dto.getId();
			String userpw = dto.getPw();
			int age = dto.getAge();
			String sql = "update member set pw='"+userpw+"',age="+age+" where id='"+userid+"'";
			stmt.executeUpdate(sql);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	//delete
	public void deleteuser(String id) {
		//step1 : DB연결
		try {
			Connection conn = DBconn();
			//step2 : query 전송 및 실행
			Statement stmt = conn.createStatement();
			String sql = "delete from member where id='"+id+"'";
			System.out.println(sql);
			
			stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
