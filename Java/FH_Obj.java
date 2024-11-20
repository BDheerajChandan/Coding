import java.io.*;
import java.util.*;
public class FH_Obj 
{
	public static void main(String args[])throws IOException, ClassNotFoundException
	{
			ArrListEmployee ae1=new ArrListEmployee(30,"Dheeraj");
			ArrListEmployee ae2=new ArrListEmployee(8,"Chandan");
			ArrListEmployee ae3=new ArrListEmployee(5,"Ramesh");
			String filename="FileExample.txt";
			
			FileOutputStream fo=new FileOutputStream(filename);
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(ae1);
			oo.writeObject(ae2);
			oo.writeObject(ae3);
			oo.close();
			
			FileInputStream fi=new FileInputStream(filename);
			ObjectInputStream oi=new ObjectInputStream(fi);
			ArrListEmployee ae=(ArrListEmployee)oi.readObject();
			ae.display();
	}	
}