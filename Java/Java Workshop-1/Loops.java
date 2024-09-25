import java.io.*;
import java.util.*;
public class Loops 
{
	public static void main(String args[])throws IOException
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		int j=1;
		while(j<=5)
		{
			System.out.print(j+" ");
			j++; //j=j+1
		}
		
		System.out.println();
		int k=1;
		do
		{
			System.out.print(k+" ");
			k++;
		}while(k<=5);
		
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even : "+i);
			}else{
				System.out.println("Odd : "+i);
			}
		}
	}
}
