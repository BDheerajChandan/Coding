class forloop_1
{
public void main()
{
int i, j,n,N,x;
float series;
n=10;
x=2;
series =1;

for(i=2; i<=n; i++)
{
for (j=1; j<=i; j++)
x=x*n;
x=x/n;
if(n%2 == 0)
series = -x;
else
series +=x;
}
System.out.println("sum of Series=" +series);

}
}