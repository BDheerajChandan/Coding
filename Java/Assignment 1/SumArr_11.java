//Sum of values of given array
import java.util.Scanner;
import java.io.*;
class SumArr_11
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the size of an array :");
        int size=sc.nextInt();//5
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the "+(i+1)+" Elemet");
            a[i]=sc.nextInt();// 5 in
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