import java.io.*;
class NIHI_KANTH_3
{
    public static void calculateTax(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.print("Enter number of members: ");
        int n=Integer.parseInt(input.readLine());
        System.out.print(n+"\n");        
        long income[]=new long[n];
        long tax[]=new long[n];
        String name[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name "+(i+1));
            name[i]=input.readLine();
            System.out.println("Enter "+name[i]+"'s Annual income");
            income[i]=Long.parseLong(input.readLine());
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
            System.out.println(name[i]+" : "+tax[i]);
        }
    }
}