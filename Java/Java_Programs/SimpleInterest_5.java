//Find Simple Interest
import java.io.*;
import java.util.Scanner;
class SimpleInterest_5
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        float p,r,SI;
        int t;
        System.out.print("Please enter Principle(P) : ");
        p=sc.nextFloat();
        System.out.print("Please enter Rate(R) : ");
        r=sc.nextFloat();
        System.out.print("Please enter Time(T) : ");
        t=sc.nextInt();
        SI=(p*t*r)/100;
        System.out.println("Principle: "+p+"\nRate: "+r+"\nTime "+t+"\n\nSI = "+SI);
    }
}