import java.lang.*;
class whilefile
{
public  void main()
{
int a,b,c,i,n;
a=1;
b=1;
i=0;
n=10;
c=a+b;

System.out.print(" "+a);
System.out.print(" "+b);
System.out.print(" "+c);
{
System.out.print("The series is =" );
while(i<n-3)
a=b;
b=c;
c=a+b;
System.out.println(" " +c);
i++;
}
}
}