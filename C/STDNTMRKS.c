#include<stdio.h>
int main()
{
	int n,m;
	printf("enter the number of students ");
	printf("enter the number of subjects ");
	scanf("%d%d",&n,&m);
	for(int i=1;i<=n;i++)
	{
		int total=0;
		for(int j=1;j<=m;j++)
		{
			int marks;
			scanf("%d",&marks);
			total=total+marks;
		}
	printf("total marks obtained by %d is %d",i,total);
	}
	return 0;
}
