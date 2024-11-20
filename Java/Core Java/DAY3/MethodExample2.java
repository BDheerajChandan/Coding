import java.util.Scanner;

public class MethodExample2 
{

	private static String findresult(int num)
	{
		String result;
		
		if(num>35)
			result = "PASS";
		else
		    result = "FAIL";
		
		return result;
		
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("enter name,mark");
		Scanner s = new Scanner(System.in);
		String name=s.next();
		         
		int mark = s.nextInt();
		
		
	String res=findresult(mark);
	
	System.out.println("name: " +name);
	System.out.println("mark: "  +mark);
	System.out.println("result: "+ res);
		
		
		
	}

	
	
}
