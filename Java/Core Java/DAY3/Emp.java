
public class Emp
{
     int empno;
	
	 void disp()
	{
		System.out.println("disp in emp class");
	}
	
	
	
	public static void main(String[] args) 
	{
	
		Emp e = new Emp();
		e.disp();
		e.empno=10;
		
	}
}
