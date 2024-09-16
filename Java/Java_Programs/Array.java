import java.io.*;
import java.util.*;
public class Array
{
	public static void main(String args[])throws IOException
	{
		String s_1="Dheeraj";
		int arr_1D_1[]=new int[5];
		int arr_1D_2[]=new int[5];
		int arr_2D[][]=new int[3][3];
		String s_1D_1[]=new String[5];
		String s_1D_2[]=new String[5];
		String s_2D[][]=new String[3][3];
		for(int i=0;i<arr_1D_1.length;i++)
		{
			arr_1D_1[i]=(i+1)*10;
			s_1D_1[i]=Character.toString(s_1.charAt(i));
		}
		for(int i=0;i<arr_1D_1.length;i++)
		{
			arr_1D_2[i]=arr_1D_1[i];
			//System.out.println(arr_1D_2[i]+","+s_1D[i]);
		}
		for(int i=0;i<arr_1D_1.length;i++)
		{
			System.out.println(arr_1D_1[i]+","+arr_1D_2[i]);
		}
		System.out.println(arr_1D_1.equals(arr_1D_2));
		System.out.println(Arrays.equals(arr_1D_1,arr_1D_2));
		for(int i=0;i<arr_1D_1.length;i++)
		{
			s_1D_2[i]=String.valueOf(arr_1D_1[i]);
		}
		for(int i=0;i<arr_1D_1.length;i++)
		{
			//int res=s_1D_1[i];
			System.out.println(s_1D_2[i]);
		}		
	}
}