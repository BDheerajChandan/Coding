import java.lang.*;
class decimal
{
void compute(String name, int n )
{
int i,j,l,c=0,y,n1;
l=name.length();
System.out.println("Roman Letter =" +name);
for(i=0; i<l; i++)
{
char ch;
char c1;
c1=name.charAt(i);
try
{
c=(int)c1;
}
catch(NumberFormatException e)
{
if(n>0)
{
if((c+n)<=90)
System.out.print((ch)(c+n));
else
{
c=c+n;
c=c%10;
c=65+(c-1);
System.out.print((ch)(c));
}
}
else if(n<0)
{
n1=Math.abs(n);
if((c-n)>=65)
System.out.print((ch)(c-n1));
else
{
if(c>65)
c=c-65;
else
c=n1;
System.out.print((ch)(90-c(c-1)));
}
}
else if(n==0)
{
System.out.println("No change" +name);
break;
}
}
}
}
}
