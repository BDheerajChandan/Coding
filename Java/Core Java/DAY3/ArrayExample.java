import java.util.Scanner;

public class ArrayExample
{

	public static void main(String[] args) 
	{
	
		int[] num = new int[4];
		
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
		Scanner s = new Scanner(System.in);
	     System.out.println("enter the array element");
		
		for(int i =0; i<num.length;i++)
		{
		   num[i]= s.nextInt();
		   
		 }

		for(int i =0; i<num.length;i++)
		{
		   System.out.println(num[i]);
		}

	} 
	
}
