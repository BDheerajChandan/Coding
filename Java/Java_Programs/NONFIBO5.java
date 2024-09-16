/*Program to print first n non-fobo numbers. First n numbers not 
 * in Fibonacci series. 0 1 1 2 3 5 8 13……
Input: n=5
Output: 4 6 7 9 10*/
import java.io.*;
class NONFIBO5
{
    public static void main(String args[])throws IOException
    {
        int a=0,b=1,t,c,A[]=new int[20],count=0,n=5;
        A[0]=0;
        A[1]=1;
        for(int i=2;i<10;i++)
        {
            c=a+b;
            A[i]=c;
            a=b;
            b=c;
        }
        for(int i=2;i<10;i++)
        {
            for(int j=A[i-1]+1;j<A[i];j++)
            {
                if(count!=n)
                {
                    System.out.println(j);
                    count++;
                }
            }
        }
    }
}

