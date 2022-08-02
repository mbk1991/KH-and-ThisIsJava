package taste;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/taste/check.do")
public class TasteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TasteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name =request.getParameter("person-name");
	String color = request.getParameter("color");
	String pet = request.getParameter("pet");
	String[] foods = request.getParameterValues("food");
	
	response.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
	
	out.println("<html><head><title>테스트 결과</title>"
			+ "</head><body><h2>개인 취향테스트 결과 화면</h2>"
			+name+"님의 개인 취향은 "+color+"을<br>좋아하고 "+pet+"를 좋아합니다.<br>좋아하는 음식은 ");
	for(String food:foods) {
		out.println(food + ",");
	}
	out.println("입니다.");
	
	
	
	System.out.println(name);
	System.out.println(color);
	System.out.println(pet);
	System.out.println(foods.toString());
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
