package dao;

import java.sql.Connection;
import java.sql.DriverManager;

import dto.member_dto;

public class member_repository {
	//1개만 존재해야되므로 싱글톤으로 작성
	private static member_repository mr = new member_repository();
	public static member_repository getInstance() {
		return mr;
	}
	//create
	public void member_create(member_dto dto) {
		
		try {
			//step1 : JDBC 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			//step2 : connection 객체 생성
			Connection conn = null;
			String database="jdbc:mysql://localhost:3306/login_crud";
			String id="root";
			String password="1234";
			conn = DriverManager.getConnection(database,id,password);
			System.out.println("데이터 베이스 연결 완료");
			
			
			
		} catch (Exception e) {
			System.out.println("데이터 베이스 연결 오류");
		}
		
		
		//step3 : SQL 전송객체 생성
		
		//step4 : 리턴이 있다면 ResultSet객체에 담기(CUD는 해당없음)
	}
	//read
	
	//update
	
	//delete
}
