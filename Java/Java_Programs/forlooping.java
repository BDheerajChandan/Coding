class forlooping
{
public void main()
{
int i, fact,a,n,j;
float sum;
n=10;
a=1;
fact=1;
sum=1;
for(i=1; i<=n; i++)
{
for (j=1;j<=i; j++)
fact = fact*j;
sum=sum+a/fact;
a=1;
fact=1;
}
System.out.println("sum of Series=" +sum);
}
}