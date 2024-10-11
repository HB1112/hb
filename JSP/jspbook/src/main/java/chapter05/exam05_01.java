package chapter05;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/5_1")
public class exam05_01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		System.out.println(id);
		String pw = req.getParameter("passwd");
		System.out.println(pw);
		req.setAttribute("id", id);
		req.setAttribute("pw", pw);
		RequestDispatcher ds = req.getRequestDispatcher("chapter05/exam5_01.jsp");
		ds.forward(req, resp);
	}

}
