package lab.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle 
{
	@Autowired
	@Qualifier("electricEngine")
	private Engine engine;
	
	public void startVehicle()
	{
		engine.start();
	}
	

}
