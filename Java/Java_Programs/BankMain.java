/*
Design a simple banking system that includes functionality for managing accounts, including savings and checking accounts. 
Implement the system using inheritance and method overriding to handle specific functionalities for each type of account.

The Account class is the superclass, representing a generic bank account with properties like account number and balance. 
It provides methods for depositing, withdrawing, calculateInterest and displaying account details.
Subclasses SavingsAccount and CheckingAccount inherit from the Account class and override methods like withdraw() and display() 
to include specific behaviors for each type of account.
Each subclass can override the calculateInterest()  to find the interest functionalities specific to that type of account.
In the Main class, instances of each type of account are created and transactions like deposits, withdrawals, and interest calculations 
are performed, demonstrating method overriding and inheritance in action.*/
import java.util.*;
class Accounts
{
    int accountNumber;
    double balance;
    Accounts()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter bank details : ");
        System.out.println("Please enter account number : ");
        this.accountNumber=sc.nextInt();
        System.out.println("Please enter account balance : ");
        this.balance=sc.nextDouble();
    }
    public void deposit() 
    {
        System.out.println("Please Enter the details for deposit : ");
    }
    public void withdraw() 
    {
        System.out.println("Please Enter the details for withdraw : ");
    }
    public void display() 
    {
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Balance : "+balance);
    }
    public void calculateIntrest()
    {
        System.out.println("Please Enter the details for Interest : ");
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class SavingsAccount extends Accounts 
{
    double principal;
    double rate;
    int time;
    public void calculateIntrest() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter details for interest : ");
        this.principal=this.balance;
        System.out.println("Please enter the rate : ");
        this.rate=sc.nextDouble();
        System.out.println("Please enter the time : ");
        this.time=sc.nextInt();
        double SI=(principal*rate*time)/100.0;
        super.balance=super.balance+SI;
    }
    public void display() 
    {
        super.display();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
class CheckingAccounts extends Accounts
{
    public void withdraw() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter deduct amount : ");
        double deductAmt=sc.nextDouble();
        super.balance=super.balance-deductAmt;
    }
    public void display() 
    {
        super.display();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////
public class BankMain
{
    public static void main(String args[])
    {
        Accounts a=new Accounts();
        SavingsAccounts SA=new SavingsAccounts();
        System.out.println("\t\tCALCULATING INTEREST : SAVING ACCOUNT");
        SA.display();
        SA.calculateIntrest();
        SA.display();
        System.out.println("************************************************");
        System.out.println("\t\tCALCULATING INTEREST AFTER WITHDRAW : CHECKING ACCOUNT");
        CheckingAccounts CA=new CheckingAccounts();
        SA.display();
        SA.withdraw();
        SA.display();
        System.out.println("************************************************");
    }
}