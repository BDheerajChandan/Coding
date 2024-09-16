/*N=4 S=3
3
44
555
6666
6666
555
44
3*/
import java.io.*;
class EASTPARAMID3
{
    public static void main(String args[])throws IOException
    {
        int N=4,S=3;
        for(int j=S;j<S+4;j++)
        {
            for(int i=S;i<j+1;i++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int j=S+3;j>=S;j--)
        {
            for(int i=j+1;i>S;i--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}     