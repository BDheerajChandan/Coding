
import java.lang.*;
class convert
{
public void compute(String name,int n)
{
int i,j,l,c=0,y,n1;
l=name.length();
System.out.println("Roman Letter =" +name);
for(i=0; i<l; i++)
{
char c1=name.charAt(i);
try
{
c=(int)c1;
}
catch(NumberFormatException e)
{
if(n>0)
{
if((c+n)<=90)
System.out.print((char)(c+n));
else
{
c=c+n;
c=c%10;
c=65+(c-1);
System.out.print((char)(c));
}
}
else if(n<0)
{
n1=Math.abs(n);
if((c-n)>=65)
System.out.print((char)(c-n1));
else
{
if(c>65)
c=c-65;
else
c=n1;
System.out.print((char)(90-(c-1)));
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

