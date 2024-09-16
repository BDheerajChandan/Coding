/*N=5
1
3*2
4*5*6
10*9*8*7
11*12*13*14*15*/
import java.io.*;
class PTRNRAT6
{
    public static void main(String args[])throws IOException
    {
        int N=5,s=0,b,t,A[]=new int[20];
        for(int i=0;i<N;i++)
        {
           for(int j=0;j<=i;j++)
           {
               A[s]=s+1;
               s++;
           }
        }
        b=t=s-1;
        for(int i=0;i<N;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(A[b-t]+" ");
                    t--;
                }
                System.out.println();
            }
        }
    }
}