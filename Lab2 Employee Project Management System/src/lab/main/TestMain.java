package lab.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab.bean.Company;

public class TestMain
{
	void main()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("lab/appconfig/appconfig.xml");
		Company company = context.getBean(Company.class);
		
		company.showCompanyInfo();
	}

}
