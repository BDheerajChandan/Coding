import java.io.*;
import java.util.*;
class Account_Main4
{
    public static void main(String args[])throws IOException
    {
        Account_4 a=new Account_4();
        a.deposit();//1000
        a.interest();//1000
        System.out.println("*******************************************");
        a.withdraw();//900
        a.interest();//900
        System.out.println("*******************************************");
        a.withdraw();//500
        a.interest();//500
    }
}