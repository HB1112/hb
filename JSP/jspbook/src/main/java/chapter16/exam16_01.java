package chapter16;

import java.io.IOException;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/16_1")
public class exam16_01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection conn= null;
		String url="jdbc:mysql://localhost:3306/jspbookdb";
		String user="root";
		String password = "1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
			String message = "데이터베이스 연결이 성공했습니다";
			req.setAttribute("message", message);
			System.out.println("데이터베이스 연결이 성공했습니다");
		} catch (Exception e) {
			e.printStackTrace();
			String message = "데이터베이스 연결이 실패했습니다";
			req.setAttribute("message", message);
			System.out.println("데이터베이스 연결이 실패했습니다");
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		RequestDispatcher ds = req.getRequestDispatcher("chapter16/exam16_01.jsp");
		ds.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}
	
}
