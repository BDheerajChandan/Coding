import java.io.*;
import java.util.*;
import java.lang.*;
public class ArrayList_DSA // add, isEmpty, remove, set, contains,indexOf
{
	public static void main(String args[])throws IOException
	{
		ArrayList<Integer> al=new ArrayList<>();
		boolean Arrlistempty_before=al.isEmpty();
		System.out.println(Arrlistempty_before);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		boolean Arrlistempty_after=al.isEmpty();
		System.out.println(Arrlistempty_after);
		for(int i:al)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		al.remove(Integer.valueOf(10));
		for(int i:al)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		al.set(0,10);
		for(int i:al)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		boolean elecontain=al.contains(10);
		System.out.println(elecontain);
		int position=al.indexOf(20);
		System.out.println(position);
	}	
}