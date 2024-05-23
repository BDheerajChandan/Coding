//Find 1st and 2nd max of array
import java.util.Scanner;
import java.io.*;
class Max2ndArr_14
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
        int max_1=arr[0];  
        int max_2=arr[1];  
        if(max_1<max_2)
        {
            max_1=max_1+max_2;
            max_2=max_1-max_2; 
            max_1=max_1-max_2;
        }
        for(int i=2;i<size;i++)
        {
            if(arr[i]>max_1)                       
            {
                max_2 = max_1;
                max_1 = arr[i];
            }
            if(arr[i]>max_2 && arr[i]!=max_1)
            {
                max_2=arr[i];
            }
        }
        System.out.println("1st Maximum : "+max_1+"\n2nd Maximum : "+max_2);
    }
}