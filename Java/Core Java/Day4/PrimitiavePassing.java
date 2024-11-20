
public class PrimitiavePassing 
{
	
	
	public static void changeAB(int c, int d)
	{
		c = 50;
		d = 100;
		
		System.out.println(c+ " "+d);
	}
	

	public static void main(String[] args) 
	{
	
		int a,b = 0;
		a = 10;b=20;
		System.out.println("before change");
		System.out.println(a +" "+ b);
		changeAB(a,b);
	
				
		System.out.println("after change");
		System.out.println(a +" "+ b);
	}

	
	
}
