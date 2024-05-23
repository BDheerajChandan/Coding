import java.io.*;
import java.util.*;
class ComputeSalary
{
    public void calculateSalary(double sal)
    {
        double salary;
        if(sal>=1 && sal<10000)
        {
            salary=sal*1.0;
        }
        else if(sal>=10000 && sal<25000)
        {
            salary=(10000*1.0)+((sal-10000)*3.0);
        }
        else if(sal>=25000 && sal<50000)
        {
            salary=(10000*1.0)+(25000*3.0)+((sal-25000)*5.0);
        }else{
            salary=(10000*1.0)+(25000*3.0)+(50000*5.0)+((sal-50000)*7.0);
        }
        System.out.println(salary);
    }
}
class Employee_3 extends ComputeSalary
{
    public void calculateSalary()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the Employee salary :");
        double salary=sc.nextDouble();
        System.out.print("Employee salary : ");
        super.calculateSalary(salary);
        System.out.println("*******************************************");
    }   
}
class Manager extends ComputeSalary
{
    public void calculateSalary()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the Manager salary :");
        double salary=sc.nextDouble();
        System.out.print("Manager salary : ");
        super.calculateSalary(salary);
        System.out.println("*******************************************");
    }
}
class Engineer extends ComputeSalary
{
    public void calculateSalary()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the Engineers salary :");
        double salary=sc.nextDouble();
        System.out.print("Engineers salary : ");
        super.calculateSalary(salary);
        System.out.println("*******************************************");
    }
}
public class SalaryMain
{
    public static void main(String args[])
    {
        Employee_3 Em=new Employee_3();
        Manager m=new Manager();
        Engineer En=new Engineer();
        Em.calculateSalary();
        m.calculateSalary();
        En.calculateSalary();
    }   
}