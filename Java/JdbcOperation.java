import java.io.*;
import java.util.*;
import java.sql.*;
public class Jdbc 
{
	public static void main(String[] args)throws IOException, SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbda","root","cdacacts");
		
		System.out.println("PREPARED STATEMENTS");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter employee ID number : ");
		int Numid=3;  //sc.nextInt();
		
		String q1="select eid,ename from employee where eid=?";
		PreparedStatement ps=con.prepareStatement(q1);
		
		ps.setInt(1, Numid);
		
		ResultSet res=ps.executeQuery();
		while(res.next())
		{
			System.out.println(res.getInt(1)+" "+res.getString(2));
		}
		
		/*
											System.out.println("\t\tSELECT");
		System.out.println("******************************************************************************************");
		Statement stm=con.createStatement();
		String q1="select eid,ename from employee";
		ResultSet res=stm.executeQuery(q1);
		while(res.next())
		{
			System.out.println(res.getInt(1)+" "+res.getString(2));
		}
		*/
		
		/*
											System.out.println("\t\tDELETE");
		System.out.println("******************************************************************************************");
		Statement stm=con.createStatement();
		String q1="delete from employee where eid=11";
		int cntChange=stm.executeUpdate(q1);
		System.out.println("Number of changes : "+cntChange);
		String q2="select eid,ename,deptname from employee";
		ResultSet res=stm.executeQuery(q2);
		while(res.next())
		{
			System.out.println(res.getInt(1)+" "+res.getString(2)+"\t"+res.getString(3));
		}
		*/
		
		/*
											System.out.println("\t\tINSERT");
		System.out.println("******************************************************************************************");
		Statement stm=con.createStatement();
		String q1="insert into employee(eid,ename,deptname,salary) values(11,\"Surya\",\"Finance\",30000)";
		int cntChange=stm.executeUpdate(q1);
		System.out.println("Number of changes : "+cntChange);
		String q2="select eid,ename,deptname from employee";
		ResultSet res=stm.executeQuery(q2);
		while(res.next())
		{
			System.out.println(res.getInt(0)+" "+res.getString(1)+" "+res.getString(2));
		}
		*/
		
		/*
											System.out.println("\t\tUPDATE");
		System.out.println("******************************************************************************************");
		Statement stm=con.createStatement();
		String q1="update employee set ename=\"Ramesh\" where ename=\"Ram\"";
		int cntChange=stm.executeUpdate(q1);
		System.out.println("Number of changes : "+cntChange);
		String q2="select eid,ename from employee";
		ResultSet res=stm.executeQuery(q2);
		while(res.next())
		{
			System.out.println(res.getInt(1)+" "+res.getString(2));
		}
		*/
	}
}