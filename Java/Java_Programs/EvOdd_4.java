//Check the number is even or odd
import java.io.*;
import java.util.Scanner;
class EvOdd_4
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" : Even number");
        }else{
            System.out.println(n+" : Odd number");
        }
    }
}