/*X Patterns using numbers
1       1
 2     2
  3   3
   4 4
    5
   4 4
  3   3
 2     2
1       1*/
import java.io.*;
class PATTERNX1
{
    public static void main(String args[])throws IOException
    {
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int l=i;l<=i;l++)
            {
                System.out.print(l);
            }
            for(int m=10-(i*2);m>=1;m--)
            {
                System.out.print(" ");
            }
            for(int n=i;n<=i;n++)
            {
                System.out.print(n);
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            System.out.print(" ");
        }
        System.out.println("5");
        for(int i=4;i>=1;i--)
        {
            for(int k=i;k>1;k--)
            {
                System.out.print(" ");
            }
            for(int l=i;l>=i;l--)
            {
                System.out.print(l);
            }
            for(int m=1;m<=10-(i*2);m++)
            {
                System.out.print(" ");
            }
            for(int n=i;n>=i;n--)
            {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}