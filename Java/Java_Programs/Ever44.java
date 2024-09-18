//Program to find the largest and smallest elements in the  Array.
import java.io.*;
public class Ever44
{
public static void main(String args[]) throws IOException
{
int i;
int sum=0;
int[] ar = new int[50];
int ub, lb;                //upper and lower bounds
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
}
ub = ar[0];         //initialising upper bound
lb = ar[0];         //initialising lower bound
for(i=0; i<x; i++)
{
if(ar[i]>ub)
ub = ar[i];
if(ar[i]<lb)
lb = ar[i];
}
System.out.println("Highest Number in the Array = " +ub);
System.out.println("Smallest Number in the Array = " +lb);
}
}

















