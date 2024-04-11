import java.io.*;
import java.util.*;
class Account_4
{
    int accno;
    String accname;
    float amount;
    public void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Account details");
        System.out.println("Enter Account number : ");
        accno=sc.nextInt();
        System.out.println("Enter Account holder name : ");
        accname=sc.next();
        System.out.println("Enter amount : ");
        amount=sc.nextInt();
    }
    public void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the withdraw amount");
        float withdraw_amt=sc.nextInt();
        amount=amount-withdraw_amt;
        System.out.println("After withdrawing amount : "+amount);
    }
    public void interest()
    {
        System.out.println("Please enter Principle, rate, time details : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Principle : "+amount);
        //float p=sc.nextInt();
        float p=amount;
        System.out.println("Enter rate : ");
        float r=sc.nextFloat();
        System.out.println("Enter time : ");
        int t=sc.nextInt();
        float SI=(p*t*r)/100;
        System.out.println("Principle: "+p+"Time: "+t+"Rate: "+r+"\nSimple Interest: "+SI);
    }
    /*public static void main(String args[])throws IOException
    {
        Account_4 a=new Account_4();
        a.deposit();
        a.interest();
        System.out.println("*******************************************");
        a.withdraw();
        a.interest();
    }*/
}    