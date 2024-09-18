//Class Members visibility
import java.io.*;

class emp
{
	private String empname;
	public long salary;
	void inputdata() throws IOException
	{
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader input = new BufferedReader(reader);
	System.out.print ("Enter Name of Employee ::");
	empname = input.readLine();
	System.out.print("Enter Basic Pay the Employee ::");
	String a = input.readLine();
    salary = Long.parseLong(a);
	}
	void outputdata()
	{
	System.out.println("=================================================");
	System.out.println("Name of Employee :::" +empname);
	System.out.println("Basic Pay :::" +salary);
    System.out.println("D.A. :::" +(calculateda()));
    System.out.println("HRA :::" +(calculatehra()));
    
	}
	
	private double calculateda()
	{
		return ((1.5 *salary));
	}
	private double calculatehra()
	{
	return ((0.1*salary));
	}
	}
	class Ever72
	{
	public static void main(String args[]) throws IOException
	{
	emp employee = new emp();
	employee.inputdata();
	employee.outputdata();
	
	}
	}
	
