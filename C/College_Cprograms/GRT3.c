#include<stdio.h>
int main()
{
	int a,b,c;
	printf("enter a number");
	scanf("%d%d%d",&a,&b,&c);
	if((a>b)&&(a>c))
{
	printf("number=%d",a);
}
	if((b>a)&&(b>c))
{
	printf("number=%d",b);
}
	if((c>b)&&(c>a))
{
	printf("number=%d",c);
}
}
