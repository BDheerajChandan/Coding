import java.io.*;
import java.math.*;
import java.util.*;
class CS_LAB7
{
    public static void main(String args[])throws IOException
    {
        double A[]={0.69,0.54,0.41,0.31,0.23};
        double B[]={1.69,1.54,1.41,1.31,1.23};
        System.out.println("ZETA:");
        for(int i=0;i<5;i++)
        {
            double z=1/Math.sqrt(1+((3.14*3.14)/Math.pow(Math.log(A[i]),2)));
            System.out.println(z);
        }
        System.out.println("\n\nOMEGA");
        for(int i=0;i<5;i++)
        {
            double Wn=3.14/B[i];
            System.out.println(Wn);
        }
    }
}