class Perfect
{
public void Perfect()
{
int a,i,n,s;
for(n=2; n<2000; n++)
{
s=0;
for(i=1; i<=n/2; i++)
{
a=n%i;
if(a==0)
s +=i;
}
if(n==s)
System.out.println(+n);
}
}
}