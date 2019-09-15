package wp.mvcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDAO {

	private Connection con;
	
	

	public BookDAO() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Book searchBook(int code) {
		Book book = null;
		String sql = "SELECT * FROM books WHERE bid=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, code);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				book = new Book();
				book.setBid(rs.getInt("bid"));
				book.setBname(rs.getString("bname"));
				book.setAuthor(rs.getString("author"));
				book.setSubject(rs.getString("subject"));
				book.setPrice(rs.getString("price"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;

	}

	public Book saveBook(Book book) {
		String sql = "INSERT INTO books VALUE(?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, book.getBid());
			ps.setString(2, book.getBname());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getSubject());
			ps.setString(5, book.getPrice());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;

	}

	public void deleteBook(int code) {
		String sql = "DELETE FROM books WHERE bid=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, code);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
	

}
