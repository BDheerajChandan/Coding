/*N=4
1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1*/
import java.io.*;
class SPTRN7
{
    public static void main(String args[])throws IOException
    {
        int N=4,s=1,A[]=new int[20],c=0;
        for(int j=0;j<=N;j++)
        {
            for(int i=0;i<=j;i++)
            {
                A[c]=s;
                System.out.print(A[c]);
                s++;
                c++;
            }
            System.out.println();
        }
        for(int i=0;i<N;i++)
        {
            for(int j=N;j>=i;j--)
            {
                c--;
                System.out.print(A[c]);
            }
            System.out.println();
        }
    }
}