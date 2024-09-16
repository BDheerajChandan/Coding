import java.io.*;
class NUMRVS
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("ENTER THE NUMBER");
        int n=Integer.parseInt(input.readLine());
        int s=0,d,t=n;
        System.out.println(t);
        while(n!=0)
        {
           d=n%10;
           s=(s*10)+d;
           n=n/10;
        }
        System.out.println(s);
    }
}