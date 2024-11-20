//   .contatins() ; 
import java.io.*;
import java.util.*;
public class ArrayListInteger
{
	ArrayList<Integer> num=new ArrayList<>();
	public void addElements()
	{
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
	}
	public void DiplayElements()
	{
		System.out.println("After adding an elements in Integer ArrayList : ");
		for(Integer i:num)
		{
			System.out.println(i);
		}
	}
	public void UpdatingElements()
	{
		System.out.println("After updating an element at index position of element in Integer ArrayList : ");
		num.add(60);
		int pos=num.indexOf(60);
		num.set(pos, 600); // To update the value at certain position
		for(Integer i:num)
		{
			System.out.println(i);
		}
	}
	public void RemovingElements()
	{
		int pos=num.indexOf(600);
		num.remove(pos); // To remove the value at certain position
		System.out.println("After removing an element at index position of element in Integer ArrayList : ");
		for(Integer i:num)
		{
			System.out.println(i);
		}
	}
	public void CheckingElements()
	{
		System.out.print("Checking for array element-50 in a ArrayList : ");
		System.out.println((num.contains(50)));
	}
	public static void main(String args[])
	{
		ArrayListInteger ali=new ArrayListInteger();
		ali.addElements();
		System.out.println("***********************************");
		ali.DiplayElements();
		System.out.println("***********************************");
		ali.UpdatingElements();
		System.out.println("***********************************");
		ali.RemovingElements();
		System.out.println("***********************************");
		ali.CheckingElements();
		System.out.println("***********************************");
		//System.out.println(Collections.sort(ali));
	}
}
