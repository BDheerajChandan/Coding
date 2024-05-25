#include<stdio.h>
int main()
{
	int sum=0,s=0,n;
	printf("enter the range");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		sum=sum+i;
		s=s+sum;
	}		
	printf("sum of series =%d",s);
	return 0;
}
