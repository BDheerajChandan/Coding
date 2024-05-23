import java.io.*;
import java.util.*;
class Emp_1
{
    int empno;
    String empname;
    String designation;
    String dept;
    int salary;
    public void readEmpData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter employee details");
        System.out.println("Enter employee number ");
        empno=sc.nextInt();
        System.out.println("Enter employee name ");
        empname=sc.next();
        System.out.println("Enter employee designation");
        designation=sc.next();
        System.out.println("Enter employee department");
        dept=sc.next();
        System.out.println("Enter employee Salary");
        salary=sc.nextInt();
    }
    public void displayEmpData()
    {
        System.out.println("Employee number : "+empno);
        System.out.println("Employee name : "+empname);
        System.out.println("Employee designation : "+designation);
        System.out.println("Employee department : "+dept);
        System.out.println("Employee Salary : "+salary);
    }
    /*public static void main(String args[])throws IOException
    {
        Emp_1 e=new Emp_1();
        e.readEmpData();
        e.displayEmpData();
    }*/
}    