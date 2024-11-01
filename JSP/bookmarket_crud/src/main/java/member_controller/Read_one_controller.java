package member_controller;

import java.io.IOException;

import dao.memberRepository;
import dto.member;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/member_login")
public class Read_one_controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//전처리
		//모델이동
		//뷰이동
		RequestDispatcher rs= req.getRequestDispatcher("loginMember.jsp");
		rs.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//전처리
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		//모델이동
		memberRepository mr = memberRepository.getMr();
		member mb = mr.getuser(id,password);
		if(mb != null) {//DTO가 존재하므로 회원이 맞음
			//세션 생성
			HttpSession session = req.getSession(true);
			session.setAttribute("member", mb);
		}else {
			resp.sendRedirect("member_login?error=1");
		}
		//뷰이동
		RequestDispatcher rs= req.getRequestDispatcher("resultMember.jsp?msg=2");
		rs.forward(req, resp);
	}

}
