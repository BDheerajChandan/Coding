import java.io.*;
import java.lang.*;
class emp
{
    private String empname;
    private String address;
    private String city;
    public double salary;
    void inputdata(String a, String b, String c,double value)
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
    }
    class derivedemp extends emp
    {
    double grosspay;
    double da, hra,pf,netpay;
    void calculateda()
    {
    
    da = 1.5 *salary;
    System.out.println("DA = " +da);
    }
    void calculatehra()
    {
    hra = 0.1*salary;           
    System.out.println("HRA =" +hra);
    }
    void pfdeduction()
    {
    pf = 0.12*salary;
    System.out.println("PF Deduction =" +pf);
            }
    void calculategross()
    {
    grosspay = salary+hra+da;
    System.out.println("Gross Salary of Employee =" +grosspay);
    }
    
    void calculatenetpay()
    {
    netpay = grosspay-pf;
    System.out.println("Net Pay of Employee =" +netpay);
    }                                           
    }
    class inherit
    {
    public  void main() 
    {
    derivedemp employee = new derivedemp();
    employee.inputdata("Ram Shankar ", "1435/1", "Lucknow",8000 );
    employee.outputdata();
    employee.calculateda();
    employee.calculatehra();
    employee.calculategross();
    employee.pfdeduction();
    employee.calculatenetpay();
    }
    }
                                        