import java.util.*;
class Account
{
    int accnum;
    double balance;
    double p;
    double r;
    int t;
    Account()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter account number : ");
        this.accnum=sc.nextInt();
        System.out.println("Please enter account balance : ");
        this.balance=sc.nextDouble();
        p=this.balance;
        System.out.println("Please enter the rate : ");
        r=sc.nextDouble();
        System.out.println("Please enter the time : ");
        t=sc.nextInt();
    }
    public void deposit()
    {
        
    }
    public void withdraw()
    {
    }
    public void calculateInterest()
    {
        
    }
    public void display()
    {
        System.out.println("Account Number : "+accnum);
        System.out.println("Account Balance : "+balance);
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////
class SaveAcc extends Account
{
    public void deposit()
    {
        Scanner sc=new Scanner(System.in);
        double depositAmt=sc.nextDouble();
        super.balance=super.balance+depositAmt;
    }
    public void calculateInterest()
    {
        super.p=super.balance;
        super.balance=super.balance+((super.p*super.t*super.r)/100.0);
    }
    public void display()
    {
        super.display();
        System.out.println("SI : "+(super.p*super.t*super.r)/100.0);
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
class CalInt extends Account
{
    public void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        double WithdrawAmt=sc.nextDouble();
        super.balance=super.balance-WithdrawAmt;
    }
    public void calculateInterest()
    {
        super.p=super.balance;
        super.balance=super.balance+((super.p*super.t*super.r)/100.0);
    }
    public void display()
    {
        super.display();
        System.out.println("SI : "+(super.p*super.t*super.r)/100.0);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class AccMain
{
    public static void main(String args[])
    {
        //Account a=new Account();
        SaveAcc s=new SaveAcc();
        s.display();
        System.out.println("*****************************************");
        s.calculateInterest();
        s.deposit();
        System.out.println("*****************************************");
        s.calculateInterest();
        s.display();
        System.out.println("*****************************************");
        /*CalInt c=new CalInt();
        c.display();
        System.out.println("*****************************************");
        c.calculateInterest();
        c.deposit();
        c.display();
        System.out.println("*****************************************");
        c.calculateInterest();
        c.display();
        System.out.println("*****************************************");*/
    }
}