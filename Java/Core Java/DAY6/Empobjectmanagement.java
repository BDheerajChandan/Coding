import java.util.Scanner;

public class Empobjectmanagement 
{

	
	public Emp[] createEmpObject()
	{
		Emp[] e = new Emp[2];
		System.out.println("enter the object");
		Scanner s = new Scanner(System.in);
		
		
		for(int i=0;i<e.length;i++)
		{
	
		 e[i] = new Emp(s.nextInt(),s.next(),s.nextFloat());
		 
	     	    
	    }
		return e;
	}

	public void displayEmpObject(Emp[] e)
	{
		System.out.println("disp");
		
		for(int i=0;i<e.length;i++)
		{
			
		  e[i].dispemp();
	    }
		
		
	}
	
}
