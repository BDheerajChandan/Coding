import java.io.*;
import java.util.*;
class CheckingAccount extends BankAccount
{
    double fee;
    CheckingAccount(int acountnumber,double totalbalance,double fee)
    {
        super(acountnumber,totalbalance);
        this.fee=fee;
    }
    public double deductFee()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Deducted fees : ");
        double fee=sc.nextDouble();
        //this.totalbalance=this.totalbalance-fee;
        return fee;
    }
}