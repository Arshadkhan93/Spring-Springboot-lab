package lab.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Librarian 
{
	private Library library;
	private String employeeName;
	
	public void setEmployeeName(String employeeName) {
	    this.employeeName = employeeName;
	}
	
	@Autowired
	public void setLibrary(Library library)
	{
		this.library = library;
	}
	
	public void manageLibrary()
	{
		library.showLibraryData();
		IO.println("Managed By: "+employeeName);
		
		
	}
	
	
	
	

}
