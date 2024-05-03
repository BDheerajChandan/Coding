import java.io.*;
import java.util.*;
import java.sql.*;
public class JdbcPractice_1
{
    public static void main(String args[])throws ClassNotFoundException,SQLException,IOException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:cdac","dbda","cdacacts");
        Statement stm=con.createStatement();
        System.out.println("\tSelete Statement");
        String q1="select Employeeid,Name,Salary from employee_1";
        ResultSet res1=stm.executeQuery(q1);
        while(res1.next())
        {
            System.out.println(res1.getInt(1)+" "+res1.getString(2)+" "+res1.getFloat(3));
        }
        System.out.println("**************************************************************");
        
        System.out.println("\tInsert Statement");
        String q2="insert into employee_1(Employeeid,Name) values(13,\"Balivada\")";
        int change=stm.executeUpdate(q2);
        System.out.println("Number of changes : "+change);
        String q3="select Employeeid,Name,Salary from employee_1";
        ResultSet res2=stm.executeQuery(q1);
        while(res2.next())
        {
            System.out.println(res2.getInt(1)+" "+res2.getString(2)+" "+res2.getFloat(3));
        }
        System.out.println("**************************************************************");
        
        System.out.println("\tUpdate Statement");
        String q4="update employee_1 set Name=\"Naveen\" where Employeeid=13";
        change=stm.executeUpdate(q4);
        System.out.println("Number of changes : "+change);
        String q5="select Employeeid,Name,Salary from employee_1";
        ResultSet res3=stm.executeQuery(q5);
        while(res3.next())
        {
            System.out.println(res3.getInt(1)+" "+res3.getString(2)+" "+res3.getFloat(3));
        }
        System.out.println("**************************************************************");
        
        System.out.println("\tDelete Statement");
        String q6="delete from employee_1 where Employeeid=13";
        change=stm.executeUpdate(q6);
        System.out.println("Number of changes : "+change);
        String q7="select Employeeid,Name,Salary from employee_1";
        ResultSet res4=stm.executeQuery(q7);
        while(res4.next())
        {
            System.out.println(res4.getInt(1)+" "+res4.getString(2)+" "+res4.getFloat(3));
        }
        System.out.println("**************************************************************");
        
        System.out.println("\tPrepared update Statement");
        String q8="update employee_1 set Experience=Experience+2 where Employeeid=?";
        System.out.print("Enter employee id number : ");
        Scanner sc=new Scanner(System.in);
        int idnum=sc.nextInt();
        PreparedStatement ps1=con.prepareStatement(q8);
        ps1.setInt(1,idnum);
        change=ps1.executeUpdate();
        System.out.println("Number of changes : "+change);
        String q9="select Employeeid,Name,Experience from employee_1";
        ResultSet res5=stm.executeQuery(q9);
        while(res5.next())
        {
            System.out.println(res5.getInt(1)+" "+res5.getString(2)+" "+res5.getInt(3));
        }
        System.out.println("**************************************************************");
        System.out.println("\tPrepared select Statement");
        PreparedStatement ps2=con.prepareStatement(q8);
        String q10="select Employeeid,Name from employee_1 where Employeeid>?";
        System.out.print("Enter employee id number : ");
        idnum=sc.nextInt();
        ps2.setInt(1,idnum);
        change=ps2.executeUpdate();
        System.out.println("Number of changes : "+change);
        String q11="select Employeeid,Name,Experience from employee_1";
        ResultSet res6=stm.executeQuery(q11);
        while(res6.next())
        {
            System.out.println(res6.getInt(1)+" "+res6.getString(2)+" "+res6.getInt(3));
        }        
        System.out.println("**************************************************************");
    }
}