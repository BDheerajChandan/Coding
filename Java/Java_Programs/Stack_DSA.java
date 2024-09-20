import java.util.*;
import java.lang.*;
import java.io.*;
public class Stack_DSA 
{
	public static void main(String args[])throws IOException
	{
		Stack<Integer> st=new Stack<>();
		for(Integer i=10;i<=50;i=i+10)
		{
			st.add(i);
		}
		for(Integer i:st)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		st.addElement(60);
		st.add(70);
		for(Integer i:st)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		boolean containele=st.contains(60);
		System.out.println(containele);
		int len=st.size();
		System.out.println(len);
		int posele=st.elementAt(1);
		System.out.println(posele);
		
		
		
		st.isEmpty();
		int firstele=st.firstElement();
		System.out.println(firstele);
		int pos=st.indexOf(20);
		System.out.println(pos);
		st.insertElementAt(100,0);
		boolean stackstatus=st.isEmpty();
		System.out.println(stackstatus);
		
		int lastele=st.lastElement();
		System.out.println(lastele);
		int lastpos=st.lastIndexOf(10);
		System.out.println(lastpos);
		//st.peak(1);
		int popnum=st.pop();
		System.out.println(popnum);
		for(Integer i:st)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		st.push(popnum);
		st.remove(st.indexOf(popnum));
		for(Integer i:st)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		st.set(1,1000);
		for(Integer i:st)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		st.size();
		int posSearch=st.search(30);
		System.out.println(posSearch);
		/*int arrInt[]=new int[st.size()];
		for(Integer i:st.toArray())
		{
			
		}
		int arrString[]=new int[st.size()];
		for(String i:st.toString())
		{
			
		}*/
		
		st.removeAllElements();
		for(Integer i:st)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		
	}
}
