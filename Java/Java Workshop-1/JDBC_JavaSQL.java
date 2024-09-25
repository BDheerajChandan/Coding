import java.io.*;
import java.util.*;
import java.lang.*;
import java.sql.*;
public class JDBC_JavaSQL 
{
	public static void main(String args[])throws IOException,SQLException,ClassNotFoundException
	{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","kiit");

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","kiit");
		
		Statement st=con.createStatement();
		String q1="select Employeeid,Name,Salary from employee_1";
		ResultSet res1=st.executeQuery(q1);
		while(res1.next())
		{
			System.out.println(res1.getInt(1)+" "+res1.getString(2)+" "+res1.getDouble(3));
		}
		System.out.println("\n");
		String q2="select Employeeid,Name,Salary from employee_1 where Employeeid<? and Salary>?";
		PreparedStatement ps=con.prepareStatement(q2);
		ps.setInt(1, 9);
		ps.setDouble(2, 50000);
		ResultSet res2=ps.executeQuery();
		while(res2.next())
		{
			System.out.println(res2.getInt(1)+" "+res2.getString(2)+" "+res2.getDouble(3));
		}
		System.out.println();
		String q3="insert into employee_1(Name,Salary) values(\"A\",10),(\"B\",20)";
		int insertcount=st.executeUpdate(q3);
		System.out.println(insertcount+"\n");
		ResultSet res3=st.executeQuery(q1);
		while(res3.next())
		{
			System.out.println(res3.getInt(1)+" "+res3.getString(2)+" "+res3.getDouble(3));
		}
	    System.out.println();
		CallableStatement ct1=con.prepareCall("call del_1()");
		int delcnt1=ct1.executeUpdate();
		System.out.println(delcnt1);
		ResultSet res4=st.executeQuery(q1);
		while(res4.next())
		{
			System.out.println(res4.getInt(1)+" "+res4.getString(2)+" "+res4.getDouble(3));
		}
		System.out.println();
		
		CallableStatement ct2=con.prepareCall("call del_2(?)");
		ct2.setString(1, "B");
		int delcnt2=ct2.executeUpdate();
		System.out.println(delcnt2);
		ResultSet res5=st.executeQuery(q1);
		while(res5.next())
		{
			System.out.println(res5.getInt(1)+" "+res5.getString(2)+" "+res5.getDouble(3));
		}
		
	}
}
