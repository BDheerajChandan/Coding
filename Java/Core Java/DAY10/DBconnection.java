
public interface DBconnection
{

	 public void connectDB();
		
	
}


class Oracle implements DBconnection
{

	@Override
	public void connectDB() {
		
		System.out.println("Oracle with java connection is done");
		
	}
	
}
class Mysql implements DBconnection
{

	@Override
	public void connectDB() {
		
		System.out.println("Mysql with java connection is done");
		
	}
	
}

class MongoDb implements DBconnection
{

	@Override
	public void connectDB() {
		
		System.out.println("MongoDb with java connection is done");
		
	}
	
}




class Testinterface
{
	
	
	public static void main(String[] args) 
	{
		
		
		MongoDb o = new MongoDb();
		o.connectDB();
			
		
	}
	
	
}
