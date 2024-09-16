/*X Patterns using numbers
*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *    */
import java.io.*;
class PATTERN_X2
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
                System.out.print("*");
            }
            for(int m=10-(i*2);m>=1;m--)
            {
                System.out.print(" ");
            }
            for(int n=i;n<=i;n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");
        for(int i=4;i>=1;i--)
        {
            for(int k=i;k>1;k--)
            {
                System.out.print(" ");
            }
            for(int l=i;l>=i;l--)
            {
                System.out.print("*");
            }
            for(int m=1;m<=10-(i*2);m++)
            {
                System.out.print(" ");
            }
            for(int n=i;n>=i;n--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}