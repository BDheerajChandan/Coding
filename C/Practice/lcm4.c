#include<stdio.h>
int main()
{
int a,b,c,d;
printf("Enter the values of a,b,c,d\n");
scanf("%d%d%d%d",&a,&b,&c,&d);
int h1,h2;
int p1=a*b;
for(int i=1;i<=p1;i++)
{
if(((a%i)==0)&&((b%i)==0))
{
h1=i;
}
}
int p2=c*d;
for(int j=1;j<=p1;j++)
{
if(((c%j)==0)&&((d%j)==0))
{
h2=j;
}
}
int l1,l2;
l1=p1/h1;
l2=p2/h2;
int p3=l1*l2;
int h3;
for(int j=1;j<=p3;j++)
{
if(((l1%j)==0)&&((l2%j)==0))
{
h3=j;
}
}
int l3=p3/h3;
printf("%d lcm \n",l3);
return 0;
}
