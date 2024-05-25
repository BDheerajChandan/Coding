#include<stdio.h>
#include<math.h>
int main()
{
	int a,b,c,x;
	printf("enter the numbers");
	scanf("%d%d%d%d",&a,&b,&c,&x);
	int p=(a*(x*x))+(b*x)+c;
	printf("the value of p =%d",p);
	return 0;
}
