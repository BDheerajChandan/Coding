/*Program to print nth Fibonacci number. 0 1 1 2 3 5 8 13 21…….
Input: n=7
Output: 8*/
import java.io.*;
class NTHFIBO2
{
    public static void main(String args[])throws IOException
    {
        int a=0,b=1,c,n=10,A[]=new int[n+1];
        A[0]=0;
        A[1]=1;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            A[i]=c;
            a=b;
            b=c;
        }       
        System.out.println(A[n-1]);
    }
}