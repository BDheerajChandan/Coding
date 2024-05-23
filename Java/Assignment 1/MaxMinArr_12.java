//Find max and min of given array
import java.util.Scanner;
import java.io.*;
class MaxMinArr_12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the size of an Array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("\nArray elements : ");
        for(int i:arr)
        {
            System.out.print(i+", ");
        }
        System.out.println();
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum : "+max+"\nMinimum : "+min);
    }
}