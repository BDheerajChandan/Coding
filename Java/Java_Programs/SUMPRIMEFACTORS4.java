/*Program to find sum of the prime factors of a number.
Input: n=100
Output: 2+5=7*/
import java.io.*;
class SUMPRIMEFACTORS4
{
    public static void main(String args[])throws IOException
    {
        int n=100,s=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                int c=0;
                for(int j=1;j<=n;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    s=s+i;
                    System.out.println(i);
                }
            }
        }
        System.out.println("\n\n"+s);
    }
}