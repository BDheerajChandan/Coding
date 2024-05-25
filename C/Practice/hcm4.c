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
for(int j=1;j<=p1;j++)
{
if(((c%j)==0)&&((d%j)==0))
{
h2=j;
}
}
int p3=h1*h2;
int h3;
for(int j=1;j<=p3;j++)
{
if(((h1%j)==0)&&((h2%j)==0))
{
h3=j;
}
}
printf("%d hcm \n",h3);
return 0;
}
