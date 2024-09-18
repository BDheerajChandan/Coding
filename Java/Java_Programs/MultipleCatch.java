import java.lang.*;
import java.io.*;
class MultipleCatch
{
	public static void main(String args[])
	{
	try
	{
	int number = args.length;
	System.out.println("The Number is = " +number);
	int value = 25/number;
	int ar[] = {1};
	ar[35] =99;
	}
	catch(ArithmeticException e)
	{
	System.out.println("Divide the Number by Zero" +e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("Array Object " +e);
	}
	System.out.println("After try/catch Blocks ");
	}
	}
	