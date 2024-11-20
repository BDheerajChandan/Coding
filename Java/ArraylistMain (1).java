// .add() ; .remove() ; .set(,) ; .update(,) ; .contatins() ; .indexOf(<element>)
import java.io.*;
import java.util.*;
class EmployeeCollection
{
	int ID;
	String Name;
	float Salary;
	EmployeeCollection(int ID,String Name,float Salary)
	{
		this.ID=ID;
		this.Name=Name;
		this.Salary=Salary;
	}
	public void display()
	{
		System.out.println("ID : "+ID+"\nName : "+Name+"\nSalary : "+Salary);
		System.out.println("*******************************************");
	}
}
////////////////////////////////////////////////////////////////////////////////////
class EmployeeObject
{
	ArrayList<EmployeeCollection> al=new ArrayList<>();
	public void SetDetails()
	{
		EmployeeCollection ec1=new EmployeeCollection(1,"Dheeraj",1000);
		EmployeeCollection ec2=new EmployeeCollection(2,"Chandan",2000);
		EmployeeCollection ec3=new EmployeeCollection(3,"Ramesh",3000);
		al.add(ec1);
		al.add(ec2);
	}
	public void display()
	{
		for(EmployeeCollection i:al)
		{
			i.display();
		}
	}
}
////////////////////////////////////////////////////////////////////////////////////
public class ArraylistMain
{
	public static void main(String args[])
	{
		EmployeeObject eo=new EmployeeObject();		
		eo.SetDetails();
		eo.display();
	}
}
