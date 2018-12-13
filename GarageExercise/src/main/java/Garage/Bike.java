package Garage;

public class Bike extends Vehicle
{
	
	private int chairNum;
	
	public Bike (String name, int wheels, int chairNum) 
	{
		
		super(name, wheels);
		this.name = name;
		this.setchairNum(chairNum);
		
	}
	
	public String getName(String name) 
	{
		
		return name;
		
	}
	
	public int getchairNum() 
	{
		
		return chairNum;
		
	}
	
	public void setchairNum(int chairNum) 
	{
		
		this.chairNum = chairNum;
	
	}
	
	@Override 
	public String toString() 
	{ 
	
		return this.getName() + " " + chairNum + " ";
		
	}
	
}
