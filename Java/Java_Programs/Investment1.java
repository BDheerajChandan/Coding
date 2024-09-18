//calculating amount payable after certain years.
class Investment1
{
public  void main(double p,double r, int year)
{
double i;
System.out.println("Amout invested :" );
for (year=1;year<=5; year++)
{
if(year==1)
r=0.10;
else
if (year ==2)
r=0.105;
else
r=0.115;
i=p*r;
System.out.println("Interest After Year " +(year+1)+ " = " +i);
}
}
}
