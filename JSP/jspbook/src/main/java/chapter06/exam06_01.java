package chapter06;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/6_1")
public class exam06_01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher ds = req.getRequestDispatcher("chapter06/exam6_01.jsp");
		ds.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id =req.getParameter("id");
		String password =req.getParameter("passwd");
		String name =req.getParameter("name");
		String phone1 =req.getParameter("phone1");
		String phone2 =req.getParameter("phone2");
		String phone3 =req.getParameter("phone3");
		String gender =req.getParameter("gender");
		String[] hobby =req.getParameterValues("hobby");
		String comment =req.getParameter("comment");
		
		
		req.setAttribute("id", id);
		req.setAttribute("password", password);
		req.setAttribute("name", name);
		req.setAttribute("phone1", phone1);
		req.setAttribute("phone2", phone2);
		req.setAttribute("phone3", phone3);
		req.setAttribute("gender", gender);
		req.setAttribute("hobby", hobby);
		for(int i =0;i<hobby.length;i++) {
			System.out.println(hobby[i]);
		}
		req.setAttribute("comment", comment);
		
		RequestDispatcher ds = req.getRequestDispatcher("chapter06/exam6_01_form.jsp");
		ds.forward(req, resp);
	}

}
