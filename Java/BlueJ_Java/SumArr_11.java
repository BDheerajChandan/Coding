//Sum of values of given array
import java.util.Scanner;
import java.io.*;
class SumArr_11
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the size of an array :");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<size;i++)
        {
            s=s+a[i];
            System.out.print(a[i]+" ");
        }
        System.out.println("Sum of array : "+s);
    }
}