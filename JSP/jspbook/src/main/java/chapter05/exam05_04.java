package chapter05;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/5_4")
public class exam05_04 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher ds = req.getRequestDispatcher("chapter05/exam5_04.jsp");
		ds.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String userid = req.getParameter("id");
		String password = req.getParameter("passwd");
		
		if(userid.equals("admin") && password.equals("1234")){
			resp.sendRedirect("chapter05/exam5_04_success.jsp");
		}else{
			resp.sendRedirect("chapter05/exam5_04_failed.jsp");	
		}
	}	
}
