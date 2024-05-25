#include<stdio.h>
int main()
{
	int sum=0,a=0,b=1,n;
	printf("enter the limit ");
	scanf("%d",&n);
	printf("0 , 1");
	while(n!=0)
	{
		sum=a+b;
		printf(", %d ",sum);
		a=b;
		b=sum;
		n--;
	}
	return 0;
}
