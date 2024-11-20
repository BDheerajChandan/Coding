import java.util.Scanner;

public class Student 
{

	int sid;
	String sname;
	int mark;
	String sub;
	
	public void readStudent()
	{
		Scanner s = new Scanner(System.in);
		sid = s.nextInt();
		sname = s.next();
		mark = s.nextInt();
		sub = s.next();
		
		
	}
	
	public  void displayStudent()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(mark);
		System.out.println(sub);
		
	}
	
	
	public void findresult()
	{
		
		if(mark>35)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		
		
	}
	
	
}
