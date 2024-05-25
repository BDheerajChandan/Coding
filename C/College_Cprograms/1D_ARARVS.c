#include<stdio.h>
int main()
{
	int n;
	printf("enter the range");
	scanf("%d",&n);
	int a[n];
	printf("enter the elemnts");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("array is: ");
	for(int i=0;i<n;i++)
	{
		printf("%d  ",a[i]);
	}
	printf("\narray in reverse order is: ");
	for(int i=n-1;i>=0;i--)
	{
		printf("%d  ",a[i]);
	}
	return 0;
}
