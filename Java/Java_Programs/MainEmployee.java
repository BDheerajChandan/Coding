import java.io.*;
import java.util.*;
class MainEmployee
{
    public static void main(String args[])
    {
        int SSN=0;
        String FirstName="";
        String LastName="";
        double Salary=0.0;
        Employee E=new Employee(SSN,FirstName,LastName);
        HourlyEmployee HE=new HourlyEmployee(SSN,FirstName,LastName,Salary);
        SalariedEmployee SE=new SalariedEmployee(SSN,FirstName,LastName,Salary);
        
        HE.setSSN();
        HE.setFirstName();
        HE.setLastName();
        HE.print();
        HE.setSalary();
        HE.computeGrossPay();
        HE.computeNetPay();
        HE.getSalary();
        HE.getFirstName();
        HE.getLastName();
        HE.print();
        System.out.println("*****************************************");
        
        SE.setSSN();
        SE.setFirstName();
        SE.setLastName();
        SE.print();
        SE.setSalary();
        SE.computeGrossPay();
        SE.computeNetPay();
        SE.getSalary();
        SE.getFirstName();
        SE.getLastName();
        SE.print();
        System.out.println("*****************************************");
    }
}