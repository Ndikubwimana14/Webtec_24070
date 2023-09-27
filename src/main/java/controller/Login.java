package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login")
public class Login extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		req.getRequestDispatcher("index.jsp").forward(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String email = req.getParameter("email");
		String pwd = req.getParameter("password");
		

		if(email.trim() == "" || !email.equalsIgnoreCase("rwanda@gmail.com")) {
            req.setAttribute("message", "Email not valid...");
            req.setAttribute("password", pwd);
            req.getRequestDispatcher("index.jsp").forward(req, res);
		}	
		else if(pwd.trim() == "" || !pwd.equalsIgnoreCase("rwanda")) {
            req.setAttribute("message", "Password is invalid...");
            req.setAttribute("email", email);
            req.getRequestDispatcher("index.jsp").forward(req, res);
            res.sendRedirect("resetPwd.jsp");
		}else {
            req.setAttribute("email", email);
            req.getRequestDispatcher("home.jsp").forward(req, res);
			res.sendRedirect("home.jsp");
		}
	}
}
