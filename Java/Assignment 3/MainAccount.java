import java.io.*;
import java.util.*;
public class MainAccount
{
    public static void main(String args[])
    {
        int acountnumber;
        double totalbalance;
        double fee=1.0;
        double interestRate=1.0;
        Scanner sc=new Scanner(System.in);
        System.out.print("\nPlease enter the Account number : ");
        acountnumber=sc.nextInt();
        System.out.print("\nPlease enter the Total Balance : ");
        totalbalance=sc.nextDouble();        
        
        BankAccount BA=new BankAccount(acountnumber, totalbalance);
        totalbalance=BA.getBalace();
        System.out.println("Current balance : "+totalbalance);
        System.out.println("*********************");
        BA.deposit();
        totalbalance=BA.getBalace();
        System.out.println("Current balance : "+totalbalance);
        System.out.println("*********************");
        BA.withDraw();
        totalbalance=BA.getBalace();
        System.out.println("Current balance : "+totalbalance);
        System.out.println("*********************");
        CheckingAccount CA=new CheckingAccount(acountnumber, totalbalance, fee);
        System.out.println("Before deducting a fees : "+totalbalance);
        double Deductfee=CA.deductFee();
        totalbalance=totalbalance-Deductfee;
        System.out.println("After deducting a fees "+Deductfee+" : "+totalbalance);
        System.out.println("*********************");
        SavingAccount SA=new SavingAccount(acountnumber, totalbalance, interestRate);
        System.out.println("Before Adding interest : "+interestRate);
        double AddedinterestRate=SA.AddInterest();
        System.out.println("After Adding interest "+AddedinterestRate+" : "+(interestRate+AddedinterestRate));
        System.out.println("*********************");
    }
}