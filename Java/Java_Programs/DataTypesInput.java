import java.io.*;
import java.util.*;
public class DataTypesInput 
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		boolean bool_1,bool_2;
		char ch_1,ch_2;
		int num_1,num_2;
		long lnum_1,lnum_2;
		float fnum_1,fnum_2;
		double dnum_1,dnum_2;
		
		System.out.print("Boolean input : ");
		bool_1=sc.nextBoolean();
		System.out.print("Character input : ");
		ch_1=sc.next().charAt(0);
		System.out.print("Integer input : ");
		num_1=sc.nextInt();
		System.out.print("Long input : ");
		lnum_1=sc.nextLong();
		System.out.print("Float input : ");
		fnum_1=sc.nextFloat();
		System.out.print("Double input : ");
		dnum_1=sc.nextDouble();
		System.out.println();
		
		System.out.println("Boolean value : "+bool_1);
		System.out.println("Character value : "+ch_1);
		System.out.println("Integer value : "+num_1);
		System.out.println("Long value : "+lnum_1);
		System.out.println("Float value : "+fnum_1);
		System.out.println("Double value : "+dnum_1);
	}
}