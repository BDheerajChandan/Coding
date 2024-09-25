import java.io.*;
import java.util.*;
public class SwitchStatement 
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the choice : ");
		int ch=sc.nextInt(); 
		switch(ch)
		{
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default:
				System.out.println("Invalid choice");
				break;
		}
	}
}
