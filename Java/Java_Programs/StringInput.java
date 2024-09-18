// To print a String which is given by an user
import java.io.*;
import java.util.Scanner;
class StringInput
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        //Scanner sc=new Scanner(System.in);
        System.out.print("Please give string input : ");
        String s=input.readLine();// I am Dheeraj
        System.out.println();
        System.out.print("Please give number input : ");
        int n=Integer.parseInt(input.readLine());// 20
        System.out.println();
        
        
        //String s=input.readLine(); // I am Dheeraj
        //String s=sc.nextLine();
        //int n=sc.nextInt();
        
        System.out.println();
        System.out.println("My output is : "+"Hello ,"+s+"Roll "+n);
    }
}