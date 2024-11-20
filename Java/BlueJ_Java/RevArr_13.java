//To print reverse ofa array
import java.io.*;
import java.util.Scanner;
class RevArr_13
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the array range : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Input "+size+" Array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[size-1-i]+" ");
        }
        System.out.print("\nArray elements after reversing: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[size-1-i]+" ");
        }
    }
}