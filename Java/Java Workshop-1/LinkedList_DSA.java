import java.io.*;
import java.util.*;
public class LinkedList_DSA // add, addFirst, addLast, remove, removeFirstFirst, removeLast, contains, getFirst, getlastindexOf, isempty, lastIndexOf, pop,push
{
	public static void main(String args[])
	{
		LinkedList<Integer> ll=new LinkedList<>();
		for(Integer i=10;i<=50;i=i+10)
		{
			ll.add(i);
		}		
		for(Integer i:ll)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		ll.addFirst(0);
		ll.addLast(60);
		for(Integer i:ll)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		boolean checkele=ll.contains(60);
		System.out.println(checkele);
		int firstele=ll.getFirst();
		System.out.println(firstele);
		int lastele=ll.getLast();
		System.out.println(lastele);
		int position1=ll.indexOf(10);
		System.out.println(position1);
		boolean ListStatus=ll.isEmpty();
		System.out.println(ListStatus);
		ll.add(10);
		System.out.println("\n1 : ");
		for(Integer i:ll)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n2 : ");
		int position2=ll.lastIndexOf(10);
		System.out.println(position2);
		ll.pop();
		for(Integer i:ll)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n3 : ");
		ll.push(10);
		for(Integer i:ll)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		ll.remove(2);
		for(Integer i:ll)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n4 : ");
		ll.removeFirst();
		ll.removeLast();
		for(Integer i:ll)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		ll.set(0, 100);
		for(Integer i:ll)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
}
