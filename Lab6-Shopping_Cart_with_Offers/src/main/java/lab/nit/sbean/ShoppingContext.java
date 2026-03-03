package lab.nit.sbean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShoppingContext 
{
	
	private ShoppingService shoppingService;

	
	@Autowired
	public ShoppingContext(@Qualifier("flipkartService") ShoppingService shoppingService) {
		
		this.shoppingService = shoppingService;
	}

	public void addItem(String item, double price)
	{
		shoppingService.addItem(item, price);
	}

	
	public void checkout() 
	{
		shoppingService.checkout();
	}

	
	public void viewCart()
	{
		shoppingService.viewCart();
	}
	
	

}
