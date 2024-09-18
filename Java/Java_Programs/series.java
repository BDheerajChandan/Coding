import java.lang.*;
class series
{
public void series(double x, int n)
{
double p, f, p1;
p1=0;
double sum1;
int i,j,k=2;
sum1=1;

for(i=1;i<n; i++)
{
f=1;
for(j=1; j<=i; j++)
f=f*j;

p=Math.pow(x,k);
sum1=sum1+p1;
k=k+1;
System.out.println("Sum of the Series=" +sum1);

}
}
}