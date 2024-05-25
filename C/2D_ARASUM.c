#include<stdio.h>
int main()
{
	int r,c,sum=0,n;
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
	printf("sum of all elements in an array");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			sum=sum+a[i][j];
		}
	}
	printf(" %d",sum);
	return 0;
}
