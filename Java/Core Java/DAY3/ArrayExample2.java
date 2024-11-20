import java.util.Scanner;
public class ArrayExample2
{

	public static void main(String[] args) 
	{

		
		String[] subject = {"c++","java","python","dbt"};
		

		System.out.println("using for loop");
		
		for(int i =0; i<subject.length;i++)
		{
		   System.out.println(subject[i]);
		}

		System.out.println("for each");
		
		
		for(  String obj :subject)
		{
			System.out.println(obj.toUpperCase() + " "+ obj.length());
		}
		
		
		
	} 
	
	
	
}
