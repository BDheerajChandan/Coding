import java.io.*;
import java.util.*;
class ArrListEmployee
{
	int id;
	String name;
	ArrListEmployee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println("\tID : "+id);
		System.out.println("\t\tName : "+name);
	}
}
//////////////////////////////////////////////////////////////////////////////////////////
class Sortbyid implements Comparator<ArrListEmployee>
{
	public int compare(ArrListEmployee o1, ArrListEmployee o2) 
	{
		if(o1.id>o2.id)
		{
			return 1;
		}else {
			return -1;
		}
	}
}
//////////////////////////////////////////////////////////////////////////////////////////
public class HashM 
{	
	public static void main(String[] args) 
	{
		ArrListEmployee ae1=new ArrListEmployee(30,"Dheeraj");
		ArrListEmployee ae2=new ArrListEmployee(8,"Chandan");
		ArrListEmployee ae3=new ArrListEmployee(5,"Ramesh");
		HashMap<Integer,ArrListEmployee> hm=new HashMap<>();
		hm.put(ae1.id,ae1);
		hm.put(ae2.id,ae2);
		hm.put(ae3.id,ae3);
		for(Map.Entry<Integer,ArrListEmployee> m:hm.entrySet())
		{
			System.out.println("KEYS : "+m.getKey()+" "); //  3 , 5, 8
			ArrListEmployee ae=m.getValue();
			System.out.print("VALUES : ");
			ae.display(); //                                                    
		}
		System.out.println("************************************************");
		ArrayList<ArrListEmployee> a=new ArrayList<>();
		a.add(ae1);
		a.add(ae2);
		a.add(ae3);
		
		Sortbyid so=new Sortbyid();
		Collections.sort(a,so);
		for(ArrListEmployee ars:a)
		{
			ars.display();
		}
	}
}