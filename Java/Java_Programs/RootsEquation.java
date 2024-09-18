import java.io.*;
import java.lang.*;
class RootsEquation
{
public void Roots(double a,double b, double c)
{
double r1,  r2;
r1=0;
r2=0;
System.out.println("Entered Value of a = " +a);
System.out.println("Entered Value of b = " +b);
System.out.println("Entered Value of c = " +c);
if ((b*b-4*a*c)>0)
{
r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
r1 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
System.out.println("One Root is =" +r1);
System.out.println("Second Root is =" +r2);
}
else
if((b*b-4*a*c)==0)
{
r1=-b/(2*a);
r2=-b/(2*a);
System.out.println("Root One is =" +r1);
System.out.println("Root Second is =" +r2);
}
else
if((b*b-4*a*c)<0)
{
r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);

r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
System.out.print("One Root is imaginary");
System.out.print("Root Two is imaginary");
}
}
}














