import java.util.Scanner;

public class Emp
{

	int id;
	String name;
	float sal;
	String desig;
	
	public Emp()
	{
		
	}
	public Emp(int id, String name, float sal) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	
	public void readEmp()
	{
		Scanner s = new Scanner(System.in);
		
		name = s.nextLine();
		desig = s.nextLine();
		
		s = new Scanner(System.in);
		id = s.nextInt();
		sal = s.nextFloat();
	}
	
	public void disp()
	{
		System.out.println(id + sal + name +desig);
	}
//	
//	public String toString() {
//		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
//	}
	
	
	public static void main(String[] args) 
	{
	
		Emp e = new Emp();
		e.readEmp();
		e.disp();
	}
	
	
	
}
