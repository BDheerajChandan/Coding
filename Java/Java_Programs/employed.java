//use of private and public access method using pass-by-reference
import java.io.*;
import java.lang.*;
class employed
{
    private String empname;
    private String address;
    private String city;
    public double salary;
    double grosspay;
    double da, hra,pf,netpay;
      
    {
    empname = a;
    address=b;
    city=c;
    salary=value;
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
    
    da = 1.5 *salary;
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
    class calculation
    {
    public static void main(String args[]) throws IOException
    {
    employed employee = new employed();
    employee.inputdata("Ram Shankar ", "1435/1", "Lucknow",8000 );
    employee.outputdata();
    
    
                    //Now Passing the reference of employee object.
    employee.calculateda(employee);
    employee.calculatehra(employee);
    employee.calculategross(employee);
    employee.pfdeduction(employee);
    employee.calculatenetpay(employee);
    }
    }                               
                                        