import java.io.*;
import java.util.*;
import java.lang.*;
public class HashMap_DSA 
{
	public static void main(String args[])throws IOException
	{
		HashMap<String,Integer> hp=new HashMap<>();
		String s="abcde";
		for(int i=0;i<s.length();i++)
		{
			//hp.put(String.format("%s",s.charAt(i)),((i+1)*10));
			hp.put(Character.toString(s.charAt(i)),((i+1)*10));
		}
		for(String key:hp.keySet())
			System.out.print(key+" ");
		System.out.println();
		for(int val:hp.values())
			System.out.print(val+" ");
		System.out.println();
		for(String key:hp.keySet())
		{
			int val=hp.get(key);
			System.out.print("{"+key+":"+val+"} ");
		}
		System.out.println();
		
		boolean containkey=hp.containsKey("b");
		System.out.println(containkey);
		boolean containval=hp.containsValue(3);
		
		for(Map.Entry<String, Integer> es : hp.entrySet())
		{
			if(es.getKey().equals("a"))
			{
				es.setValue(100);
			}
		}
		for(Map.Entry<String, Integer> es: hp.entrySet())
		{
			System.out.print("{"+es.getKey()+":"+es.getValue()+"} ");
		}
		System.out.println();
	}
}
