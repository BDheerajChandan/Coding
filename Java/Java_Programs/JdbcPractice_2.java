import java.io.*;
import java.util.*;
import java.sql.*;
class JdbcPractice_2
{
    public static void main(String args[])throws IOException,SQLException,ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","kiit");
        Statement stm=con.createStatement();
        String q1="select Employeeid,Name from employee_1";
        ResultSet res=stm.executeQuery(q1);
        while(res.next())
        {
            System.out.println(res.getInt(1)+" "+res.getString(2));
        }
        System.out.println("*********************************************");
        String q2="delete from employee_1 where Employeeid=?";
        PreparedStatement ps=con.prepareStatement(q2);
        int eid=2;
        ps.setInt(1,eid);
        int cnt=ps.executeUpdate();
        String q3="select Employeeid,Name from employee_1";
        ResultSet res2=stm.executeQuery(q3);
        while(res2.next())
        {
            System.out.println(res2.getInt(1)+" "+res2.getString(2));
        }
    }    
}
