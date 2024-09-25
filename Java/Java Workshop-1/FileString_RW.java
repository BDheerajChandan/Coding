import java.io.*;
import java.util.*;
import java.lang.*;
public class FileString_RW 
{
	public static void main(String args[])throws IOException
	{
		FileWriter fw=new FileWriter("C:\\Users\\KIIT\\Desktop\\Java SelfWorkshop\\FileString.txt");
		fw.write("Writing data\nto a string\n\tdfd");
		fw.close();
		
		FileReader fr=new FileReader("C:\\Users\\KIIT\\Desktop\\Java SelfWorkshop\\FileString.txt");
		BufferedReader br=new BufferedReader(fr); 
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		fr.close();
		br.close();
	}
}
