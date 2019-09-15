package wp.mvcexample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code=Integer.parseInt(request.getParameter("bid"));
		new BookDAO().deleteBook(code);
		HttpSession session=request.getSession();
		session.setAttribute("bookDetails", code);
		RequestDispatcher rd=request.getRequestDispatcher("DeletedBook.jsp");
		rd.forward(request, response);
	}

	
	
}
