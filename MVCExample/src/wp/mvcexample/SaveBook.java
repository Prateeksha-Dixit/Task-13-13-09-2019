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
 * Servlet implementation class SaveBook
 */
@WebServlet("/SaveBook")
public class SaveBook extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookDAO dao=new BookDAO();
		Book book=new Book();
		book.setBid(Integer.parseInt(request.getParameter("bid")));
		book.setBname(request.getParameter("bname"));
		book.setAuthor(request.getParameter("author"));
		book.setSubject(request.getParameter("subject"));
		book.setPrice(request.getParameter("price"));
		book=dao.saveBook(book);
		
		HttpSession session=request.getSession();
		session.setAttribute("SavedBook", book);
		
		RequestDispatcher rd=request.getRequestDispatcher("SavedBookDetails.jsp");
		rd.forward(request, response);
		
	}

}
