import java.io.*;
class ARMSTRONG
{
    public static void main(String rgs[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter the number:");
        int n=Integer.parseInt(input.readLine());
        int d,s=0,t=n;
        while(n!=0)
        {
            d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        if(s==t)
        {
            System.out.println(t+" :is a palindrome");
        }else{
            System.out.println(t+" :is not a palindrome");
        }        
    }
}