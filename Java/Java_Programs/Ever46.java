//Class Members visibility
import java.io.*;

class emp
{
	private String empname;
	private String pfno;
	public long salary;
	void inputdata() throws IOException
	{
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader input = new BufferedReader(reader);
	System.out.print ("Enter Name of Employee ::");
	empname = input.readLine();
	System.out.print("Enter PF No. of the Employee ::");
	pfno = input.readLine();
	System.out.print("Enter Basic Pay the Employee ::");
	String a = input.readLine();
    salary = Long.parseLong(a);
	}
	void outputdata()
	{
	System.out.println("=================================================");
	System.out.println("Name of Employee :::" +empname);
	System.out.println("PF No :::" +pfno);
	System.out.println("Basic Pay :::" +salary);
	}
	
	private double grosspay;
	private double da, hra;
	void calculateda()
	{
	
	da = 1.5 *salary;
	System.out.println("DA = " +da);
	}
	void calculatehra()
	{
	hra = 0.1*salary;
	System.out.println("HRA =" +hra);
	}
	void calculategross()
	{
	grosspay = salary+hra+da;
	System.out.println("Gross Salary of Employee =" +grosspay);
	}
	}
	class Ever46
	{
	public void main() throws Exception
	{
	emp employee = new emp();
	employee.inputdata();
	employee.outputdata();
	employee.calculateda();
	employee.calculatehra();
	employee.calculategross();
	}
	}
	