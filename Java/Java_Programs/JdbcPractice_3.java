import java.io.*;
import java.util.*;
import java.sql.*;
public class JdbcPractice_3
{
    public static void main(String args[])throws SQLException,IOException,ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","dbda","cdacacts");
        String q1="select Employeeid,Name from employee_1 where Employeeid>? and Employeeid<?";
        PreparedStatement ps=con.prepareStatement(q1);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first id : ");
        int eid_1=sc.nextInt();
        System.out.print("Enter the first id : ");
        int eid_2=sc.nextInt();
        ps.setInt(1,eid_1);
        ps.setInt(2,eid_2);
        //int cnt=ps.executeUpdate();
        ResultSet res=ps.executeQuery();
        while(res.next())
        {
            System.out.println(res.getInt(1)+" "+res.getString(2));
        }
    }
}

















        /*String q2="insert into employee_1(Employeeid,Name) values(10,\"Dheeraj\")";
        int cnt_1=stm.executeUpdate(q2);
        System.out.println("Number of changes : "+cnt_1);
        String q3="select Employeeid,Name from employee_1";
        ResultSet res2=stm.executeQuery(q3);
        while(res2.next())
        {
            System.out.println(res2.getInt(1)+" "+res2.getString(2));
        }
        /*String q1="select Employeeid,Name from employee_1";
        ResultSet res=stm.executeQuery(q1);
        while(res.next())
        {
            System.out.println(res.getInt(1)+" "+res.getString(2));
        }
    }
}*/

