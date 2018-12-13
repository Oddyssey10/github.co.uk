package Garage;
import java.util.ArrayList;
public class Garage 
{
	
	ArrayList<Vehicle>listofVehicles = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) 
	{
		listofVehicles.add(vehicle);
	}
	
	public void printVehicle() 
	{
		listofVehicles.stream().forEach(System.out::println);
	}
	
	public void carSearch(String name) 
	{ 
		
		listofVehicles.stream().filter(p -> name.equals(p.getName())).forEach(System.out::println); 
		
	}

	public void calculateBill() // what do you need to bill? 
	{
		
		for(Vehicle vehicle : listofVehicles)
		{
			int bill = 0;
			
			if(vehicle instanceof Car) 
			
			{
				
				 bill += 100;
				 
			}
			
			else if (vehicle instanceof Bike) 
			{
				
					
				bill += 80;
					 
			}
			
			else if (vehicle instanceof Boat) 
			{
				
				bill += 150; 
				
			}
			
			else 
			
			{
				
				bill = 0;
			
			}
			
			System.out.println(bill);
		}
	}
}
