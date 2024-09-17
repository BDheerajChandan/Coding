
public class Employee 
{

	int id;
	String name;
	static String cname;
	
	Employee()
	{
		id = 1001;
		name = "shan";
	}
	
	Employee(int id,String name)
	{
		this.id = id;
		this.name = name;
		this.dispemp();		 
	}
	
	void dispemp()
	{
		System.out.println(id  + name +cname);
	}
	
	static void changeCname()
	{
		System.out.println("static method called");
		cname = "Wipro";
	}
	
	
}
