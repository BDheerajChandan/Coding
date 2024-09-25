import java.io.*;
import java.util.*;
public class TryCatchFinal 
{
	public static void main(String args[])throws IOException,ArrayIndexOutOfBoundsException,ArithmeticException
	{
		int a=2;
		double d=16.0;
		int arr[]={1,2,3};
		try
		{
			//double res=d/0;
			//boolean res=(a%d==0);
			//System.out.println(res);
			System.out.println(arr[10]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic issue");
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println("Array Index Out Of Bounds Exception");
			System.out.println(aiob.getMessage());
		}
		finally
		{
			System.out.println("The end");
		}
	}
}
