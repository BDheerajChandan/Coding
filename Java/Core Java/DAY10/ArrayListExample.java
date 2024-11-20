import java.util.ArrayList;

public class ArrayListExample
{

	public static void main(String[] args) 
	{
	
		ArrayList<Integer>  al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		
		for(int ele :al)
		{
			System.out.println(ele);
		}
		
		//update
		System.out.println("after insert in pos");
		al.add(3,200);
		
		for(int ele :al)
		{
			System.out.println(ele);
		}
		
		System.out.println("after update");
		al.set(3, 500);
		
		for(int ele :al)
		{
			System.out.println(ele);
		}
		
		System.out.println("after delete");
		
		al.remove(3);
		
		for(int ele :al)
		{
			System.out.println(ele);
		}
		
		
		
		
	}
	
}
