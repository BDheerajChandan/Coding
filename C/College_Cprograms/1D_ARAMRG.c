#include<stdio.h>
int main()
{
	int n,m;
	printf("enter the number of elements in array1");
	scanf("%d",&n);
	printf("enter the number of elements in array2");
	scanf("%d",&m);
	int a[n],b[m],c[m+n];
	printf("enter the elements array 1");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter the elements array 2");
	for(int i=0;i<m;i++)
	{
		scanf("%d",&b[i]);
	}
	printf("array after merging");
	for(int i=0;i<n;i++)
	{
		c[i]=a[i];
	}
	for(int i=0;i<m;i++)
	{
		c[n+i]=b[i];
	}
	for(int i=0;i<(m+n);i++)
	{
		printf("%d , ",c[i]);
	}
	return 0;
}
