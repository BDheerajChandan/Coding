import java.util.Scanner;

public class Emp 
{

	int empno;
	String name;
	float sal;
	
	
	Emp()
	{
		empno =1002;
		name = "shan";
		sal = 3000;
	}
	
	Emp(int empno,String name,float sal)
	{
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}
	
	void reademp()
	{
		Scanner s = new Scanner(System.in);
		empno = s.nextInt();
		name = s.next();
		sal = s.nextFloat();
	}
	
	void dispemp()
	{
		System.out.println(empno+name+sal);
	}
	
}
