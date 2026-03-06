package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wda")
public class WeekDayAnalyzer
{
	private LocalDate date;
	
	public WeekDayAnalyzer()
	{
		System.out.println("WeekDayAnalyzer::0-param constructor");
	}
	
	@Autowired
	public void setDate(LocalDate date)
	{
		System.out.println("WeekDayAnalyzer.setDate()");
		this.date=date;
	}
	
	//B.method
	public String showMessage(String user)
	{
		//get week day 1-7
		int wno = date.getDayOfWeek().getValue();		
		//B.logic
		if(wno>=1 && wno<=5)
			return "Happy Working Day::"+user;
		else
			return "Happy WeekEnd::"+user;
	}
	

}
