/*Pascal Triangle, N=5
      1
     1 1
    1 2 1 
   1 3 3 1
  1 4 6 4 1  */
import java.io.*;
class PASCAL5
{
    public static void main(String args[])throws IOException
    {
        int N=5,c=1,d,t;
        for(int i=1;i<N*2-2;i++)
        {
            System.out.print(" ");
        }
        System.out.println(c);
        for(int i=1;i<=N;i++)
        {
            for(int j=N;j>=i;j--)
            {
                System.out.print(" ");
            }
            c=c*11;
            t=c; 
            while(c!=0)
            {
                d=c%10;
                System.out.print(d+" ");
                c=c/10;
            }
            c=t;
            System.out.println();
        }
    }
}