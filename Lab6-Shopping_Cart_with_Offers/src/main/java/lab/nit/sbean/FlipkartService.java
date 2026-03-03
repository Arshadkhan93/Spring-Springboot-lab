package lab.nit.sbean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("flipkartService")
public final class FlipkartService implements ShoppingService
{
	Map<String,Double> map = new HashMap<>();
	@Override
	public void addItem(String item, double price) 
	{
		map.put(item, price);		
		
	}

	Double finalAmount=0.0;
	Double totalAmount=0.0;
	
	@Override
	public void checkout() 
	{
		for(Double price : map.values())
			totalAmount+=price;
		double discount = totalAmount*0.05;
		if(discount>=500)
			finalAmount=totalAmount-discount;
		else
			finalAmount=(totalAmount-discount)+50;
		
		
		System.out.println("Total Amount after Discount :"+finalAmount);
		System.out.println("standard delivery within 3-5 days....");
		
	}

	@Override
	public void viewCart() 
	{
		map.forEach((k,v)->System.out.println(k+" : "+v));		
	}

}
