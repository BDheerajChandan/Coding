
class Vehicle
{
	void stop()
	{
		System.out.println("Vehicle is stoped");
	}
	
	void run()
	{
		System.out.println("Vehicle is running");
	}
	
}



class car extends Vehicle
{
	
	void stop()
	{   
		System.out.println("Car is stoped");
	}
	
	void run()
	{
		System.out.println("Car is running");
	}
}


public class MethodOverridingExample
{


public static void main(String[] args) 
{
	
	  
	
	 car c = new car();
     c.run();
     c.stop();
	
}	
	
	
	
}
