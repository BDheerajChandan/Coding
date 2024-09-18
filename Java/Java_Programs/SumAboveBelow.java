import java.io.*;
class SumAboveBelow
{
public static void main(String args[]) throws IOException
{
int a[][] = new int[4][4];
int i,j;
int below,above;
below=above=0;
i=j=0;
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader(reader);
System.out.println("Enter Elements of the Array=");
for (i=0;i<4;i++)
{
for (j=0;j<4;j++)
{
String y1 = input.readLine();
a[i][j]=Integer.parseInt(y1);
}
}
System.out.print("Elements of Array are=");
System.out.print("\n");
for (i=0;i<4;i++)
{
for (j=0;j<4;j++)
{
System.out.print(" "+a[i][j]);
}
}

for (i=0;i<4;i++)
{
for (j=0;j<4;j++)
{
if(i>j)
below=below+a[i][j];
System.out.print("Sum of Elements below diagonal is =");
System.out.print(" "+below);
System.out.print("\n");
}
}
for (i=0;i<4;i++)
{
for (j=0;j<4;j++)
{
if(i<j)
above=above+a[i][j];
System.out.print("Sum of Elements above diagonal is =");
System.out.print(" "+above);
System.out.print("\n");
}
}
}
}




