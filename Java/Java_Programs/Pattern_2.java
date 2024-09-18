import java.io.*;
//import java.util.Scanner;
class Pattern_2
{
    public static void main(String args[])throws IOException
    {
        //Scanner sc=new Scanner(System.in);
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.print("Give size number : ");
        //int size=sc.nextInt();
        int size=Integer.parseInt(input.readLine()); // 5 0r 3...        
        System.out.println();
        
        for(int i=0;i<size;i++) //rows
        {
            for(int j=0;j<=i;j++) // columns
            {
                System.out.print((j+1)+" ");
            } 
            System.out.print("\n");
        }
    }
}