
public class Person 
{

	int id;
	String name;
	String add;
	
	
	public Person(int id, String name, String add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}



	void dispPerson()
	{
		System.out.print(id+name+add);
	}
	
	
	
}
