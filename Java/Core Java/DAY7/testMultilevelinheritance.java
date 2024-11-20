
class Vehicle
{
	String brand;
    String model;
    float price;
    
	public Vehicle(String brand, String model, float price) 
	{
		
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	
	void getVehicleInfo()
	{
		System.out.print(brand + " "+model+ " "+price);
	}
	
	
}


class Cars extends Vehicle
{
	int no_of_seates;
	
	public Cars(String brand, String model, float price,int no_of_seates)
	{
		super(brand, model, price);
		this.no_of_seates = no_of_seates;
	}

	
	void getCarinfo()
    {   this.getVehicleInfo();
    	System.out.print(" "+no_of_seates);
    }
	
	
}

class ElectricCar extends Cars 
{
	int range;
	String type_battery;
	
	
	public ElectricCar(String brand, String model, float price, int no_of_seates,int Range,String type_battery) {
		
		super(brand, model, price, no_of_seates);
		
		this.range = range;
		this.type_battery = type_battery;
		}
		void getElectricCarinfo()
		{   
			this.getCarinfo();
			System.out.println(range +" "+ type_battery);	
		}
		
		
		
	}
	
	

public class testMultilevelinheritance
{

	public static void main(String[] args) 
	{
		
		ElectricCar el = new ElectricCar("volvo","XC90",2000000,6,42,"Lithium");
		el.getElectricCarinfo();
		
		
		
	}
	
	
}
