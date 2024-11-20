
public class TestStudent

{

	
	public static void main(String[] args) 
	{
	    
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		System.out.println("enter first object data");
		s1.readStudent();		
		s1.displayStudent();
		s1.findresult();
				
		System.out.println("enter Second object data");
		s2.readStudent();
		s2.displayStudent();
		s2.findresult();	
				
		System.out.println("enter third object data");
		s3.readStudent();
		s3.displayStudent();
		s3.findresult();
		
		
		
	}
	
	
}
