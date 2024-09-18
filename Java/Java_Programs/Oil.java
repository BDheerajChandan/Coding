import java.lang.*;
import java.io.*;
class Oil
{
public void oil() 
{
int t,p;
for (t=1; t<=10; t++)
{
if(t<=3)
p=5+3*t;
else
p = 14+(t-5/2);
System.out.println("Production after year " +(t+1)+ "=" +p  +" gallons");
}
}
}