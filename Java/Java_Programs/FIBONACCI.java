import java.io.*;
class FIBONACCI
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter the range");
        int n=Integer.parseInt(input.readLine());
        System.out.print("0\n1\n");
        int a=0,b=1,c;
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            System.out.println("FIBONACCI "+c);
            a=b;
            b=c;
        }
    }
}