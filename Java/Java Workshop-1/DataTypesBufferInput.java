import java.io.*;
public class DataTypesBufferInput 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		
		boolean bool_1;
		char ch_1;
		int num_1;
		long lnum_1;
		float fnum_1;
		double dnum_1;
		
		System.out.print("Boolean input : ");
		bool_1=Boolean.parseBoolean(input.readLine());
		System.out.println("Character input : ");
		ch_1=input.readLine().charAt(0);
		System.out.println("Integer input : ");
		num_1=Integer.parseInt(input.readLine());
		System.out.println("Long input : ");
		lnum_1=Long.parseLong(input.readLine());
		System.out.println("Float input : ");
		fnum_1=Float.parseFloat(input.readLine());
		System.out.println("Double input : ");
		dnum_1=Double.parseDouble(input.readLine());
		
		System.out.println();
		
		System.out.println("Boolean value : "+bool_1);
		System.out.println("Character value : "+ch_1);
		System.out.println("Integer value : "+num_1);
		System.out.println("Long value : "+lnum_1);
		System.out.println("Float value : "+fnum_1);
		System.out.println("Double value : "+dnum_1);
	}
}
