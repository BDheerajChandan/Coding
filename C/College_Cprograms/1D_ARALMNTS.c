#include<stdio.h>
int main()
{
	int a[10],j,i,n;
	printf("enter the elements");
	for(i=0;i<10;i++)
	{
		scanf("%d",&n);
		a[i]=n;
	}
	printf("display array elements");
	for(j=0;j<10;j++)
	{
		printf("%d\n",a[j]);
	}
	return 0;
}
