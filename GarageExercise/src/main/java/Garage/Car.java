package Garage;

public class Car extends Vehicle 
{
	
	private String colour;
	
	public Car(String name, int wheels, String colour) 
	{
		
		super(name, wheels);
		this.setColour(colour);
		
	}
	
	public String getName(String name) 
	{
		return name;
		
	}
	
	public String getColour() 
	{
		
		return colour;
	
	}
	
	public void setColour(String colour) 
	{
		
		this.colour = colour;
		
	}
	
	@Override 
	public String toString() 
	{ 
	
		return this.getName()+ " " + colour + " ";
		
	}

}
