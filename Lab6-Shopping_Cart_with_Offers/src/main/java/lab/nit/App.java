package lab.nit;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lab.nit.sbean.ShoppingContext;


@Configuration
@ComponentScan("lab.nit.sbean")
public class App 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
    	ShoppingContext scon = ctx.getBean(ShoppingContext.class);
    	
    	/*System.out.print("Enter Platform:");
    	String platform = sc.nextLine();
    
        if(platform.startsWith("a"))
        {
        	service=ctx.getBean(AmazonService.class);
        	scon.setShoppingService(service);
        }
        else if(platform.startsWith("f"))
        {
        	 service = ctx.getBean(FlipkartService.class);
            scon.setShoppingService(service);
        }
        else
        	System.err.println("invalid choice");*/
    	
    	while(true)
    	{
    		System.out.println("1. Add Item to Cart\r\n"
    				+ "\r\n"
    				+ "2. View Cart\r\n"
    				+ "\r\n"
    				+ "3. Checkout\r\n"
    				+ "\r\n"
    				+ "4. Exit");
    		System.out.print("Enter Your choice:");
    		int n = Integer.parseInt(sc.nextLine());
    		
    		if(n==1)
    		{
    			System.out.print("Enter Item Name:");
    			System.out.print("Enter Item Price:");
    			scon.addItem(sc.next(), Double.parseDouble(sc.next()));
    			sc.nextLine();
    		}
    		else if(n==2)
    		{
    			scon.viewCart();
    		}
    		else if(n==3)
    		{
    			scon.checkout();
    		}
    		else if(n==4)
    		{
    			ctx.close();
    			sc.close();
    			System.exit(0);
    		}
    		else
    		{
    			System.out.println("Invalid Choice Try Again!!");
    		}
    			
    	}
    }
}
