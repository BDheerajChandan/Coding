
public class ArrayExample3 
{

	
	private static void changeArrayElement(int[] num) 
	{
		System.out.println("inside change method");
		for(int i=0;i<num.length;i++)
		{
			num[i]= num[i]*2;
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		int[] num = {10,45,20,40,12};
		
		System.out.println("before change");
		
		for(int n :num)
		{
			System.out.println(n);
				
		}
		 
		changeArrayElement(num);
		
		System.out.println("after call change method");
		for(int n :num)
		{
			System.out.println(n);
				
		}
	}

	
	
	
}
