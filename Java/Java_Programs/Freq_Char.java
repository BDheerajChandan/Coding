import java.io.*;
import java.util.*;
import java.lang.*;
class Freq_Char
{
	public static void main(String args[])throws IOException
	{
		String s="abbcccadeaa";
		System.out.println("Original String : "+s);
		StringBuilder str=new StringBuilder();
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(str.toString().indexOf(ch)==-1)
			{
				str.append(ch);
			}
		}
		System.out.println("After Removing Duplicates : "+str);
		int c;
		for(int i=0;i<str.length();i++)
		{
			c=0;
			ch=str.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					c++;
				}					
			}
			System.out.println(ch+" : "+c);
		}
	}
}