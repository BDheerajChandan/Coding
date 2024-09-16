import java.io.*;
class ARRAY2D
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter the range:");
        int m=Integer.parseInt(input.readLine());
        int n=Integer.parseInt(input.readLine());
        int A[][]=new int[m][n];
        System.out.println("Enter the elements in an array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int num=Integer.parseInt(input.readLine());
                A[i][j]=num;
            }
        }
        System.out.println("Display the array elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}