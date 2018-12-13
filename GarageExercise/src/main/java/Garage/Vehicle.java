package Garage;

public abstract class Vehicle 
{	
	
	private String name;
	private int wheel;
	
	public Vehicle(String name, int wheels)
	{
		
		this.name = name;
		this.wheel = wheels;
		
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public void setName(String name) 
	{
		
		this.name = name;
		
	}
	
	public int getWheel() 
	{
		
		return wheel;
		
	}

	public void setWheel(int wheel) 
	{
		
		this.wheel = wheel;
		
	}
}
