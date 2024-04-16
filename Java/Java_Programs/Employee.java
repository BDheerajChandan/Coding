import java.io.*;
import java.util.*;
class Employee
{
    int SSN;
    String FirstName;
    String LastName;
    Employee(int SSN,String FirstName,String LastName)
    {
        this.SSN=SSN;
        this.FirstName=FirstName;
        this.LastName=LastName;
    }
    public void setSSN()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your SSN : ");
        SSN=sc.nextInt();
    }
    public void setFirstName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your First name : ");
        FirstName=sc.next();
    }
    public void setLastName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your last name : ");
        LastName=sc.next();
    }
    public void getSSN()
    {
        System.out.println("SSN : "+SSN);
    }
    public void getFirstName()
    {
        System.out.println("First Name : "+FirstName);
    }
    public void getLastName()
    {
        System.out.println("Last Name : "+LastName);
    }
    public void print()
    {
        
    }
}