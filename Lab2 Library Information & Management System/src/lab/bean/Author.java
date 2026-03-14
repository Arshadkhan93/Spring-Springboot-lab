package lab.bean;

public class Author 
{
	private int authorId;
	private String authorName;
	
	public Author(int authorId, String authorName)
	{
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}
	
	public String displayAuthorInfo()
	{
		return "Author: "+authorName;
	}
	

}
