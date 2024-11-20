
public class Stu extends Person
{

	int mark;
	
	public Stu(int id, String name, String add, int mark) {
		super(id, name, add);
		this.mark = mark;
	}
	
	void dispStudent()
	{    super.dispPerson();
		System.out.println(mark);
	}
	
	
	
}
