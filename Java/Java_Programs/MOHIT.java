import java.io.*;
class MOHIT
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("ENTER THE 3 SIDES OF THE TRIANGLE");
        int a=Integer.parseInt(input.readLine());
        int b=Integer.parseInt(input.readLine());
        int c=Integer.parseInt(input.readLine());
        if(((a+b)>c)&&((b+c)>a)&&((c+a)>b))
        {
            System.out.println("TRIANGLE IS POSSIBLE");
            if((a==b)&&(b==c)&&(c==a))
            System.out.println("TRIANGLE IS EQUILATERAL");
            else if((a==b)||(b==c)||(c==a))
            System.out.println("TRIANGLE IS ISOSC");
            else
            System.out.println("TRIANGLE IS SCALEN");
        }
        else
        {
            System.out.println("TRIANGLE IS NOT POSSIBLE");
        }
    }
}