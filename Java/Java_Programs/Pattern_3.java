import java.io.*;
import java.util.Scanner;
class Pattern_3
{
    public static void main(String args[])throws IOException
    {
        //InputStreamReader reader=new InputStreamReader(System.in);
        //BufferedReader input=new BufferedReader(reader);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        //int size=Integer.parseInt(input.readLine());
        int size=sc.nextInt();
        System.out.println();
        int c=1;
        for(int i=0;i<size;i++)// Rows
        {
            for(int j=0;j<=i;j++)//Columns
            {
                System.out.print(c+" ");
                c=c+1;
            }
            System.out.println();
        }
    }
}