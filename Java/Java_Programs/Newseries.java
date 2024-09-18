
import java.io.*;
import java.lang.*;
class Newseries
{
public void newseries(double x, int n, double s)
{
double fact=1;
double f,p;
f=0;
double k=0;

n=0;
for(int i =0; i<x; i++)
{
fact=fact*i;
System.out.println(+fact);
while(!(k>=s))
{
n++;
p =Math.pow(x,n);
p=p+fact*i;
k +=p/f;
}
System.out.println("The Least Value of n="+n);

}
}
}