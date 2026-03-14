package lab.main;
/*
 == Library Information System ===
Library: City Central Library
Managed By: Mr. John
Books Available:
  - Book: Spring Framework Essentials | Author: Martin Fowler
  - Book: Clean Code | Author: Robert C. Martin 
 */
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import lab.bean.*;
public class LibraryMain 
{
	void main()
	{
		IO.println(" == Library Information System ===");
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("lab/appconfigxmlanmotation/AppConfig.xml");
		Librarian bean = context.getBean("librarian",Librarian.class);
		
		bean.manageLibrary();
		

		

	}
}
