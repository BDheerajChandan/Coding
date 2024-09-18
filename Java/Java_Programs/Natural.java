class weight
{
double w;
int a,ew;
double frac;
public void inputdata(double w1)
{
w=w1;
if (w<=1000)
a=15;
else
{
ew =w-1000;
frac=ew/500.00;

if(frac==double(frac))
a=8*frac;
else 
a=8*(double(frac)+1);
a=a+15;
System.out.println("Value is = " +a);
}
}