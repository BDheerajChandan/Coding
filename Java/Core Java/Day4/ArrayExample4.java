
public class ArrayExample4
{

	private static int[] createArray() 
	{
		
		int[] num = {10,45,20,40,12};
		
		return num;
	} 
	
	private static void displayArray(int[] num)
	{
		for(int n :num)
		{
			System.out.println(n);
				
		}
		
		
	}
	
	public static void main(String[] args) 
	{
	
		
		int[] num=createArray();
		displayArray(num);
		
		
		
	}



	

	
	
	
	
	
}
