import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmpObjectExample
{

private static void writeEmpobject() throws IOException 
	
	{
		Employee e1 = new Employee(1001,"shan",3000);
		Employee e2 = new Employee(1002,"shan",3000);
		Employee e3 = new Employee(1003,"shan",3000);
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
					
		FileOutputStream fos = new FileOutputStream("dbda");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		
	}
			private static ArrayList<Employee> readallEmp() throws IOException, ClassNotFoundException 
		{
	
				FileInputStream fis = new FileInputStream("dbda");
				ObjectInputStream ois = new ObjectInputStream(fis);
				ArrayList<Employee>  al =(ArrayList<Employee>) ois.readObject();
				
				for(Employee e : al)
				{
					e.display();
				}
				return al;
		}

			
			private static void updatesal(ArrayList<Employee> al) {
				
				for(Employee e : al)
				{
					// do the logic
				}
			}
			
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	
		writeEmpobject();
		ArrayList<Employee> al =readallEmp();
		updatesal(al);
		
		
		
	}
	

	

	
	
	
}
