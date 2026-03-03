package lab.nit.sbean;

public interface ShoppingService 
{
	void addItem(String item, double price);
	
	void checkout();
	
	void viewCart();

}
