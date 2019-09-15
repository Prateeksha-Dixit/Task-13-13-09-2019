package wp.mvcexample;

public class Book {
	
	private int bid;
	private String bname;
	private String author;
	private String subject;
	private String price;
	
	
		
	
	public Book() {
		
	}
	public Book(int bid, String bname, String author, String subject, String price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.subject = subject;
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", subject=" + subject + ", price="
				+ price + "]";
	}
	
	


}
