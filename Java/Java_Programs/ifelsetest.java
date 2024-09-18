import java.io.*;
class ifelsetest
{
public static void main(String args[]) throws IOException
{
int a,b,c,x,y;
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader(reader);
System.out.print("Enter Value of x = ");
String v1= input.readLine();
x = Integer.parseInt(v1);

System.out.print("Enter Value of a = ");
String v2= input.readLine();
a = Integer.parseInt(v2);

System.out.print("Enter Value of b = ");
String v3= input.readLine();
b = Integer.parseInt(v3);

System.out.print("Enter Value of c = ");
String v4= input.readLine();
c = Integer.parseInt(v4);

if (x>=4)
System.out.println("Value of y =" +(a*x*x +b*x +c));
else
System.out.println("Value of y =" +(-a*x*x +b*x -c));
}
}



