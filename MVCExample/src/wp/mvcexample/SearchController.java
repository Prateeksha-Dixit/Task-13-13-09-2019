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
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code=Integer.parseInt(request.getParameter("bid"));
		BookDAO dao=new BookDAO();
		Book book=dao.searchBook(code);
		HttpSession session=request.getSession();
		session.setAttribute("bookDetails", book);
		RequestDispatcher rd=request.getRequestDispatcher("Details.jsp");
		rd.forward(request, response);
		
	}

}
