import java.io.*;
import java.util.*;
public class BankAccount
{
    int acountnumber;
    double totalbalance;
    BankAccount(int acountnumber,double totalbalance)
    {
        this.acountnumber=acountnumber;
        this.totalbalance=totalbalance;
    }
    public void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Deposit amount : ");
        double DepositAmt=sc.nextDouble();
        this.totalbalance=this.totalbalance+DepositAmt;
    }
    public void withDraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Withdraw amount : ");
        double WihdrawAmt=sc.nextDouble();
        this.totalbalance=this.totalbalance-WihdrawAmt;
    }
    public double getBalace()
    {
        return totalbalance;
        //System.out.println("Current balance : "+totalbalance);
    }
}
