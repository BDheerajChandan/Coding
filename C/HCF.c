#include<stdio.h>
int main()
{
	int a,b,n=1,num;
	printf("enter the numbers for finding HCF \n");
	scanf("%d%d",&a,&b);
	if(a>b)
	{
		num=a;
	}else{
		num=b;
	}
	for(int i=1;i<=num;i++)
	{
		if(((a%i)==0)&&((b%i)==0))
		{
			n=i;
		}
	}
	printf("HCF of two numbers %d %d is %d",a,b,n);
}
