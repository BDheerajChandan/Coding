import java.sql.*;
import java.io.*;
public class SqlJdbc {
    public static void main(String[] args)throws SQLException,ClassNotFoundException
    {
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "kiit");
        System.out.println("Connected to database");
        System.out.println("Connection created!!");
        Statement stm=con.createStatement();
        String q1="select Employeeid,Name from Employee_1";
        ResultSet res=stm.executeQuery(q1);
        while(res.next())
        {
        	System.out.println(res.getInt(1)+" "+res.getString(2));
        }
        /*Connection con = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "kiit");
            System.out.println("Connected to database");
            System.out.println("Connection created!!");
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        }*/
    }
}
