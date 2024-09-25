import java.io.*;
import java.util.*;
public class Strings
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		String s="   Hi I am Dheeraj  ";
		String trimString=s.trim();
		System.out.println("Trimmed string : "+trimString);
		String ToUpperString=s.toUpperCase();
		System.out.println("String uppercase : "+ToUpperString);
		String ToLowerString=s.toLowerCase();
		System.out.println("String lowercase : "+ToLowerString);
		String ReplaceString=s.replace("Dheeraj","Chandan");
		System.out.println("Replaceed string : "+ReplaceString);
		int len=s.length();
		System.out.println("Length of string : "+len);
		int indexpos=s.indexOf("D");
		System.out.println("Index position of \"D\" "+indexpos);
		
		boolean starts_1=s.startsWith("a");
		boolean starts_2=s.trim().startsWith("Hi");
		System.out.println(starts_1+" , "+starts_2);
		
		boolean starts_3=s.endsWith("Hi");
		boolean starts_4=s.trim().endsWith("raj");
		System.out.println(starts_3+" , "+starts_4);
		
		System.out.println("Hi\tI am Dheeraj\bfrom \n\\ \"Odisha\". ");
	}
}
