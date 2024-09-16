import java.io.*;
public class ConditionStatements 
{
	public static void main(String args[])throws IOException
	{
		int num_1=2004;
		if(num_1%2==0)
		{
			System.out.println("Number "+num_1+" divisible by "+2);
		}
		
		//System.out.println();
		int age=20;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}else{
			System.out.println("Not eligible to vote");
		}
		
		//System.out.println();
		int a=1,b=2,c=0;
		System.out.print("Largest of "+a+","+b+","+c+" : ");
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>a &&b>c)
		{
			System.out.println(b);
		}
		else if(c>a &&c>b)
		{
			System.out.println(c);
		}
	}
}
