import java.io.*;
class a
{
    public static void main(String args[])throws IOException
    {
        int A[]={12,24,40};
        int min=A[0],c=0,GCD;
        for(int i=1;i<A.length;i++)
        {
            if(A[i]<min)
            {
                min=A[i];
            }
        }
        for(int i=1;i<=min;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                if(A[j]%i==0)
                {
                    c++;
                    GCD=i;
                    if(c==A.length)
                    {
                        System.out.println(GCD);
                    }
                }
            }      
        }
    }
}