package services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String option = request.getParameter("option");
		
		String url = "index.html";
		
		switch (option) {
		case "doDelete": 
			request.getRequestDispatcher("DeleteContact").include(request, response);
			url = "contacts.jsp";
			break;
		
		case "doList":
			request.getRequestDispatcher("ListContact").include(request, response);
			url = "contacts.jsp";
			break;
		
		case "doAdd":
			request.getRequestDispatcher("add-contact.jsp").include(request, response);
			request.getRequestDispatcher("AddContact").include(request, response);
			url = "index.html";
			break;
			
		case "toSignUp":
			url = "form-add-contact.html"; 
			break;
		
		case "toHome" :
			url = "index.html";	
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
