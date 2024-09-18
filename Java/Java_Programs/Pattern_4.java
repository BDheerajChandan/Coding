import java.io.*;
import java.util.Scanner;
class Pattern_4
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size :  ");
        int n=sc.nextInt();//5
        for(int i=0;i<n;i++)// rows
        {
            for(int j=0;j<=i;j++)// columns
            {
                if(j%2==0)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.print("\n");  // System.out.println();
        }
    }
}