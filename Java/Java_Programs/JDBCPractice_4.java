import java.sql.*;
import java.io.*;
import java.util.*;
public class JDBCPractice_4
{
    public static void main(String args[])throws IOException,SQLException,ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:cdac","dbda","cdacacts");
        Statement stm=con.createStatement();
        String q1="select Employeeid,Name from employee_1";
        String q2="select Employeeid,Name from employee_1 where Employeeid>?";
        PreparedStatement ps1=con.prepareStatement(q2);
        String q3="insert into employee_1(Employeeid,Name) values(10,\"Dheeraj\")";
        String q4="delete from employee_1 where Employeeid=?";
        PreparedStatement ps2=con.prepareStatement(q4);
        
        System.out.println("\tSELECT QUERY - CREATE STATEMENT");
        ResultSet res1=stm.executeQuery(q1);
        while(res1.next())
        {
            System.out.println(res1.getInt(1)+" "+res1.getString(2));
        }
        System.out.println("\tSELECT QUERY - PREPARED STATEMENT");
        int eid1=7;
        ps1.setInt(1,eid1);
        ResultSet res2=ps1.executeQuery();
        while(res2.next())
        {
            System.out.println(res2.getInt(1)+" "+res2.getString(2));
        }
        System.out.println("\tINSERT QUERY - CREATE STATEMENT");
        int cnt2=stm.executeUpdate(q3);
        System.out.println("Changes Done : "+cnt2);
        ResultSet res3=stm.executeQuery(q1);
        while(res3.next())
        {
            System.out.println(res3.getInt(1)+" "+res3.getString(2));
        }
        System.out.println("\tDELETE QUERY - PREPARED STATEMENT");
        int eid2=10;
        ps2.setInt(1,eid2);
        int cnt3=ps2.executeUpdate();
        System.out.println("Changes Done : "+cnt2);
        ResultSet res4=stm.executeQuery(q1);
        while(res4.next())
        {
            System.out.println(res4.getInt(1)+" "+res4.getString(2));
        }
    }
}