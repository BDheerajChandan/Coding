#include<stdio.h>
int main()
{
	int n,num,i,sum=0;
	printf("enter the range");
	scanf("%d",&n);
	int a[n];
	printf("enter the elements");
	for(i=0;i<n;i++)
	{
		scanf("%d",&num);
		a[i]=num;
	}
	printf("display sum of elements");
	for(i=0;i<n;i++)
	{
		sum=sum+a[i];
	}
	printf("%d  ",sum);
	return 0;
}
