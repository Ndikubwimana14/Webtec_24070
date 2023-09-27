package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/register")
public class Admission extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("admission.jsp").forward(req, res);
    }
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		PrintWriter out = res.getWriter();
		
		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String pwd = req.getParameter("password");
		String pwd2 = req.getParameter("confirmPassword");
		
		if(fname.trim() == "") {
            req.setAttribute("message", "FirstName is invalid...");
            req.setAttribute("lastName", lname);
            req.setAttribute("email", email);
            req.setAttribute("phone", phone);
            req.setAttribute("password", pwd);
            req.setAttribute("confirmPassword", pwd2);
            req.getRequestDispatcher("admission.jsp").forward(req, res);
		}	
		else if(lname.trim() == "") {
            req.setAttribute("message", "LastName is invalid...");
            req.setAttribute("firstName", fname);
            req.setAttribute("email", email);
            req.setAttribute("phone", phone);
            req.setAttribute("password", pwd);
            req.setAttribute("confirmPassword", pwd2);
            req.getRequestDispatcher("admission.jsp").forward(req, res);
		}	
		else if(phone.trim() == "") {
            req.setAttribute("message", "Phone is invalid...");
            req.setAttribute("firstName", fname);
            req.setAttribute("lastName", lname);
            req.setAttribute("email", email);
            req.setAttribute("password", pwd);
            req.setAttribute("confirmPassword", pwd2);
            req.getRequestDispatcher("admission.jsp").forward(req, res);
		}	
		else if(email.trim() == "") {
            req.setAttribute("message", "Email is invalid...");
            req.setAttribute("firstName", fname);
            req.setAttribute("lastName", lname);
            req.setAttribute("phone", phone);
            req.setAttribute("password", pwd);
            req.setAttribute("confirmPassword", pwd2);
            req.getRequestDispatcher("admission.jsp").forward(req, res);
		}	
		else if(pwd.trim() == "") {
            req.setAttribute("message", "Password is invalid...");
            req.setAttribute("firstName", fname);
            req.setAttribute("lastName", lname);
            req.setAttribute("email", email);
            req.setAttribute("phone", phone);
            req.setAttribute("confirmPassword", pwd2);
            req.getRequestDispatcher("admission.jsp").forward(req, res);
		}	
		else if(pwd2.trim() == "") {
            req.setAttribute("message", "Password2 is invalid...");
            req.setAttribute("firstName", fname);
            req.setAttribute("lastName", lname);
            req.setAttribute("email", email);
            req.setAttribute("phone", phone);
            req.setAttribute("password", pwd);
            req.setAttribute("confirmPassword", pwd2);
            req.getRequestDispatcher("admission.jsp").forward(req, res);
		}
		else {
			out.println("<script type=\"text/javascript\">"); 
			out.println("alert('Registered Successfuly...');"); 
			out.println("</script>"); 
			res.sendRedirect("index.jsp");
		}
	}
}
