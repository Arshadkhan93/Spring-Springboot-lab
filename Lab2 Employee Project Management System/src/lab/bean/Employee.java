package lab.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private Project project;
	
	public Employee(int employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	@Autowired
	@Qualifier("project1")
	public void setProject(Project project) {
		this.project = project;
	}

	 public void showEmployeeDetails() {
	        System.out.println("  Employee: " + employeeName +
	                " | Project: " + project.getProjectInfo());
	    }
	
	
	

}
