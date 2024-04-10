//Pyramid number pattern
import java.io.*;
import java.util.*;
class PyramidPattern_7
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the Size : ");
        int size=sc.nextInt();
        System.out.println();
        for(int i=0;i<size;i++)
        {
            for(int j=size-1;j>=i;j--)
            {
                System.out.print(" ");                
            }
            for(int j=0;j<(i*2)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}