/*Program to print nth prime number.
Input: n=5
Output: 11*/
import java.io.*;
class NTHPRIME3
{
    public static void main(String args[])throws IOException
    {
        int s=0,num=0,A[]=new int[1000],n=5;
        for(int i=1;i<=1000;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(i);
                A[num]=i;
                num++;
            }
        }
        System.out.println("\n"+A[n-1]);
    }
}