import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeObjectWrite 
{

	public static void main(String[] args) throws IOException 
	{
	
		Employee e1 = new Employee(1001,"nansthan",40000);
		Employee e2 = new Employee(1002,"shan",540000);
		Employee e3 = new Employee(1003,"Kiran",60000);
		
		FileOutputStream fo = new FileOutputStream("dbda2");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		oo.writeObject(e1);
		oo.writeObject(e2);
		oo.writeObject(e3);
		
		System.out.println("object write is over");
		fo.close();
		oo.close();
		
	} 
	
}
