import java.io.*;
import java.util.*;
import java.lang.*;
public class Queue_DSA 
{
	public static void main(String args[])throws IOException
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(Integer i=10;i<=50;i=i+10)
		{
			pq.add(i);
		}
		for(Integer i:pq)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		boolean containele=pq.contains(10);
		System.out.println(containele);
		boolean queuestatus_before=pq.isEmpty();
		System.out.println(queuestatus_before);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		for(Integer i:pq)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		pq.remove(20);
		for(Integer i:pq)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int len=pq.size();
		System.out.println(len);
		
		//pq.toArray();
		//pq.toString();
		pq.clear();
		for(Integer i:pq)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		boolean queuestatus_after=pq.isEmpty();
		System.out.println(queuestatus_after);
	}
}
