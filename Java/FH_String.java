import java.io.*;
import java.lang.*;
import java.util.*;
public class FH_String 
{
	public static void main(String args[])throws IOException,ClassNotFoundException
	{
		String filename="\\FileExample.txt";
		FileWriter fw=new FileWriter(filename);
		String s="Hi I am Dheeraj , Course CDAC_DBDA";
		fw.write(s+"\n");	
		fw.close();
		FileReader fr=new FileReader(filename);
		BufferedReader br=new BufferedReader(fr);
		String str=br.readLine();
		System.out.println(str);	
		br.close();
		
	}
}