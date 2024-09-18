//use of constructor method
import java.io.*;
import java.lang.*;
class employed              //creating a class employed 
{
    private String empname;
    private String address;
    private String city;
    public double salary;
    private double grosspay;
    private double da, hra,pf,netpay;
                             //class constructor
   employed()
    {
    empname = "RITIEK MALHOTRA";
    address= "6406, Jalvayu Vihar";
    city="Panchkula-Haryana";
    salary= 4670;
    }
    public void outputdata()
    {
    System.out.println("=================================================");
    System.out.println("Name of Employee :::" +empname);
    System.out.println("Address :::" +address);
    System.out.println("City :::" +city);
    System.out.println("Basic Pay :::" +salary);
    }     
    public void calculateda(employed x)
    {
    
    da = 0.35 *salary;
    System.out.println("DA = " +da);
    }
   public void calculatehra(employed x)
    {
    hra = 0.1*salary;           
    System.out.println("HRA =" +hra);
    }
    public void pfdeduction(employed x)
    {
    pf = 0.12*salary;
    System.out.println("PF Deduction =" +pf);
            }
    public void calculategross(employed x)
    {
    grosspay = salary+hra+da;
    System.out.println("Gross Salary of Employee =" +grosspay);
    } 
    public void calculatenetpay(employed x)
    {
    netpay = grosspay-pf;
    System.out.println("Net Pay of Employee =" +netpay);
    }                                           
    }
    class Ever53
    {
    public static void main(String args[]) throws IOException
    {
    employed employee = new employed();
                        //passing value by pass-by-reference
    employee.outputdata();
    employee.calculateda(employee);
    employee.calculatehra(employee);
    employee.calculategross(employee);
    employee.pfdeduction(employee);
    employee.calculatenetpay(employee);
        }                       
    }                        