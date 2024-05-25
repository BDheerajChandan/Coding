#include<stdio.h>
int main()
{
	int r,c,n;
	printf("enter the number of rows and coloumns\n");
	scanf("%d%d",&r,&c);
	int a[r][c];
	printf("enter the elements\n");
	if(r==c)/*condition for square matrix*/
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				scanf("%d",&n);
				a[i][j]=n;
			}
		}	
	}
	printf("diagonal elements in array\n");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			if(i==j)
			{
				printf("%d ",a[i][j]);
			}
		}
	}	
	return 0;
}
