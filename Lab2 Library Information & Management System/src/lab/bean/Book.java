package lab.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Book 
{
	private int bookId;
	private String bookTitle;
	private Author author;
	
	@Autowired
	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book(int bookId, String bookTitle)
	{
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}
	
	public void displayBookDetails()
	{
		
		IO.println("- Book: "+bookTitle+" | "+author.displayAuthorInfo());
	}
	

}
