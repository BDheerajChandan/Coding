
public class ArrayExample2 
{

	
	public static void findmax(int[] num) 
	{
		int max;
		System.out.println("find max");
		
		  max = num[0];
		for(int n :num)
		{
			if(n>max)
			{
				max = n;
			}
				
		}
		
		num[1]= 100;
		System.out.println("max value in the given array is " + max);
	}
	
	
	
	public static void main(String[] args) 
	{
	
		int[] num = {10,45,20,40,12};
	    
		findmax(num);
		
		System.out.println("after sorting");
		
		for(int n :num)
		{
			System.out.println(n);
				
		}
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
}
