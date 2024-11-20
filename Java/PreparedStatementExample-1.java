import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementExample 
{


	private static void selectAllEmployee(Connection con) throws SQLException 
	{
		String q = "select * from emp";
		
		PreparedStatement pmt = con.prepareStatement(q);
		    ResultSet rs =pmt.executeQuery();
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt(1)+rs.getString(2)+rs.getFloat(6));
		    }
		
	}
	

	private static void searchEmployee(Connection con) throws SQLException 
	{
		String q = "select * from emp where empno = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		Scanner s = new Scanner(System.in);
		System.out.println("enter the empno");
		int no = s.nextInt();
		pmt.setInt(1, no);
	
		 ResultSet rs =pmt.executeQuery();
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt(1)+rs.getString(2)+rs.getFloat(6));
		    }
	}
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cdacacts");

		selectAllEmployee(con);
		searchEmployee(con);
		updateempsal(con);
		deleteemp(con);
		
		
		
		
		
	}






}
