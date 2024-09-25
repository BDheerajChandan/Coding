import java.io.*;
import java.util.*;
public class BreakContinue 
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int s=0,i=0;
		while(i<5)
		{
			if(s<10)
			{
				s=s+i;
				System.out.print(s+" ");
				i++;
			}else{
				break;
			}
		}
		System.out.println();
		int a[]={1,2,3,4,5,6,7,8,9,10};
		for(int ele:a)
		{
			if(ele==3 || ele==7 ||ele==9)
			{
				continue;
			}else{
				System.out.print(ele+" ");
			}
		}
	}
}
