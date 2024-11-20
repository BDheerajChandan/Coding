public class Vehicle1
{

	String make;
	String model;
	boolean isRented;
	
	public Vehicle1(String make, String model, boolean isRented) 
	{
		
		this.make = make;
		this.model = model;
		this.isRented = isRented;
	}
	
	void dispVehicle1()
	{
		System.out.println(make+model+isRented);
	}
	
	void calculateRentalCost(int days)
	{
		  float rent;
		  rent = 50*days;
		  System.out.println(rent);
	}
	
	
	
}


class Car1 extends Vehicle1
{
	
	int numberofSeates;
	
	public Car1(String make, String model, boolean isRented,int numberofSeates) 
	{
		super(make, model, isRented);
		this.numberofSeates = numberofSeates;
		
	}
     
	void calculateRentalCost(int days)
	{
		  float rent;
		  rent = 500*days;
		  System.out.println(rent);
	}
	
	
	
	
	void displayCar()
	{
		System.out.println(numberofSeates);
	
	
}
}

class Bike extends Vehicle1
{

	public Bike(String make, String model, boolean isRented) 
	{
		super(make, model, isRented);
		
	}
	
	
	void calculateRentalCost(int days)
	{
		  float rent;
		  rent = 100*days;
		  System.out.println(rent);
	}
	
}


class testOverriding
{
	public static void main(String[] args) 
	{
	
		
		Vehicle1 v;
		
		v =new Car1("KIA","SELTOS",true,6);
		v.dispVehicle1();
		v.calculateRentalCost(10);
		
		
		
//		Car1 c = new Car1("KIA","SELTOS",true,6);
//		c.dispVehicle1();
//		c.displayCar();
//		c.calculateRentalCost(10);
		
		v = new Bike("Honda","Activa",true);
		
//		Bike b = new Bike("Honda","Activa",true);
		v.dispVehicle1();
		v.calculateRentalCost(10);
		
		
		
		
		
		
	}
}


