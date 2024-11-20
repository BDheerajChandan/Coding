
abstract public class ElectricityBill 
{
    int cId;
    float unitConsumed;
    
	public ElectricityBill(int cId, float unitConsumed) {
		
		this.cId = cId;
		this.unitConsumed = unitConsumed;
	}
    
	abstract void findBillPayment();
			
		
	
	
    void dispElectricityBill()
    {
    	System.out.print(cId+" " +unitConsumed);
    }
	
	
	
}


class ResidentialElectricityBill extends ElectricityBill
{
	     

	public ResidentialElectricityBill(int cId, float unitConsumed)
	{
		super(cId, unitConsumed);
		
	}

	
	void findBillPayment()
	{
		float amt;
		
		if(unitConsumed<100)
			amt = unitConsumed*1.5f;
		else
			amt = unitConsumed*2.5f;
		System.out.println(amt);
		
		
	} 	
	
	
}

class CommercialElectricityBill extends ElectricityBill
{

	public CommercialElectricityBill(int cId, float unitConsumed) {
		super(cId, unitConsumed);
		
	}
	
	
	
	void findBillPayment()
	{
		float amt;
		
		if(unitConsumed<100)
			amt = unitConsumed*2f;
		else
			amt = unitConsumed*3f;
		System.out.println(amt);
		
		
	} 	
	
	
		
}


class testabstraction
{
	
	public static void main(String[] args) 
	{
		ElectricityBill  e;	
	    System.out.println("ResidentialElectricityBill");
		e = new ResidentialElectricityBill(1001,200);
		e.dispElectricityBill();
		e.findBillPayment();
		
		
		System.out.println("CommercialElectricityBill");
		e = new CommercialElectricityBill(2001,300);
		e.dispElectricityBill();
		e.findBillPayment();
		
	}
	
	
	
	
	
}


