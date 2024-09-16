import java.io.*;
import java.util.*;
import java.util.Scanner.*;
class NIDHI_KANTH_1
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("\n");
        int age[]=new int[n];
        String B[]=new String[n];
        String S[]=new String[n];
        String name[]=new String[n];
        for(int i=0;i<n;i++)
        {
            name[i]=sc.next();
            age[i]=sc.nextInt();
            B[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            if(age[i]>=20)
            {
                S[i]="RED";
            }
            else if((age[i]>=15)&&(age[i]<20))
            {
                S[i]="BLUE";
            }
            else if((age[i]>=10)&&(age[i]<15))
            {
                S[i]="YELLOW";
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("________________________");
            System.out.println("Name: "+name[i]);
            System.out.println("Age: "+age[i]);
            System.out.println("Blood Group: "+B[i]);
            System.out.println("________________________");
            System.out.println("School Group: "+S[i]);
            System.out.println("________________________\n");
        }
    }
}