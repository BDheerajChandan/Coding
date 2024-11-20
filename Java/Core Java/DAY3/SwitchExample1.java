import java.util.Scanner;

public class SwitchExample1
{

	public static void insert() {
		System.out.println("insert record");
		
	}
	
	public static void update() {
		System.out.println("update record");
		
	}
	public static void delete() {
		System.out.println("delete record");
		
	}
	public static void disp() {
		System.out.println("disp record");
		
	}
	
	
	
	public static void main(String[] args) 
	{
	     int ch=0;
	     Scanner s = new Scanner(System.in);
	     
	    
			
	     
	     
	     
	while(true)
	{
	     System.out.println("1. insert");
	     System.out.println("2. update");
	     System.out.println("3. delete");
	     System.out.println("4. disp");
	     System.out.println("5. exit");
	     System.out.println("enter your choice");
	     ch = s.nextInt();
		switch(ch)
		{
		case 1: insert();
		break;
		case 2: update();
		break;
		case 3: delete();
		break;
		case 4: disp();
		break;
		case 5: System.exit(0);
			
		}
		
		
		
		
		
		
		
		
	}	
		
	}

	
}
