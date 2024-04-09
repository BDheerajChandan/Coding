//Find Revese of digits of a given number
import java.io.*;
import java.util.Scanner;
class RevsDigit_3
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int n=sc.nextInt();
        int s=0,d,t=n;
        while(n!=0)
        {
            d=n%10;
            s=(s*10)+d;
            n=n/10;
        }
        System.out.println("Reverse of "+t+" : "+s);
    }
}