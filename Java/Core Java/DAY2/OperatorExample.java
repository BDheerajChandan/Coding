
public class OperatorExample 
{

	
	public static void main(String[] args) 
	{
	
		//unary operator
		
		int a,b,c;
		a=10;
		
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		
		a=10;
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);
		
		a = 0;
		b = 0;
		c = 0;
		
		c= ++a + b++ + a++; 
		System.out.println(c);
		
		a = 10;
		b = 20;
		//Arithmetic
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
	// relational operator
		System.out.println("relational operator");
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		boolean res = (a>b);
		
		if(res)
		{
		System.out.println("a is big");
		}
		else
		{
		  System.out.println("b is big");
		}		
		
		
		//logical operator
		
		// && 
		// ||
		
		int labmark =10;
		int cceemark = 40;
		
		System.out.println(labmark>16 && cceemark>16);
		
		res  = labmark>16 && cceemark>16;
		
		if(labmark>16 && cceemark>16)
		{
		System.out.println("pass");
		}
		else
		{
		  System.out.println("fail");
		}	
		
		
		//ternary operator
		
		String max = (a>b)? "a is big" :" b is big";
		System.out.println(max);
		
		System.out.println((a>b)? "a is big" :" b is big");
		
		
	}
	
	
}
