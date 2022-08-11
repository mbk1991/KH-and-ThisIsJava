package calculator;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal/result.do")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalculatorServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		char operator = request.getParameter("operator").charAt(0);
		int result =0;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("operator : " + operator);
		
		switch(operator) {
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
		}
		
		request.setAttribute("first",num1);
		request.setAttribute("second",num2);
		request.setAttribute("operator", operator);
		request.setAttribute("result", result);
		
		RequestDispatcher view =
				request.getRequestDispatcher("/calculator/calResult.jsp");
		view.forward(request, response);
						
		
		
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.println("<h1> 결과 </h1><br>");
//		out.println(result);
		
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
