import java.io.*;
class HCF
{
    public static void main(String args[])throws IOException
    {
        int a[]={6,24,12,8,10};
        int n=a[0],c=0,N;
        for(int i=1;i<a.length;i++)
        {
            if(a[i-1]>a[i])
            {
                n=a[i];
            }else{
                n=a[i-1];
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[j]%i==0)
                {
                    N=i;System.out.println(N);
                }
            }
            
        }
        
    }
}