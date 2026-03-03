package lab.nit.sbean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("amazonService")
public final class AmazonService implements ShoppingService
{
	Double totalAmount=0.0;
	Double finalAmount=0.0;
	Map<String,Double> map = new HashMap<>();

	@Override
	public void addItem(String item, double price) {
		map.put(item, price);		
	}

	@Override
	public void checkout() 
	{
		for(Double price : map.values())
			totalAmount+=price;
		
		finalAmount=totalAmount-(totalAmount*0.10);
		
		System.out.println("Total Amount after Discount :"+finalAmount);
		System.out.println("Fast delivery within 2 days....");		
	}

	@Override
	public void viewCart()
	{
		map.forEach((k,v)->System.out.println(k+" : "+v));		
	}

}
