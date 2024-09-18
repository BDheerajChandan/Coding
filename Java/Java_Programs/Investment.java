//calculating amount payable after certain years.
class Investment
{
public void investment(int year, double r, double p)
{
double a;
a=0;
System.out.println("Amout invested :" +p );
for (year=1;year<=5; year++)
{
if(year<=2)
r=0;
else
r=0.115;
a=p*(1+r);
System.out.println("Amount After Year " +(year+1)+ " = " +a);}
}
}
