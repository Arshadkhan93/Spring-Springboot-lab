package lab.bean;

import java.util.List;

public class Library 
{
	private String libraryName;
	private List<Book> books;
	
	public Library(String libraryName, List<Book> books) 
	{
		super();
		this.libraryName = libraryName;
		this.books = books;
	}
	
	public void showLibraryData()
	{
		IO.println("Library: "+libraryName);
		IO.println("Books Available:");
		for(Book b: books)
			b.displayBookDetails();
	}
	
	

}
