import java.io.*;
import java.util.*;
import java.sql.*;
public class JDBCPractice_5
{
    public static void main(String args[])throws IOException,SQLException,ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","kiit");
        Statement stm1=con.createStatement();
        String q1="select Employeeid,Name from employee_1";
        ResultSet res1=stm1.executeQuery(q1);
        while(res1.next())
        {
            System.out.println(res1.getInt(1)+" "+res1.getString(2));
        }
        System.out.println("********************************************");
        String q2="select Employeeid,Name from employee_1 where Employeeid>?";
        PreparedStatement ps1=con.prepareStatement(q2);
        int id1=7;
        ps1.setInt(1,id1);
        ResultSet res2=ps1.executeQuery();
        while(res2.next())
        {
            System.out.println(res2.getInt(1)+" "+res2.getString(2));
        }
        System.out.println("********************************************");
        String q3="insert into employee_1(Employeeid,Name) values(10,\"Dheeraj\")";
        int cnt1=stm1.executeUpdate(q3);
        System.out.println("Number of changes : "+cnt1);
        ResultSet res3=stm1.executeQuery(q1);
        while(res3.next())
        {
            System.out.println(res3.getInt(1)+" "+res3.getString(2));
        }
        System.out.println("********************************************");
        String q4="update employee_1 set Name=\"Dheeraj Chandan\" where Employeeid=?";
        int id2=10;
        PreparedStatement ps2=con.prepareStatement(q4);
        ps2.setInt(1,id2);
        int cnt2=ps2.executeUpdate();
        System.out.println("Number of changes : "+cnt2);
        ResultSet res4=stm1.executeQuery(q1);
        while(res4.next())
        {
            System.out.println(res4.getInt(1)+" "+res4.getString(2));
        }
        System.out.println("********************************************");
        
        String q5="delete from employee_1 where Employeeid=?";
        PreparedStatement ps3=con.prepareStatement(q5);
        int id3=10;
        ps3.setInt(1,id3);
        int cnt3=ps3.executeUpdate();
        System.out.println("Number of changes : "+cnt3);
        ResultSet res5=stm1.executeQuery(q1);
        while(res5.next())
        {
            System.out.println(res5.getInt(1)+" "+res5.getString(2));
        }
        System.out.println("********************************************");
    }
}
