import java.io.*;
import java.util.*;
public class Operators_Casting 
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer number : ");
		int num_1=12;//sc.nextInt();
		float f=(float)num_1;
		System.out.println("Integer to float : "+f);
		
		System.out.print("Enter a floating number : ");
		float fnum=12.5f;//sc.nextFloat();
		int n=(int)fnum;
		System.out.println("Float to integer : "+n);
		
		int a=3,b=7;
		double div=b/(double)a;
		float mult=a*b;
		System.out.println("Division : "+a+"/"+b+" = "+div);
		System.out.println("multiplication : "+a+" * "+b+" = "+mult);
		System.out.println();
		
		int num_2=5;
		int res_1=num_2++ + ++num_2;
		System.out.println(num_2+" : "+res_1);
		int res_2=num_2-- + --num_2;
		System.out.println(num_2+" : "+res_2);
		
		System.out.println();
		int age=2;
		int AgeToVote_1=(age>=18)?1:0;
		String AgeToVote_2=(age>=18)?"Eligible":"Not Eligible";
		System.out.println(AgeToVote_1+" : "+AgeToVote_2);
	}
}
