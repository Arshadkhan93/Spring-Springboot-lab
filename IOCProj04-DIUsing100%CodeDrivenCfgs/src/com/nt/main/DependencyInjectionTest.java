package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WeekDayAnalyzer;

public class DependencyInjectionTest 
{
	void main()
	{
		//create IOC container
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class))
		{
			//get target spring bean class obj ref
			WeekDayAnalyzer analyzer = ctx.getBean("wda",WeekDayAnalyzer.class);
			//invoke the b.method
			String result = analyzer.showMessage("raja");
			IO.println("result ::"+result);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
