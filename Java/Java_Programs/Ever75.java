//Class Members visibility
import java.io.*;
import java.lang.*;
class emp
{
    private String empname;
    private String pfno;
    public long salary;
    void inputdata()
    {
    
    System.out.print ("Enter Name of Employee ::" );
    System.out.print("Enter PF No. of the Employee ::"  );
    System.out.print("Enter Basic Pay the Employee ::" );
    }
    public void outputdata()
    {
    System.out.println("=============================================");
    System.out.println("Name of Employee :::" +empname);
    System.out.println("PF No :::" +pfno);
    System.out.println("Basic Pay :::" +salary);
    System.out.println("D.A. :::" +(calculateda()));
    System.out.println("HRA :::" +(calculatehra()));
    System.out.println("Gross Pay :::" +(grosspay()));
    
    }
        
    private double calculateda()
    {
    
    return ((0.15 *salary));
    }
    private double calculatehra()
    {
    return ((0.01*salary));
    }
    private double grosspay()
    {
    return (salary +(0.15*salary)+(0.01*salary));
    }
    }
    class Ever75
    {
    public  static void main(String args[]) 
    {
    emp employee = new emp();
    employee.inputdata();
    employee.outputdata();
    
    }
    }
    