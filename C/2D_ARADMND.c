#include<stdio.h>
int main()
{
	int r,c,n;
	printf("enter the number of rows and coloumns");
	scanf("%d%d",&r,&c);
	int a[r][c];
	printf("enter the elements");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			scanf("%d",&n);
			a[i][j]=n;
		}
	}
	printf("array is :\n");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			printf("%d",a[i][j]);
		}
		printf("\n");
	}
	printf("\n\n\n");
	int n1=(r+1)/2,n2=(c+1)/2;
	for(int i=0;i<n1;i++)
	{
		for(int j=i;j<n1-1;j++)
		{
			printf(" ");
		}
		for(int j=n1-i-1;j<n1+i;j++)
		{
			printf("%d",a[i][j]);
		}
		printf("\n");
	}
	for(int i=n2;i<=c;i++)
	{
		for(int j=n2-1;j>i;j--)
		{
			printf(" ");
		}
		for(int j=i;j<=(2*i);j++)
		{
			printf("%d",a[i][j]);
		}
		printf("\n");
	}
	return 0;
}
