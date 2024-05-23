//To print table of a given number
import java.io.*;
import java.util.*;
class Table_8
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nPlease enter the number : ");
        int num=sc.nextInt();
        System.out.print("Please enter the Range : ");
        int range=sc.nextInt();
        int result;
        for(int i=1;i<=range;i++)
        {
            result=i*num;
            System.out.println(num+" * "+i+" = "+result);
        }
    }
}