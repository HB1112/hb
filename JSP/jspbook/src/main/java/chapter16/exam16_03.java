package chapter16;

import java.io.IOException;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/16_3")
public class exam16_03 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher ds = req.getRequestDispatcher("chapter16/exam16_03.jsp");
		ds.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id=req.getParameter("id");
		String pw=req.getParameter("passwd");
		String name=req.getParameter("name");
		PreparedStatement pstmt=null;
		Connection conn= null;
		try {
			
//			String url="jdbc:mysql://localhost:3306/jspbookdb";
//			String user="root";
//			Class.forName("com.mysql.jdbc.Driver");
//			conn=DriverManager.getConnection(url,user,password);
//			System.out.println("데이터베이스 연결이 성공했습니다");
			conn=chapter16.dbconnect.DBconn();
			String sql="insert into member values(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.executeUpdate();
			System.out.println("데이터 삽입 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터 삽입 실패");
		} 
		
	}

}
