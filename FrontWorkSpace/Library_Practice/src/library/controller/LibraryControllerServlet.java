package library.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.model.vo.Book;
import library.service.LibraryService;

@WebServlet("/selectAllBook.do")
public class LibraryControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Book>bList = null;
	LibraryService lService = new LibraryService();
       
    public LibraryControllerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		bList = lService.selectAllBookService();
		
		for(Book book:bList) {
			System.out.println(book.getBookName());
		}
		
		
		
		request.setAttribute("bList", bList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/jsp/selectAllBookResult.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
