import java.io.*;
import java.util.*;
import java.util.Scanner.*;
class NIDHI_KANTH_4
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Tax calculator App\n-------Welcome-------\n");
        System.out.print("Enter number of members: ");
        int n=sc.nextInt();
        System.out.print(n+"\n");     
        long income[]=new long[n];
        long tax[]=new long[n];
        String name[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name "+(i+1));
            name[i]=sc.next();
            System.out.println("Enter "+name[i]+"'s Annual income");
            income[i]=sc.nextLong();
        }
        System.out.println("\n");
        for(int i=0;i<n;i++)
        {
            if(income[i]<100000)
            {
                tax[i]=0;                
            }
            else if((income[i]>=100000)&&(income[i]<300000))
            {
                tax[i]=(10*income[i])/100;
            }
            else if(income[i]>=300000)
            {
                tax[i]=(20*income[i])/100; 
            }
        }
        System.out.println(" Names with liable taxes \n ------------------------");
        for(int i=0;i<n;i++)
        {
            System.out.println(name[i]+" : "+income[i]);
        }
    }
}