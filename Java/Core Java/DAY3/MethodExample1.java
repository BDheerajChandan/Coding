
public class MethodExample1 
{

	public static int reversetheNumber(int num,String s)
	{
	       
			int rev =0;int reverse =0;
	        while(num!=0)
	        {
	        	        	       	
	        	rev = num%10;
	        	//System.out.println(num);
	        	
	        	reverse = reverse*10 +rev;
	        	num = num/10;
		      //  System.out.print(rev);
	        	
	        }
	        
	       return reverse;
	        //System.out.println(s+ " "+ reverse);
	        
	       
	        
		
	}
	
	public static void main(String[] args) 
	{
	
		int num = 1234;
		String s = "reverse";
		int result =reversetheNumber(num,s);
		System.out.println(result);
		//System.out.println(reversetheNumber(num,s));
		
		
		
	}

	
	
	
	
}
