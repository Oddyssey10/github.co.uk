package Garage;

public class Boat extends Vehicle 
{
	
	private int windowNum;
	
	public Boat (String name, int wheels, int windowNum) 
	{
		
		super(name, wheels);
		this.setwindowNum(windowNum);
		
	}
	
	public String getName(String name) 
	{
		
		return name;
		
	}
	
	public int getwindowNum() 
	{
		
		return windowNum;
		
	}
	
	public void setwindowNum(int windowNum) 
	{
		
		this.windowNum = windowNum;
		
	}
	
	@Override 
	public String toString() 
	{ 
	
		return this.getName() + " " + windowNum + " ";
		
	}

}

