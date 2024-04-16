import java.io.*;
import java.util.*;
class HourlyEmployee extends Employee
{
    double Salary;
    HourlyEmployee(int SSN,String FirstName,String LastName,double Salary)
    {
        super(SSN,FirstName,LastName);
        this.Salary=Salary;
    }
    public void setSalary()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your hourly Salary : ");
        Salary=sc.nextDouble();
    }
    public void computeGrossPay()
    {
        
    }
    public void computeNetPay()
    {
        
    }
    public void getSalary()
    {
        System.out.println("Hourly salary : "+Salary);
    }
    public void print()
    {
    }
}