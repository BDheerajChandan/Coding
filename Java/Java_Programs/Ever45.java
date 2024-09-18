//Program for searching an element in an Array.
import java.io.*;
public class Ever45
{
public static void main(String args[]) throws IOException
{
int i;
int[] array = new int[50];
int look=0;
int location=0;                
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader input =new BufferedReader(reader);
String n = input.readLine();
int x = Integer.parseInt(n);
System.out.print ("Enter Numbers  in Array = ");
for(i=0; i<x; i++)
{
System.out.print("Enter Number = " +(i+1)+":: ");

}
System.out.print("Enter Number to be Searched = ");
String a = input.readLine();
look = Integer.parseInt(a);
for(i=0; i<x; i++)
{
if(array[i]== look)
location = i+1;
}
if(location>0)
System.out.println("The Required Number " +look + "Found at Location No. = " +location);
else
System.out.println("The Required Number " +look + " Not  Found !!" );

}
}

















