import java.io.*;
import java.sql.*;
import java.time.*;
class Jdbc
{
    public static void main(String args[])throws IOException,EOFException,SQLException,ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","kiit");
        Statement stm=con.createStatement();
        String q="select Employeeid,Name from employee_1";
        ResultSet res=stm.executeQuery(q);
        while(res.next())
        {
            System.out.println(res.getInt(1)+" "+res.getString(2)+" "+LocalTime.now());
            //Time(1);
        }
    }
}