//Nesting of Classes with Methods
import java.io.*;
import java.lang.*;
class emp
{
    private String empname;
    private String address;
    private String city;
    emoluments emo  = new emoluments();    //Creating another nested class 
                                            //emolulments
                                            
    class emoluments
    {
    public double salary;
    public double grosspay;
    public double da, hra,pf,netpay;
    }                                       //End of Inner class                          
   
    //Now Receving Values from main() 
    void inputdata(String a, String b, String c,double value)
    {
    empname = a;
    address=b;
    city=c;
    emo.salary=value;                       //using class object
    }
    public void outputdata()
    {
    System.out.println("================================================");
    System.out.println("Name of Employee :::" +empname);
    System.out.println("Address :::" +address);
    System.out.println("City :::" +city);
    System.out.println("Basic Pay :::" +emo.salary);
    }
          
    public void calculateda()
    {
    
    emo.da = 1.5 *emo.salary;
    System.out.println("DA = " +emo.da);
    }
   public void calculatehra()
    {
    emo.hra = 0.1*emo.salary;           
    System.out.println("HRA =" +emo.hra);
    }
    public void pfdeduction()
    {
    emo.pf = 0.12*emo.salary;
    System.out.println("PF Deduction =" +emo.pf);
            }
    public void calculategross()
    {
    emo.grosspay = emo.salary+emo.hra+emo.da;
    System.out.println("Gross Salary of Employee =" +emo.grosspay);
    }
    
   public void calculatenetpay()
    {
    emo.netpay = emo.grosspay-emo.pf;
    System.out.println("Net Pay of Employee =" +emo.netpay);
    }                                           
    }
    class Ever50
    {
    public void main()
    {
    emp employee = new emp();
    employee.inputdata("Ram Shankar ", "1435/1", "Lucknow",8000 );
    employee.outputdata();
                    //Now Passing the value of employee object.
    employee.calculateda();
    employee.calculatehra();
    employee.calculategross();
    employee.pfdeduction();
    employee.calculatenetpay();
    }
    }                               
                                        
                                        
                                        
                                        
                                        
                                        