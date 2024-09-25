import java.io.*;
import java.sql.*;
import java.util.*;

class test_1
{
	public static void main(String args[])throws IOException,SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","kiit");
		
		Statement st=con.createStatement();
		String q1="select Name,Salary from employee_1";
		ResultSet res1=st.executeQuery(q1);
		while(res1.next())
		{
			System.out.println(res1.getString(1)+" : "+res1.getDouble(2));
		}
		System.out.println();
		
		String q2="select Employeeid,Name,Salary from employee_1 where Employeeid>?";
		PreparedStatement ps=con.prepareStatement(q2);
		ps.setInt(1, 6);
		ResultSet res2=ps.executeQuery();
		while(res2.next())
		{
			System.out.println(res2.getInt(1)+" : "+res2.getString(2)+" : "+res2.getDouble(3));
		}
		System.out.println();
		String q3="call del_1()";
		CallableStatement cs=con.prepareCall(q3);
		ResultSet res_3=cs.executeQuery();
		while(res_3.next())
		{
			System.out.println(res_3.getInt(1));
		}
		
	}
}