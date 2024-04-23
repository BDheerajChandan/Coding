/*2) Employee Management System
    a) create Employee interface defining the calculateSalary() method.
    b) create a class called BaseEmployee  implements the Employee interface and serves as the base class for all types of employees.
    c) Manager and Programmer classes inherit from BaseEmployee and provide their own implementations of the calculateSalary() method based on 
        their specific roles.Both Manager and Programmer classes have constructors that initialize their attributes.
    d)Demonstrate the usage of these classes in EmployeeSystem class  by creating instances of Manager and Programmer objects and 
        displaying their information using the displayInfo(),finding their salary using calculateSalary method.
 */
import java.util.*;
import java.io.*;
interface Employee_3
{    
    public void calculateSalary();
}
class BaseEmployee implements Employee_3
{
    int ID;
    String name;
    float Sal;
    BaseEmployee(int ID,String name,float Sal)
    {
        this.ID=ID;
        this.name=name;
        this.Sal=Sal;
    }
    public void calculateSalary()
    {
        System.out.println("Calculate salary");
    }
    public void displayInfo()
    {
        System.out.println("ID : "+ID);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+Sal);
    }
}
class Manager_2 extends BaseEmployee
{
    Manager_2(int ID,String name,float Sal)
    {
        super(ID,name,Sal);
    }
    public void calculateSalary(float sal)
    {
        float TotSal=0;
        if(sal>0 && sal<=10000)
        {
            TotSal=sal+(float)(sal*0.01);
        }
        else if(sal>10000 && sal<=25000)
        {
            TotSal=sal+(float)(10000*0.01)+(float)((sal-10000)*0.03);
        }
        else if(sal>25000 && sal<=50000)
        {
            TotSal=sal+(float)(10000*0.01)+(float)(25000*0.03)+(float)((sal-25000)*0.05);
        }
        else
        {
            TotSal=sal+(float)(10000*0.01)+(float)(25000*0.03)+(float)(50000*0.05)+(float)((sal-50000)*0.07);
        }
        super.Sal=TotSal;
    }
    public void displayInfo()
    {
        System.out.println("Manager salary details : ");
        super.displayInfo();
        System.out.println("*******************************************************");
    }
}
class Programmer_2 extends BaseEmployee
{
    Programmer_2(int ID,String name,float Sal)
    {
        super(ID,name,Sal);
    }
    public void calculateSalary(float sal)
    {
        float TotSal=0;
        if(sal>0 && sal<=10000)
        {
            TotSal=sal+(float)(sal*0.01);
        }
        else if(sal>10000 && sal<=25000)
        {
            TotSal=sal+(float)(10000*0.01)+(float)((sal-10000)*0.02);
        }
        else if(sal>25000 && sal<=50000)
        {
            TotSal=sal+(float)(10000*0.01)+(float)(25000*0.02)+(float)((sal-25000)*0.03);
        }
        else
        {
            TotSal=sal+(float)(10000*0.01)+(float)(25000*0.02)+(float)(50000*0.03)+(float)((sal-50000)*0.04);
        }
        super.Sal=TotSal;
    }
    public void displayInfo()
    {
        System.out.println("Programmer salary details : ");
        super.displayInfo();
        System.out.println("*******************************************************");
    }
}
public class EmplyeeInerfaceMain
{
    public static void main(String args[])
    {
        int ID;
        String name;
        float sal;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the Manager's ID : ");
        ID=sc.nextInt();
        System.out.print("Please enter the Manager's Name : ");
        name=sc.next();
        System.out.print("Please enter the Manager's salary : ");
        sal=sc.nextFloat();
        Manager_2 m=new Manager_2(ID,name,sal);
        m.calculateSalary(sal);
        m.displayInfo();
        System.out.println("************************************************");
        System.out.print("Please enter the Programmer's ID : ");
        ID=sc.nextInt();
        System.out.print("Please enter the Programmer's Name : ");
        name=sc.next();
        System.out.print("Please enter the Programmer's salary : ");
        sal=sc.nextFloat();
        Programmer_2 p=new Programmer_2(ID,name,sal);
        p.calculateSalary(sal);
        p.displayInfo();
        System.out.println("************************************************");
    }
}
