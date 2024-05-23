import java.io.*;
import java.util.*;
public class SavingAccount extends BankAccount
{
    double interestRate;
    SavingAccount(int acountnumber,double totalbalance,double interestRate)
    {
        super(acountnumber,totalbalance);
        this.interestRate=interestRate;
    }
    public double AddInterest()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Interest to be added : ");
        double interestRate=sc.nextDouble();
        //this.interestRate=this.interestRate+interestRate;
        return interestRate;
    }
}