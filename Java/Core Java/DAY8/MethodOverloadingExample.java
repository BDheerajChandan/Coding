
public class MethodOverloadingExample
{

	public static void sort(int[] n)
	{
		System.out.println("sorting integer");
		
	}
	
	public static void sort(String[] s)
	{
		System.out.println("sorting String");
		
	}
	
	public static void add(int num)
	{
		
		System.out.println("number is added in array");
		
	}
	
	public static void add(int num,int pos)
	{
		
		System.out.println("number is added in given position ");
		
	}
	
	public static void main(String[] args) 
	{
	
		String[] s = {"c++","java","python"};
		int[] num = {10,20,30};
		sort(s);
		add(10);
		add(20);
		add(30,1);
		
		int a =10;
		int b = 20;
		
		System.out.println(a+" "+b);
		
		String str = "welcome";
		
		
		
		
	}

	

	
	
}
