import java.lang.*;
import java.io.*;
class Design1
{
public  void main() 
{
char ar[] = {'*','*','*','*','*','*','*','*'};
for (int i=8; i<=1; --i)
{
for (int j=8; j<=i; --j)
{
System.out.print(" " +ar[i]);
}
System.out.println( );
}
}
}
