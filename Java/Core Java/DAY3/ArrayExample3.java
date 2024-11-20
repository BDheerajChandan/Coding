
public class ArrayExample3 
{

	
	private static int findsumofArrayElements(int[] n)
	{
		int sum = 0;
		for(int i =0; i<n.length;i++)
		{
		   sum = sum+n[i];
		}
		
		n[2]= 100;
		return sum;
	}
	
	
	public static void main(String[] args) 
	{
	
		int[] num = {10,20,30,40};
		System.out.println("before pass");
		for(int i =0; i<num.length;i++)
		{
		   System.out.println(num[i]);
		}
		
		int sum = findsumofArrayElements(num);
		System.out.println("sum of array element is" + " "+sum);
		
		System.out.println("after pass");
		for(int i =0; i<num.length;i++)
		{
		   System.out.println(num[i]);
		}
		
	}

	
	
	
}
