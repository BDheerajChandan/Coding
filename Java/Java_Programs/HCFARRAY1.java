/*Program to find the GCD of n numbers.
Input: n=6
5 10 25 45 95 65
Output: 5*/
import java.io.*;
class HCFARRAY1
{
    public static void main(String args[])throws IOException
    {
        int A[]={5,10,25,45,95,65};
        int min=A[0],c=0;
        for(int i=1;i<6;i++)
        {
            if(A[i]<min)
            {
                min=A[i];
            }
        }
        for(int i=0;i<6;i++)
        {
            if(A[i]%min==0)
            {
                c++;
            }
        }
        if(c==A.length)
        {
            System.out.println("HCF OF ARRAY: "+min);
        }else{
            System.out.println("HCF OF ARRAY: 1");
        }
    }
}

    