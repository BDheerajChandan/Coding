/*for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

There are two ways to write the fibonacci series program in java:

Fibonacci Series without using recursion*/
import java.io.*;
import java.util.*;
public class Fibonacci13_2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range : ");
		int n=sc.nextInt();
		int a=0,b=1,c;
		System.out.print("\n"+a+", "+b);
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(", "+c);
			a=b;
			b=c;
		}
	}

}
