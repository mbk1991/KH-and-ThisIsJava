package radio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/radio/check.do")
public class RadioCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RadioCheckServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String gender = request.getParameter("gender");
	String checkEmail = request.getParameter("check_mail");
	
	response.setCharacterEncoding("utf-8");
	response.setContentType("text/html; charset=utf-8");
	PrintWriter out = response.getWriter();
	out.println(gender);
	out.println(checkEmail);
	
	System.out.println(gender);
	System.out.println(checkEmail);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
