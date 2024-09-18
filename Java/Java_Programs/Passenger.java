class Passenger
{
 void inputdata(char x, char t, char z)
 { 
 int a,b,d;
 char c,p,g;
c=0;
x=c;
a=0;
b=0;
d=0;
p=0;
t=p;
g=0;
z=g;
do
{
System.out.println("Enter First/Second(F/S)" +c);
System.out.println("Period Daily/Monthly(D/M)" +p);
if (c=='F')
{
if (p=='D')
a++;
else
b++;
}
else
{
if (p=='D')
c++;
else d++;
}
System.out.println("Any More Passengers?");
System.out.println("Enter Yes or No (y/n)" +g);
}
while(g=='y');
System.out.println("First Class Daily Passengers" +a);
System.out.println("First Class monthly Passengers" +b);
System.out.println("Second Class Daily Passengers" +c);
System.out.println("Second Class monthly Passengers" +d);
}
}

