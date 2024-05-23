import java.io.*;
import java.util.*;
class Electricity_bill_2
{
    int cusnum;
    String cusname;
    double units;
    public void readData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter electricity bill details");
        System.out.println("Enter Customer number : ");
        cusnum=sc.nextInt();
        System.out.println("Enter Customer name : ");
        cusname=sc.next();
        System.out.println("Enter Units : ");
        units=sc.nextDouble();
    }
    public void computeBill()
    {
        double EBill;
        if(units>0  && units<=100)
        {
            EBill=units*1.2;
        }else if(units>100  && units<=300)
        {
            EBill=(100*1.20)+((units-100)*2.0);
        }else if(units>300  && units<=600)
        {
            EBill=(100*1.20)+(200*2.0)+((units-300)*3.0);
        }else{
            EBill=(100*1.20)+(200*2.0)+(300*3.0)+((units-600)*5.0);
        }
        System.out.println(EBill);
    }
    /*public static void main(String args[])throws IOException
    {
        Electricity_bill_2 eb=new Electricity_bill_2();
        eb.readData();
        eb.computeBill();
    }*/
}    