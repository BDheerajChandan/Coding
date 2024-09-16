/*N=4 (No of lines)
11112
32222
33334
54444*/
import java.io.*;
class SQUAREPTRN4
{
    public static void main(String args[])throws IOException
    {
        int N=4;
        for(int i=1;i<=N;i++)
        {
            if(i%2==1)
            {
                for(int j=1;j<=N;j++)
                {
                    System.out.print(i);
                }
                System.out.print(i+1);
                System.out.println();
            }else{
                System.out.print(i+1);
                for(int j=1;j<=N;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}