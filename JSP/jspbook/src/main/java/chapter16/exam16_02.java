package chapter16;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/16_2")
public class exam16_02 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher ds = req.getRequestDispatcher("chapter16/exam16_02.jsp");
		ds.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("포스트 도착");
		Connection conn=null;
		Statement stmt=null;
		try {
			String url="jdbc:mysql://localhost:3306/jspbookdb";
			String user="root";
			String password = "1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
			System.out.println("DB 연결 성공");
			
			req.setCharacterEncoding("utf-8");
			String id = req.getParameter("id");
			String pw = req.getParameter("passwd");
			String name=req.getParameter("name");
			
			
			stmt=conn.createStatement();
			String sql = "insert into member values('"+id+"','"+pw+"','"+name+"')";
			stmt.executeUpdate(sql);
			String message = "멤버 테이블 삽입 성공";
			req.setAttribute("message", message);
			System.out.println("멤버 테이블 삽입 성공");
			
		}catch(Exception e) {
			String message = "DB 연결 혹은 삽입 실패";
			req.setAttribute("message", message);
			e.printStackTrace();
		}finally {
			if(stmt !=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if(conn !=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		RequestDispatcher ds = req.getRequestDispatcher("chapter16/exam16_02_view.jsp");
		ds.forward(req, resp);
	}
	
}
