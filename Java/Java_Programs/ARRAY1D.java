import java.io.*;
class ARRAY1D
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter the range:");
        int n=Integer.parseInt(input.readLine());
        int A[]=new int[n];
        System.out.println("Enter the elements in an array:");
        for(int i=0;i<n;i++)
        {
            int num=Integer.parseInt(input.readLine());
            A[i]=num;
        }
        System.out.println("Display the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.println();
    }
}