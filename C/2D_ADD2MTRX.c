#include<stdio.h>
int main()
{
	int r1,r2,c1,c2,n;
	printf("enter rows and coloumns for array1");
	scanf("%d%d",&r1,&c1);
	printf("enter rows and coloumns for array2");
	scanf("%d%d",&r2,&c2);
	int a[r1][c1],b[r2][c2];
	if((r1==r2)&&(c1==c2))
	{
		int c[r1][c1];
		printf("enter the elements for array 1 and array 2");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				scanf("%d",&n);
				a[i][j]=n;
			}
		}
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				scanf("%d",&n);
				b[i][j]=n;
			}
		}printf("\n\n");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				printf("%d  ",a[i][j]);
			}printf("\n");
		}
		printf("\n");printf("\n");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				printf("%d  ",b[i][j]);
			}printf("\n");
		}printf("\n");printf("\n");
		printf("sum of 2 matrix :\n");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				printf("%d  ",c[i][j]);
			}
			printf("\n");
		}
	}
	return 0;
}
