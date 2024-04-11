import java.io.*;
import java.util.*;
class Account_Main4
{
    public static void main(String args[])throws IOException
    {
        Account_4 a=new Account_4();
        a.deposit();
        a.interest();
        System.out.println("*******************************************");
        a.withdraw();
        a.interest();
    }
}