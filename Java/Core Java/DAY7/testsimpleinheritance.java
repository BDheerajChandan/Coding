
 class Car
{
    String brand;
    String model;
    float price;
    
	public Car(String brand, String model, float price) 
	{
		
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
    
    void getinfoCar()
    {
    	System.out.print(brand + " "+model+ " "+price);
    }
  
}

class Sadan extends Car
{
      int no_of_seates;
	public Sadan(String brand, String model, float price,int no_of_seates)
	{
		super(brand, model, price);
		this.no_of_seates = no_of_seates;
		
	}
	
	
	void getinfoSadan()
    {
		this.getinfoCar();
    	System.out.println(" "+no_of_seates);
    }
	
	}



class SUV extends Car
{
	   int safty_bags;
	   boolean is4DW;
	   
	   

	public SUV(String brand, String model, float price,int safty_bags,boolean is4DW) 
	{
		super(brand, model, price);
		this.safty_bags = safty_bags;
		this.is4DW = is4DW;
	}
	
	
	void getinfoSUV()
    {
		this.getinfoCar();
    	System.out.println(" "+safty_bags+ " "+is4DW);
    }
	
}





public class testsimpleinheritance
{
	public static void main(String[] args) 
	{
		Sadan sa = new Sadan("KIA","SELTOS",40000,5);
		
	    sa.getinfoSadan();
	    
	    SUV su = new SUV("Mahendra","XUV700",350000,6,false);
	    su.getinfoSUV();
		
	}
	
	
	
}


