//Program on Initialisation of Array.
import java.io.*;
public class Ever43
{
public static void main(String args[]) throws IOException
{
int i;
int sum=0;
int[] ar = new int[50];
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader input =new BufferedReader(reader);
System.out.print ("Enter Numbers  in Array = ");
String n = input.readLine();
String numb;
int x = Integer.parseInt(n);
for(i=0; i<x; i++)
{
System.out.print("Enter Number  = " +(i+1)+" : ");
numb = input.readLine();
ar[i] = Integer.parseInt(numb);
sum += ar[i];
}
System.out.println("Sum of Array Elements = " +sum);
}
}

















