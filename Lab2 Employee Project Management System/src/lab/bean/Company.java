package lab.bean;

import java.util.Map;

public class Company
{
	private String companyName;
	private Map<String,Department> department;
	
	public Company(String companyName, Map<String, Department> department) 
	{
		super();
		this.companyName = companyName;
		this.department = department;
	}
	
	 public void showCompanyInfo() {
	        System.out.println("=== Company Structure ===");
	        System.out.println("Company: " + companyName);

	        for (Map.Entry<String, Department> entry : department.entrySet()) {
	            entry.getValue().showDepartmentInfo();
	        }
	    }
	
	

}
