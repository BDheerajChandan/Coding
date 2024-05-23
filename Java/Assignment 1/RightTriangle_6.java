//Print Right triangle star pattern
import java.io.*;
import java.util.*;
class RightTriangle_6
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
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}