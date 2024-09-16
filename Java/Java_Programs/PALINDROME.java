import java.io.*;
class PALINDROME
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter the number ");
        int n=Integer.parseInt(input.readLine());
        int t=n;
        int s=0,d;
        while(n!=0)
        {
            d=n%10;
            s=(s*10)+d;
            n=n/10;
        }
        if(s==t)
        {
            System.out.println(t+" is a palindrome");
        }
        else
        {
            System.out.println(t+" is not a palindrome");
        }
    }
}