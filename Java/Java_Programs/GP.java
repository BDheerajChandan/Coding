
//To find the sum of geometric series
import java.lang.*;
import java.io.*;
class GP
{
public  void main(int a, int r)    // a being the first term
{                                  // r being the common ratio
int s,n,i;
s=0;
i=1;
n=0;
do
{
s=s+a*i;
i=i*r;
}
while(i>n+1);
System.out.println("Sum of Geometric Series = " +s);
}
}