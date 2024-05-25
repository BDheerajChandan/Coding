#include<stdio.h>
int main()
{
	int r,c,n;
	printf("enter number of rows and coloumns");
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
	printf("elements in array is\n");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	return 0;
}
